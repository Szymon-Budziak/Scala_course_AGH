object Appl644 {
  def main(args: Array[String]): Unit = {
    val lines = List("This is a line of text", "And here the second line")

    val wordCound1 = lines
      .flatMap(_.split(" "))
      .map(_.toLowerCase)
      .foldLeft(0)((acc, e) => acc + 1)
    println(wordCound1)

    val wordCound11 = lines.flatMap(_.split(" "))
    println(wordCound11)

    val wordCound12 = lines.flatMap(_.split(" ")).map(_.toLowerCase)
    println(wordCound12)

    println(wordCound1)
    println()

    val wordCound2 = lines
      .flatMap(_.split(""))
      .map(_.toLowerCase)
      .toSet
      .foldLeft(0)((acc, e) => acc + 1)
    println(wordCound2)

    val wordCound21 = lines.flatMap(_.split(""))
    println(wordCound21)

    val wordCound22 = lines.flatMap(_.split("")).map(_.toLowerCase)
    println(wordCound22)

    val wordCound23 = lines.flatMap(_.split("")).map(_.toLowerCase).toSet
    println(wordCound23)

    println(wordCound2)
  }
}
