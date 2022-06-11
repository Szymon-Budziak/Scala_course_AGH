object Appl641 {
  def main(args: Array[String]): Unit = {
    val namesStr = "tomasz, t, bogdan, anna, Jerzy, j, maria"

    val formStr = namesStr
      .split(",[ ]+")
      .filter(_.length > 1)
      .map(_.capitalize)
      .reduce(_ + ", " + _)
    println(formStr)

    val formStr1 = namesStr.split(",[ ]+")
    println(formStr1.mkString(" "))

    val formStr2 = namesStr.split(",[ ]+").filter(_.length > 1)
    println(formStr2.mkString(" "))

    val formStr3 =
      namesStr.split(",[ ]+").filter(_.length > 1).map(_.capitalize)
    println(formStr3.mkString(" "))

    println(formStr)
  }
}
