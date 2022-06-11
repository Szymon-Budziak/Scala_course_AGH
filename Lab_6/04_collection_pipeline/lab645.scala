object Appl645 {
  def main(args: Array[String]): Unit = {
    val lines = List("This is a line of text", "And here the second line")

    val wordCound1 = (0 /: lines
      .flatMap(_.split(" "))
      .map(_.toLowerCase))((acc, e) => acc + 1)
    println(wordCound1)

    val wordCound2 = (0 /: lines
      .flatMap(_.split(""))
      .map(_.toLowerCase)
      .toSet)((acc, e) => acc + 1)
    println(wordCound2)
  }
}
