object Appl511 {
  def f(x: Int) = x + 3

  def g(x: Int) = x * x

  def main(args: Array[String]): Unit = {
    val f_o_g = f _ compose g _
    println("f_o_g(5) = " + f_o_g(5))

    val fAndThenG = f _ andThen g _
    println("fAndThenG(5) = " + fAndThenG(5))
  }
}
