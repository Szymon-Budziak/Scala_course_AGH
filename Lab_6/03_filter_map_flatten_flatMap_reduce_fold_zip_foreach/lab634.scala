object Appl634 {
  def main(args: Array[String]): Unit = {
    val s3 = Set(Array(List(1, 2), List(3, 4)), Array(List(5, 6), List(7, 8)))

    println(s3.flatMap(e => e).flatMap(e => e))

    println(s3.flatMap(e1 => e1.flatMap(e2 => e2.map(e3 => e3 * e3))))

    for (
      i <- (1 to 3).toList;
      j <- (1 to 2).toList
    ) print(i, j)

    println()

    println((1 to 3).toList.flatMap(i => (1 to 2).toList.map(j => (i, j))))

    println((1 to 3).toList.map(i => (1 to 2).toList.map(j => (i, j))))

    println((1 to 3).toList.map(i => (1 to 2).toList.map(j => (i, j))).flatten)

    for (i <- (1 to 3).toList; j <- (1 to 2).toList if (i * j % 2 == 0)) {
      print(i, j)
    }

    println()

    println(
      (1 to 3).toList.flatMap(i =>
        (1 to 2).toList.withFilter(j => i * j % 2 == 0).map(j => (i, j))
      )
    )
  }
}
