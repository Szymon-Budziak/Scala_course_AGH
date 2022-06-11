object Appl631 {
  def main(args: Array[String]): Unit = {
    val s67 = Set(1, 2, 3, 4, 5, 6, 7).filter(_ > 5)
    println(s67)
    val a1 = Array("Scala", "Clojure", "Groovy", "Java").filter(_.length > 4)
    println(a1.mkString(" "))
    val vWithN =
      Map("blue" -> "niebieski", "white" -> "biały", "red" -> "czerwony")
        .filter { case (_, v) => v.contains("n") }
    println(vWithN)
  }
}
