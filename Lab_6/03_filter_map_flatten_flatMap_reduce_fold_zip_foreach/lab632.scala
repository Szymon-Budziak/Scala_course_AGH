object Appl632 {
  def main(args: Array[String]): Unit = {
    for (e <- Array(1, 2, 3, 4)) print(e * e)
    println(Array(1, 2, 3, 4).map(e => e * e).mkString(" "))
    println(Set("I", "II", "III").map { Map("I" -> 1, "II" -> 2, "III" -> 3) })
    println(List("a", "bb", "ccc").map(e => (e, e.length)))
    println(
      Array(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9))
        .map(e1 => e1.map(e2 => e2 * e2))
        .mkString(" ")
    )
    println(Array(1, 10, 1000, 10000).map(e => e.toString).mkString(" "))
    println(Set(1, 10, 1000, 10000).map(e => e.toDouble))
  }
}
