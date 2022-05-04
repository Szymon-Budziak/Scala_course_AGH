import scala.annotation.tailrec
import scala.math.pow

object Appl42 {
  def checkPredicate(
      pred: Boolean,
      predAsString: String,
      prefix: String = "Checking if "
  ) = {
    if (pred) println(prefix + predAsString + ": OK")
    else println(prefix + predAsString + ": Fail")
  }

  def sumArrayIter(elems: Array[Int]) = {
    var sum = 0
    for (i <- elems) sum += i
    sum
  }

  def sumArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size) elems(i) + sumArrayRec1(i + 1, elems)
    else 0
  }

  def sumArrayRec2(elems: Array[Int]) = {
    val size = elems.size

    def goFrom(i: Int): Int = {
      if (i < size) elems(i) + goFrom(i + 1)
      else 0
    }

    goFrom(0)
  }

  // sum of squares of array elements
  def sumSqrArrayIter(elems: Array[Int]) = {
    var summary = 0
    for (i <- elems) summary += pow(i, 2).intValue
    summary
  }

  def sumSqrArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size)
      pow(elems(i), 2).intValue + sumSqrArrayRec1(i + 1, elems)
    else 0
  }

  def sumSqrArrayRec2(elems: Array[Int]) = {
    val size = elems.size

    def goFrom(i: Int): Int = {
      if (i < size) pow(elems(i), 2).intValue + goFrom(i + 1)
      else 0
    }

    goFrom(0)
  }

  def sumSqrArrayRec3(elems: Array[Int]) = {
    val size = elems.size
    @tailrec
    def goFrom(i: Int, acc: Int): Int = {
      if (i < size) goFrom(i + 1, acc + pow(elems(i), 2).intValue)
      else acc
    }
    goFrom(0, 0)
  }

  // the product of the array elements
  def prodArrayIter(elems: Array[Int]) = {
    var prod = 1
    for (i <- elems) prod *= i
    prod
  }

  def prodArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size)
      elems(i) * prodArrayRec1(i + 1, elems)
    else 1
  }

  def prodArrayRec2(elems: Array[Int]) = {
    val size = elems.size

    def goFrom(i: Int): Int = {
      if (i < size) elems(i) * goFrom(i + 1)
      else 1
    }

    goFrom(0)
  }

  def prodArrayRec3(elems: Array[Int]) = {
    val size = elems.size
    @tailrec
    def goFrom(i: Int, acc: Int): Int = {
      if (i < size) goFrom(i + 1, acc * elems(i))
      else acc
    }

    goFrom(0, 1)
  }

  // the sum of the absolute values of the array elements
  def sumAbsArrayIter(elems: Array[Int]) = {
    var sum = 0
    for (i <- elems) sum += i.abs
    sum
  }

  def sumAbsArrayRec1(i: Int, elems: Array[Int]): Int = {
    if (i < elems.size)
      elems(i).abs + sumAbsArrayRec1(i + 1, elems)
    else 0
  }

  def sumAbsArrayRec2(elems: Array[Int]) = {
    val size = elems.size

    def goFrom(i: Int): Int = {
      if (i < size) elems(i).abs + goFrom(i + 1)
      else 0
    }
    goFrom(0)
  }

  def sumAbsArrayRec3(elems: Array[Int]) = {
    val size = elems.size
    @tailrec
    def goFrom(i: Int, acc: Int): Int = {
      if (i < size) goFrom(i + 1, acc + elems(i).abs)
      else acc
    }
    goFrom(0, 0)
  }

  def main(args: Array[String]): Unit = {
    val a1To5 = (1 to 5).toArray
    println("Testing with a1To5 = " + a1To5.mkString("Array(", ", ", ") ..."))
    val expectResult = 15
    checkPredicate(
      sumArrayIter(a1To5) == expectResult,
      "sumArrayIter(0, a1To5) == " + expectResult
    )
    checkPredicate(
      sumArrayRec1(0, a1To5) == expectResult,
      "sumArrayRec1(0, a1To5) == " + expectResult
    )
    checkPredicate(
      sumArrayRec2(a1To5) == expectResult,
      "sumArrayRec2(a1To5) == " + expectResult
    )

    val expectedSqrResult = 55
    checkPredicate(
      sumSqrArrayIter(a1To5) == expectedSqrResult,
      "sumSqrArrayIter(a1To5) == " + expectedSqrResult
    )
    checkPredicate(
      sumSqrArrayRec1(0, a1To5) == expectedSqrResult,
      "sumSqrArrayRec1(0, a1To5) == " + expectedSqrResult
    )
    checkPredicate(
      sumSqrArrayRec2(a1To5) == expectedSqrResult,
      "sumSqrArrayRec2(a1To5) == " + expectedSqrResult
    )
    checkPredicate(
      sumSqrArrayRec3(a1To5) == expectedSqrResult,
      "sumSqrArrayRec3(a1To5) == " + expectedSqrResult
    )

    val expectedProdResult = 120
    checkPredicate(
      prodArrayIter(a1To5) == expectedProdResult,
      "prodArrayIter(a1To5) == " + expectedProdResult
    )
    checkPredicate(
      prodArrayRec1(0, a1To5) == expectedProdResult,
      "prodArrayRec1(0, a1To5) == " + expectedProdResult
    )
    checkPredicate(
      prodArrayRec2(a1To5) == expectedProdResult,
      "prodArrayRec2(a1To5) == " + expectedProdResult
    )
    checkPredicate(
      prodArrayRec3(a1To5) == expectedProdResult,
      "prodArrayRec3(a1To5) == " + expectedProdResult
    )

    val expectedAbsResult = 15
    checkPredicate(
      sumAbsArrayIter(a1To5) == expectedAbsResult,
      "sumAbsArrayIter(a1To5) == " + expectedAbsResult
    )
    checkPredicate(
      sumAbsArrayRec1(0, a1To5) == expectedAbsResult,
      "sumAbsArrayRec1(0, a1To5) == " + expectedAbsResult
    )
    checkPredicate(
      sumAbsArrayRec2(a1To5) == expectedAbsResult,
      "sumAbsArrayRec2(a1To5) == " + expectedAbsResult
    )
    checkPredicate(
      sumAbsArrayRec3(a1To5) == expectedAbsResult,
      "sumAbsArrayRec3(a1To5) == " + expectedAbsResult
    )
  }
}
