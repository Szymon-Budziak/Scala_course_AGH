object Appl58 {
  def df(f: Double => Double, h: Double): Double => Double = { (x: Double) =>
    (f(x + h) - f(x - h)) / (2 * h)
  }

  def main(args: Array[String]): Unit = {
    var freeVar = 0
    println("[1]: freeVar = " + freeVar)
    val f1 = (boundVar: Int) => {
      println(
        "[Inside f1]: freeVar = " +
          freeVar + ", boundVar = " + boundVar
      )
      freeVar += 1
    }
    println("[2]: freeVar = " + freeVar)

    f1(5)
    println("[3]: freeVar = " + freeVar)

    freeVar += 10
    println("[4]: freeVar = " + freeVar)

    f1(10)
    println("[5]: freeVar = " + freeVar)

    val dSqrAppx = df((x: Double) => x * x, h = 1e-6)
    val dSqrExact = (x: Double) => 2 * x

    for (x <- 0.0 to 2.0 by 0.2 d = math.abs(dSqrExact(x) - dSqrAppx(x)))
      println(f"x = $x%2.1f, delta = $d")
  }
}
