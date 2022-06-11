object Appl614 {
  def main(args: Array[String]): Unit = {
    val disivible_by_3 = for (i <- (1 to 300).toList if i % 3 == 0) yield i

    println("disivible_by_3.length -> " + disivible_by_3.length)
    println("disivible_by_3.head -> " + disivible_by_3.head)
    println("disivible_by_3.tail.head -> " + disivible_by_3.tail.head)
    println("disivible_by_3.last -> " + disivible_by_3.last)
  }
}
