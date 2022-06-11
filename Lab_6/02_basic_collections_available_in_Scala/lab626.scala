object Appl626 {
  def main(args: Array[String]): Unit = {
    val t3 = (1, "a", 1.5)
    println(t3)
    println(t3._1)
    println(t3._2)
    println(t3._3)
    val (i, s, _) = t3
//    t3 = (2, "b", 2.5) // error: reassignment to val
//    t3._1 = 2 // error: reassignment to val
//    t3._2 = "b" // error: reassignment to val
//    t3._3 = 2.5 // error: reassignment to val
  }
}
