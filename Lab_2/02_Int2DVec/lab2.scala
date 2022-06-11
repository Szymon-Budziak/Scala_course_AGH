import scala.math._

class Int2DVec private (val x: Int, val y: Int) {
  def +(other: Int2DVec) = new Int2DVec(x + other.x, y + other.y)
  def unary_- = new Int2DVec(-x, -y)
  def -(other: Int2DVec) = new Int2DVec(x - other.x, y - other.y)
  def *(other: Int2DVec) = new Int2DVec(x * other.x, y * other.y)
  override def toString() = "(" + x.toString + "," + y.toString + ")"
  def |-?(other: Int2DVec): Boolean = (x * other.x + y * other.y) == 0

  // Auxiliary constructors
  /*
  def this() = {
    this(0, 0)
    println("Creating Int2DVec(0,0)")
  }

  def this(prototype: Int2DVec) = {
    this(prototype.x, prototype.y)
    println("Copy-constructor working")
  }
   */
}

/*
object Appl {
  def main(agrs: Array[String]) {
    val v1 = new Int2DVec(1, 2)
    val v2 = new Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    val v5 = v1 - v2
    val v6 = v1 * v2
    println(v3)
    println(v4)
    println(v5)
    println(v6)
    println(new Int2DVec)
    println(new Int2DVec(v1 + v1 + v2))
  }
}
 */

object Int2DVec {
  def apply(x: Int, y: Int) = new Int2DVec(x, y)
  def apply() = new Int2DVec(0, 0)
  def apply(prototype: Int2DVec) = new Int2DVec(prototype.x, prototype.y)
  def unitVectorOf(vec: Int2DVec) {
    val n = sqrt(vec.x * vec.x + vec.y * vec.y)
    new Int2DVec((vec.x.toDouble / n).toInt, (vec.y.toDouble / n).toInt)
  }
}

object Appl {
  def main(agrs: Array[String]) {
    val v1 = Int2DVec(1, 2)
    val v2 = Int2DVec(10, 20)
    val v3 = v1 + v2
    val v4 = -v2
    println(v3)
    println(v4)
    println(Int2DVec())
    println(Int2DVec(v1 + v1 + v2))
  }
}
