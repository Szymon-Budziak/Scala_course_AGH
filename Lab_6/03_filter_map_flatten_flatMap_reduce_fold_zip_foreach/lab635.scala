object Appl635 {
  def main(args: Array[String]): Unit = {
    println(List(1, 2, 3, 4).reduce(_ + _))
    println(List(1, 2, 3, 4).reduceLeft(_ + _))
    println(List(1, 2, 3, 4).reduceRight(_ + _))

    println(List(1, 2, 3, 4).reduce(_ * _))
    println(List(1, 2, 3, 4).reduceLeft(_ * _))
    println(List(1, 2, 3, 4).reduceRight(_ * _))

    println(List(1, 2, 3, 4).reduce(_ - _))
    println(List(1, 2, 3, 4).reduceLeft(_ - _))
    println(List(1, 2, 3, 4).reduceRight(_ - _))

    println(List(1, 2, 3, 4).map(_.toDouble).reduce(_ / _))
    println(List(1, 2, 3, 4).map(_.toDouble).reduceLeft(_ / _))
    println(List(1, 2, 3, 4).map(_.toDouble).reduceRight(_ / _))
  }
}
