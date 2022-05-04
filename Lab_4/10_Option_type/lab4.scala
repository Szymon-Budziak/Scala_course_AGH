object Appl4 {
  def wrap(s: String) = s match {
    case s if (s != null) => Some(s)
    case _                => None
  }

  import scala.language.implicitConversions
  implicit def unwrap(opt: Option[String]) = opt match {
    case Some(s) => s
    case None    => ""
  }

  def main(args: Array[String]): Unit = {
    println(wrap("abc"))
    println(wrap(""))
    println(wrap(null))
    val a1 = Array("s1", "s2", null, "s3")
    //    val s1Lengts = for (s <- a1) yield s.length // java.lang.NullPointerException
    val a1Safe = for (s <- a1) yield wrap(s)
    val s1Lengts1 = for (s <- a1Safe) yield unwrap(s).length
    val s1Lengts2 = for (s <- a1Safe) yield s.length
  }
}
