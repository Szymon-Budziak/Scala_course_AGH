import utils._

object Appl {
  def readFile(fileName: String, outputFileName: String): Unit = try {
    println("Opening input file...")
    val inFile = scala.io.Source.fromFile(fileName)
    println("Opening output file...")
    val outFile = new java.io.PrintWriter(outputFileName)
    try {
      for (login <- inFile.getLines) {
        val passwd: String = PasswdGen.nextPasswd(10)
        outFile.println(login + ":" + passwd)
      }
    } finally {
      println("Closing input file...")
      inFile.close
      println("Closing output file...")
      outFile.close
    }
  } catch {
    case ex: java.io.FileNotFoundException => println(ex.getMessage)
    case ex: Throwable =>
      println("Default exception handler: " + ex.getMessage)
  }

  def main(args: Array[String]): Unit = {
    if (args.length == 2)
      readFile(args(0), args(1))
    else
      readFile("logins.txt", "login-passwds.txt")
  }
}
