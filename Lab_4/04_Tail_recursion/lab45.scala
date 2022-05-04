object Appl45 {
  import scala.annotation.tailrec

  def sumArrayRec2(elems: Array[Int]) = {
//    @tailrec
    def goFrom(i: Int, size: Int, elems: Array[Int]): Int = {
      if (i < size) elems(i) + goFrom(i + 1, size, elems)
      else 0
    }
    goFrom(0, elems.size, elems)
  }

  def sumArrayRec3(elems: Array[Int]) = {
    @tailrec
    def goFrom(i: Int, size: Int, elms: Array[Int], acc: Int): Int = {
      if (i < size) goFrom(i + 1, size, elms, acc + elms(i))
      else acc
    }
    goFrom(0, elems.size, elems, 0)
  }

  def main(args: Array[String]): Unit = {
    println("sumArrayRec3 = " + sumArrayRec3((0 until 30000).toArray))
  }
}
