object Appl57 {
  def binaryOp(a: Int, b: Int, f: (Int, Int) => Int) = f(a, b)

  def main(args: Array[String]): Unit = {
    var aPlusB = binaryOp(6, 2, (a: Int, b: Int) => a + b)
    println("aPlusB: " + aPlusB)

    aPlusB = binaryOp(6, 2, (a, b) => a + b)
    println("aPlusB: " + aPlusB)

    aPlusB = binaryOp(6, 2, (_: Int) + (_: Int))
    println("aPlusB: " + aPlusB)

    aPlusB = binaryOp(6, 2, _ + _)
    println("aPlusB: " + aPlusB)

    val aMinusB = binaryOp(6, 2, _ - _)
    println("aMinusB: " + aMinusB)

    val aTimesB = binaryOp(6, 2, _ * _)
    println("aTimesB: " + aTimesB)

    val aDivB = binaryOp(6, 2, _ / _)
    println("aDivB: " + aDivB)
  }
}
