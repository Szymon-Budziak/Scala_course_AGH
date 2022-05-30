object Appl51 {
  class NumOps {
    def succ(a: Int) = a + 1
    def pred(a: Int) = a - 1
    def maxFrom3(d1: Double, d2: Double, d3: Double): Double = {
      if (d1 > d2) {
        if (d1 > d3)
          d1
        else
          d3
      } else {
        if (d2 > d3)
          d2
        else
          d3
      }
    }
  }
  class Succ extends Function1[Int, Int] {
    override def apply(a: Int): Int = a + 1
  }

  class Pred extends Function1[Int, Int] {
    override def apply(a: Int): Int = a - 1
  }
  class MaxFrom3 {
    def apply(d1: Double, d2: Double, d3: Double): Double = {
      if (d1 > d2) {
        if (d1 > d3)
          d1
        else
          d3
      } else {
        if (d2 > d3)
          d2
        else
          d3
      }
    }
  }
  def main(args: Array[String]): Unit = {
    val numOps = new NumOps
    var after5 = numOps.succ(5)
    println(after5)
    var before5 = numOps.pred(5)
    println(before5)
    var max_from3 = numOps.maxFrom3(3, 2, 10)
    println(max_from3)

    val succ = new Succ
    after5 = succ.apply(5)
    println(after5)
    after5 = succ(5)
    println(after5)

    val pred = new Pred
    before5 = pred.apply(5)
    println(before5)
    before5 = pred(5)
    println(before5)

    val max = new MaxFrom3
    max_from3 = max.apply(4, 7, 2)
    println(max_from3)
    max_from3 = max.apply(11, 7, 2)
    println(max_from3)
  }
}
