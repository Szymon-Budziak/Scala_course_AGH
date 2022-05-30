object Appl59 {
  val identForInts = new PartialFunction[Double, Double] {
    def apply(x: Double) = if (x == x.toInt) x else Double.NaN
    def isDefinedAt(x: Double) = (x == x.toInt)
  }

//  val identForInts: PartialFunction[Double, Double] = {
//    case x if x == x.toInt => x
//  } // scala.MatchError:

  def main(args: Array[String]): Unit = {
    println(identForInts.isDefinedAt(1.0))
    println(identForInts.isDefinedAt(1.3))
    println(identForInts.apply(1.0))
    println(identForInts(1.0))
    println(identForInts(1.5))
    println(identForInts.applyOrElse(1.0, (_: Double) => Double.NaN))
    println(identForInts.applyOrElse(1.5, (_: Double) => Double.NaN))
  }
}
