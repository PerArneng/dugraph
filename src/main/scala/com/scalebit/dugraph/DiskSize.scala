package com.scalebit.dugraph

import java.nio.file.Path

case class DiskSize(path: Path, size: Int = -1, children: List[DiskSize] = List.empty)
