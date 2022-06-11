object Appl637 {
  def main(args: Array[String]): Unit = {
    List(1, 2, 3).foreach(e => println(e))
    Array("a", "bb", "ccc").foreach(e => println(e.length))

    println(List(1, 2, 3).zip(Array("a", "b")))
    println(List(1, 2, 3).flatMap(e1 => Array("a", "b").map(e2 => (e1, e2))))
    println(List(1, 2, 3).zip(Array("a", "b")).unzip)

    val l1 = List("a", "b", "c", "d")
    val l1WithIndices = l1.zip(l1.indices)
    println(l1WithIndices)
    println(List("a", "b", "c", "d").zipWithIndex)

    println(l1.zip(l1.indices.map(_ + 1)))
  }
}
