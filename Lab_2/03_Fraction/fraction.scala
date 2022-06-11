trait Fraction {
  val num: Int
  val denom: Int
  def *(other: Fraction): Fraction
  def +(other: Fraction): Fraction
  def -(other: Fraction): Fraction
  def /(other: Fraction): Any
}

trait Loggable {
  def log(timeStamp: Long, msg: String) =
    println("[" + timeStamp.toString + "]: " + msg)
}

trait Simplifiable {
  def gcd(a: Int, b: Int): Int
  def simplestForm(frac: Fraction): Fraction
}

object Fraction {
  // one of the "creational patterns/idioms"
  def apply(num: Int, denom: Int, loggable: Boolean = false): Fraction =
    if (loggable) new LoggableImpl(num, denom)
    else new DefaultImpl(num, denom)

  private class DefaultImpl(val num: Int, val denom: Int) extends Fraction {
    override def *(other: Fraction): Fraction = {
      Fraction(this.num * other.num, this.denom * other.denom)
      // simplestForm(frac)
    }

    override def +(other: Fraction): Fraction = {
      Fraction(
        this.num * other.denom + other.num * this.denom,
        this.denom * other.denom
      )
      // simplestForm(frac)
    }

    override def -(other: Fraction): Fraction = {
      Fraction(
        this.num * other.denom - other.num * this.denom,
        this.denom * other.denom
      )
      // simplestForm(frac)
    }

    override def /(other: Fraction): Any = {
      if (other.num != 0) {
        Fraction(this.num * other.denom, this.denom * other.num)
        // simplestForm(frac)
      }
    }

    override def toString() = num.toString + "/" + denom.toString
  }

  private class LoggableImpl(num: Int, denom: Int)
      extends DefaultImpl(num, denom)
      with Loggable {
    def timeStamp = System.nanoTime // to keep the example short...
    override def *(other: Fraction): Fraction = {
      log(timeStamp, "multiplying " + this.toString + " by " + other.toString)
      // super.*(other) is not loggable
      Fraction(this.num * other.num, this.denom * other.denom, true)
    }

    override def +(other: Fraction): Fraction = {
      log(timeStamp, "adding " + other.toString + " to " + this.toString)
      Fraction(
        this.num * other.denom + other.num * this.denom,
        this.denom * other.denom,
        true
      )
    }

    override def -(other: Fraction): Fraction = {
      log(timeStamp, "subtracting " + other.toString + " from " + this.toString)
      Fraction(
        this.num * other.denom - other.num * this.denom,
        this.denom * other.denom,
        true
      )
    }

    override def /(other: Fraction): Any = {
      log(timeStamp, "dividing " + this.toString + " by " + other.toString)
      if (other.num != 0)
        Fraction(this.num * other.denom, this.denom * other.num, true)
    }
  }
}

object Appl {
  def gcd(a: Int, b: Int): Int = {
    if (b == 0)
      return a
    gcd(b, a % b)
  }

  def simplestForm(frac: Fraction): Fraction = {
    val d = gcd(frac.num, frac.denom)
    val numerator = (frac.num / d)
    val denominator = frac.denom / d
    Fraction(numerator, denominator)
  }

  def main(agrs: Array[String]) {
    val f1 = Fraction(3, 7)
    val f2 = Fraction(4, 9)
    val f3 = Fraction(1, 19, true)
    val f1f2 = f1 * f2

    println(f1.toString + " * " + f2.toString + " = " + f1f2)
    println(
      f3.toString + " * " + f2.toString + " * " + f1.toString + " = " + f3 * f2 * f1
    )
    println(f1.toString + " + " + f2.toString + " = " + (f1 + f2))
    println(f1.toString + " - " + f2.toString + " = " + (f1 - f2))
    println(f1.toString + " / " + f2.toString + " = " + (f1 / f2))
    println(simplestForm(Fraction(2, 4)))
  }
}
