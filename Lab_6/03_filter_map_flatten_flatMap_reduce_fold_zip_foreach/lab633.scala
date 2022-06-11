object Appl633 {
  def main(args: Array[String]): Unit = {
    val s3 = Set(Array(List(1, 2), List(3, 4)), Array(List(5, 6), List(7, 8)))
    println(s3)
    println(s3.flatten)
    println(s3.flatten.flatten)

//    s3.flatten.flatten.flatten // error: No implicit view available from Int => scala.collection.IterableOnce[B]
//    Array(1, 2, 3, 4, 5).flatten // error: No implicit view available from Int => scala.collection.IterableOnce[B]
  }
}
