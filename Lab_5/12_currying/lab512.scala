object Appl512 {
  def sumABC(a: Int, b: Int, c: Int) = a + b + c
  def mCurrSumABC(a: Int)(b: Int)(c: Int) = a + b + c
  def fCurrSumABC = (a: Int) => (b: Int) => (c: Int) => a + b + c
  def newfCurrSumABC: Int => (Int => (Int => Int)) = (a: Int) =>
    (b: Int) => (c: Int) => a + b + c
//  def fCurrSumABC = (a: Int) => ((b: Int) => (c: Int)) => a + b + c // error
//  def fCurrSumABC = ((a: Int) => ((b: Int) => (c: Int))) => a + b + c // error
  def f(ints: Int*)(doubles: Double*)(strings: String*) = {
    for (i <- ints) print(i + " ")
    println()
    for (d <- doubles) print(d + " ")
    println()
    for (s <- strings) print(s + " ")
  }

  def catchingAllExceptions(tryBlock: => Unit) = {
    try {
      tryBlock
    } catch {
      case _: Throwable =>
    }
  }

  def main(args: Array[String]): Unit = {
    println("sumABC(1, 2, 3) = " + sumABC(1, 2, 3))
    val currSumABC = (sumABC _).curried
//    println("currSumABC(1, 2, 3) = " + currSumABC(1, 2, 3)) // error: too many arguments
    println("currSumABC(1)(2)(3) = " + currSumABC(1)(2)(3))
    println("currSumABC { 1 } { 2 } { 3 } = " + currSumABC { 1 } { 2 } { 3 })
    println("currSumABC { 1 }(2) { 3 } = " + currSumABC { 1 }(2) { 3 })

//    println("mCurrSumABC(1, 2, 3) = " + mCurrSumABC(1, 2, 3)) // error: too many arguments
    println("mCurrSumABC(1)(2)(3) = " + mCurrSumABC(1)(2)(3))
    println("mCurrSumABC(1)(2){3} = " + mCurrSumABC(1)(2) { 3 })

    println(
      "f(1, 2, 3, 4)(6.1, 7.1, 8.1, 9.5)(\"abc\", \"def\", \"ghi\")" +
        f(1, 2, 3, 4)(6.1, 7.1, 8.1, 9.5)("abc", "def", "ghi")
    )
    val x = catchingAllExceptions(4)
    println("x = " + x)
    val y = catchingAllExceptions(0)
    println("y = " + y)
    val z = x / y
    println("z = " + z)
  }
}
