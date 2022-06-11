object Appl627 {
  def main(args: Array[String]): Unit = {
    import scala.collection.mutable.ArrayBuffer
    val buf = new ArrayBuffer[Int]()
    buf += 1
    buf += 2
    println(buf.length)
    println(buf(0))
    buf(1) = 20
    println(buf)
    println(buf.toArray.mkString(" "))
  }
}
