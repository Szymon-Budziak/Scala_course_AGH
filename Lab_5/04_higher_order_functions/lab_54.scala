import scala.math
object Appl54 {
  def df(f: Double => Double) = { (x: Double) =>
    {
      val h = 1e-3
      (f(x + h) - f(x)) / h
    }
  }
  val sqr = (x: Double) => x * x
  val dSqrExact = (x: Double) => 2 * x

  def main(args: Array[String]): Unit = {
    val dSqrAppx = df(sqr)
    for (x <- 0.0 to 2.0 by 0.2; d = math.abs(dSqrAppx(x) - dSqrExact(x)))
      println(f"x = $x, delta = $d")
  }
}
