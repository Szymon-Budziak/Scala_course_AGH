object Appl636 {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3, 4).fold(0)(_ + _))
    println(List(1, 2, 3, 4).foldLeft(0)(_ + _))
    println(List(1, 2, 3, 4).foldRight(0)(_ + _))
    println((0 /: List(1, 2, 3, 4))(_ + _))
    println((List(1, 2, 3, 4) :\ 0)(_ + _))

    println(List(1, 2, 3, 4).fold(0)(_ - _))
    println(List(1, 2, 3, 4).foldLeft(0)(_ - _))
    println(List(1, 2, 3, 4).foldRight(0)(_ - _))
    println((0 /: List(1, 2, 3, 4))(_ - _))
    println((List(1, 2, 3, 4) :\ 0)(_ - _))

    println(List(1, 2, 3, 4).fold(1)(_ * _))
    println(List(1, 2, 3, 4).foldLeft(1)(_ * _))
    println(List(1, 2, 3, 4).foldRight(1)(_ * _))
    println((1 /: List(1, 2, 3, 4))(_ * _))
    println((List(1, 2, 3, 4) :\ 1)(_ * _))

//    println(List(1, 2, 3, 4).map(_.toDouble).fold(1)(_ / _)) // error: value / is not a member of AnyVal

    println(List(1, 2, 3, 4).map(_.toDouble).fold(1.0)(_ / _))
    println(List(1, 2, 3, 4).map(_.toDouble).foldLeft(1.0)(_ / _))
    println(List(1, 2, 3, 4).map(_.toDouble).foldRight(1.0)(_ / _))
    println((1.0 /: List(1, 2, 3, 4))(_ / _))
    println((List(1, 2, 3, 4) :\ 1.0)(_ / _))

    println(("z" /: List("1", "2", "3"))(_ + " f " + _))
    println(("z" /: List("1", "2", "3"))("(" + _ + " f " + _ + ")"))

    println((List("1", "2", "3") :\ "z")(_ + " f " + _))
    println((List("1", "2", "3") :\ "z")("(" + _ + " f " + _ + ")"))

    println((List(1, 2, 3) :\ List[Int]())((head, tail) => head :: tail))
    println((List(1, 2, 3) :\ List[Int]())((head, tail) => 2 * head :: tail))
    println(
      (List(List(1, 2, 3), List(4, 5, 6), List(7, 8, 9)) :\ List[Int]())(
        _ ::: _
      )
    )
  }
}
