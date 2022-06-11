object Appl615 {
  def lengthOf[T](xs: List[T]) = {
    @annotation.tailrec
    def iter(ys: List[T], acc: Int): Int = ys match {
      case List()   => acc
      case y :: ys1 => iter(ys1, acc + 1)
    }
    iter(xs, 0)
  }

  def main(args: Array[String]): Unit = {
    val _100To20List =
      for (i <- (20 to 100).toList.reverse if i % 2 == 0) yield i
    println("_100To20List.length -> " + _100To20List.length)
    println("lengthOf(_100To20List) -> " + lengthOf(_100To20List))

    // Zadanie: napisać zestaw testów jednostkowych dla metody lengthOf

    val empty_list = List()
    assert(lengthOf(empty_list) == 0)

    val _3elementsList = List(1, 2, 3)
    assert(lengthOf(_3elementsList) == 3)

    val _1To1e5List = (1 to 100000).toList
    assert(lengthOf(_1To1e5List) == 100000)
  }
}
