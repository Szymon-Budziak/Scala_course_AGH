object Appl55 {
  def f1(f: () => Int) = println("The number is: " + f())
  def f2(f: Unit => Int) = println("The number is: " + f(()))
  def f3(f: => Int) = println("The number is: " + f)

  def main(args: Array[String]): Unit = {
    println(f1(1)) // error: type mismatch;
    println(f1({ val x = 1; x })) // error: type mismatch;
    println(f1(() => 1))

    println(f2(1)) // error: type mismatch;
    println(f2({ val x = 1; x })) // error: type mismatch;
    println(f2(() => 1)) // error: type mismatch;
    println(f2(_: Unit => 1))
    println(f2((_: Unit) => 1))

    println(f3(1))
    println(f3({ val x = 1; x }))
    println(f3(() => 1)) // error: type mismatch;
    println(f3(_: Unit => 1)) // error: type mismatch;
    println(f3((_: Unit) => 1)) // error: type mismatch;
  }
}
