object Appl52 {
  def main(args: Array[String]): Unit = {
//    val succ: (a: Int) = a + 1
//    val succ = (a: Int) = a + 1
//    val succ => (a: Int) = a + 1
//    val succ: (a: Int) => Int = (a: Int) = a + 1
//    val succ: (a: Int) => Int = (a: Int) => a + 1
    var succ: (Int) => Int = (a: Int) => a + 1
    println(succ(5))
    var succ2: Int => Int =
      (a: Int) =>
        a + 1 // uwaga: opuszczenie nawiasów możliwe tylko dla funkcji jednoparametrowych
    println(succ2(5))
    var succ3 = (a: Int) => a + 1
    println(succ3(5))

    var pred: (Int) => Int = (a: Int) => a - 1
    println(pred(5))
    var pred2: Int => Int = (a: Int) => a - 1
    println(pred2(5))
    var pred3 = (a: Int) => a - 1
    println(pred3(5))

    var maxFrom3: (Double, Double, Double) => Double = {
      (d1: Double, d2: Double, d3: Double) =>
        {
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
    println(maxFrom3(11, 4, 8))
    var maxFrom3_2 = (d1: Double, d2: Double, d3: Double) => {
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
    println(maxFrom3_2(8, 20, 1))
  }
}
