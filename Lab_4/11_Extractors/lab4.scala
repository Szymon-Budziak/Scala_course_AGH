object Appl4 {
  abstract class Expr
  class Number(val num: Double) extends Expr
  class UnOp(val operator: String, val arg: Expr) extends Expr

  object Number {
    def apply(num: Double) = new Number(num)
    def unapply(e: Number): Option[Double] =
      if (e != null) Some(e.num) else None
  }

  object UnOp {
    def apply(op: String, arg: Expr) = new UnOp(op, arg)
    def unapply(op: UnOp): Option[(String, Expr)] =
      if (op != null) Some((op.operator, op.arg)) else None
  }

  def handleExpr(e: Expr) = e match {
    case Number(num) => println("Number matched, num = " + num)
    case UnOp(op, _) => println("UnOp matched, operator = " + op)
    case _           => println("Default handler...")
  }

  def main(args: Array[String]): Unit = {
    handleExpr(Number(10))
    handleExpr(UnOp("+", Number(10)))
  }
}
