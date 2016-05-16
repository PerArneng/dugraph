package com.scalebit.dugraph

import java.nio.file.{Files, Path, Paths}

import scala.collection.JavaConverters
import scala.collection.JavaConverters._


object Main {

  def getSizeOnDisk(path:Path) : DiskSize = {

    /*
    Files.list(path).forEach(path =>

    )*/

    new DiskSize(path, 0)
  }

  def main(args: Array[String]) {
    println("dugraph");

    val dir = args.toList.headOption.getOrElse(".")

    val size = getSizeOnDisk(Paths.get(dir))
    println(s"size: ${size.size}")

  }

}
