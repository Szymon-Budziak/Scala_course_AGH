object Appl4 {
  def printContInfo(c: Any) = c match {
//    case any   => println("Variable pattern matched, matched: " + any)
    case 1     => println("1 matched")
    case 1.1   => println("1.1 matched")
    case 1.1f  => println("1.1f matched")
    case "42"  => println("'42' matched")
    case true  => println("true matched")
    case false => println("false matched")
    case ()    => println("() matched")
    case any   => println("Variable pattern matched, matched: " + any)
  }

  def main(args: Array[String]): Unit = {
    printContInfo(1)
    printContInfo(1.1)
    printContInfo(1.1f)
    printContInfo("42")
    printContInfo(true)
    printContInfo(false)
    printContInfo(())
    printContInfo(42)
    printContInfo("abc")
    printContInfo(3.14)
  }
}
