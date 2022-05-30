object Appl510 {
  def sum(a: Int, b: Int, c: Int) = a + b + c

  def main(args: Array[String]): Unit = {
    println("sum(1, 2, 3) = " + sum(1, 2, 3))
    val sumABC = sum _
    val aPlus = sumABC(1, _: Int, _: Int)
    val aPlusBPlus = aPlus(2, _: Int)
    val aPlusBPlusC = aPlusBPlus(3)
    println("aPlusBPlusC = " + aPlusBPlusC)
  }
}
