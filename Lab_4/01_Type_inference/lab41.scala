import scala.annotation.tailrec

object Appl41 {
  def factorial(n: Int): Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) 1
    else n * factorial(n - 1)
  }

  def factorialTailRec(n: Int): Int = {
    assert(n >= 0)
    @tailrec
    def goFrom(i: Int, acc: Int): Int = {
      if (i == 0 || i == 1) acc
      else goFrom(i - 1, i * acc)
    }
    goFrom(n, 1)
  }

  def fibb(n: Int): Int = {
    assert(n >= 0)
    if (n == 0 || n == 1) n
    else fibb(n - 2) + fibb(n - 1)
  }

  def fibTailRec(n: Int): Int = {
    assert(n >= 0)
    @tailrec
    def goFrom(i: Int, prev: Int, curr: Int): Int = {
      if (i == 0) curr
      else goFrom(i - 1, prev + curr, prev)
    }
    goFrom(n, 1, 0)
  }

  def main(args: Array[String]): Unit = {
    println("5! = " + factorial(5))
    println("5! = " + factorialTailRec(5))
    println("Fibb(10) = " + fibb(10))
    println("FibbTailRec(10) = " + fibTailRec(10))
  }
}
