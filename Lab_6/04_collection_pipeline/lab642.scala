object Appl642 {
  def main(args: Array[String]): Unit = {
    val numOfDiffLetters =
      List("Trzynastu", "musi", "pójść").mkString.toLowerCase.toSet.size
    println(numOfDiffLetters)

    val numOfDiffLetters1 = List("Trzynastu", "musi", "pójść").mkString
    println(numOfDiffLetters1)

    val numOfDiffLetters2 =
      List("Trzynastu", "musi", "pójść").mkString.toLowerCase
    println(numOfDiffLetters2)

    val numOfDiffLetters3 =
      List("Trzynastu", "musi", "pójść").mkString.toLowerCase.toSet
    println(numOfDiffLetters3)

    println(numOfDiffLetters)
  }
}
