object Appl622 {

  def main(args: Array[String]): Unit = {
    val a1 = new Array[Int](3)
    println(a1.mkString)
    val a2 = Array(3)
    println(a2.mkString)
    a1(1) = a2(0)
    println(a1.mkString)

    val a3 = Array(1, 2, 3, 4, 5)
    println(a3.head)
    println(a3.tail.mkString)
    println(a3.tail.head)
    println(a3.tail.tail.mkString)
    println(a3.last)

    println(a3.take(2).mkString)
    println(a3.drop(3).mkString)
    println(a3 splitAt 2)

    println(a3.find(_ > 3))
    println(a3.find(_ > 3).get)
    println(a3.takeWhile(_ < 4).mkString)
    println(a3.dropWhile(_ < 3).mkString)
  }
}
