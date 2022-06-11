case class CC(x: Int)

case object O1 { val x = 2 }

// 1st example
// class C1(val x: Int)
// class SubC1(x: Int) extends C1(x)

// 2nd example
// class C1(val x: Int)
// case class SubC1(y: Int) extends C1(y)

// 3rd example
// case class C1(x: Int)
// class SubC1(x: Int) extends C1(x)

// 4rd example
// case class C1(x: Int)
// case class SubC1(x: Int) extends C1(x)

object Appl {
  def main(args: Array[String]) {
    (new C1).f(3)
  }
}
