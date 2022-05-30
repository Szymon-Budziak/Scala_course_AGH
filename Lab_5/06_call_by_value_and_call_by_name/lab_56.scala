object Appl56 {
  def f(argByVal: Long, argByName: Long) {
    Thread.sleep(1000)
    println("In function: " + argByVal + ", " + argByName)
  }
  def printNTimes(toPrint: Int, n: Int): Unit =
    for (i <- 1 to n) println(toPrint)

  def printNTimes(toPrint: => Int, n: Int): Unit =
    for (i <- 1 to n) println(toPrint)

  def main(args: Array[String]): Unit = {
    println("Before: " + System.currentTimeMillis)
    f(System.currentTimeMillis(), System.currentTimeMillis())
    println("After: " + System.currentTimeMillis)

    printNTimes(scala.util.Random.nextInt, 3)

    printNTimes(scala.util.Random.nextInt, 3)
  }
}
