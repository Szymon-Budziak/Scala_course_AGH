object Appl621 {

  def main(args: Array[String]): Unit = {
    val abcde = List("a", "b", "c", "d", "e")
    println(abcde take 2)
    println(abcde drop 2)
    println(abcde.dropWhile(_ != "c"))
    println(abcde.init)
    println(abcde splitAt 2)
    println(abcde.indices)
    println(abcde.toString)
    println(abcde mkString "")
    println(abcde.mkString)
    println(abcde.toArray)

    println(abcde.find(_ == "d"))
    println(abcde.find(_ == "f"))

    val it = abcde.iterator
    println(it.next)
    println(it.next)
    println(it.next)
  }
}
