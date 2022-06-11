object Appl612 {

  def main(args: Array[String]): Unit = {
    var labcd = "a" :: "bb" :: "ccc" :: "dddd" :: Nil
    println("\"a\" :: \"bb\" :: \"ccc\" :: \"dddd\" :: Nil -> " + labcd)
    labcd = ("a" :: ("bb" :: ("ccc" :: ("dddd" :: Nil))))
    println("(\"a\" :: (\"bb\" :: (\"ccc\" :: (\"dddd\"::Nil))) -> " + labcd)
    labcd = Nil.::("dddd").::("ccc").::("bb").::("a")
    println("Nil.::(\"dddd\").::(\"ccc\").::(\"bb\").::(\"a\") -> " + labcd)
    labcd = List("a", "bb", "ccc", "dddd")
    println("List(\"a\", \"bb\", \"ccc\", \"dddd\") -> " + labcd)

    var ld = "dddd" :: Nil
    println("\"dddd\" :: Nil -> " + ld)
    var lcd = "ccc" :: ld
    println("\"ccc\" :: ld -> " + lcd)
    var lbcd = "bb" :: lcd
    println("\"bb\" :: lcd -> " + lbcd)
    labcd = "a" :: lbcd
    println("\"a\" :: lbcd -> " + labcd)

    ld = Nil.::("dddd")
    println("Nil.::(\"dddd\") -> " + ld)
    lcd = ld.::("ccc")
    println("ld.::(\"ccc\") -> " + lcd)
    lbcd = lcd.::("bb")
    println("lcd.::(\"bb\") -> " + lbcd)
    labcd = lbcd.::("a")
    println("lbcd.::(\"a\" -> " + labcd)

    ld = new ::("dddd", Nil)
    println("new ::(\"dddd\", Nil) -> " + ld)
    lcd = new ::("ccc", ld)
    println("new ::(\"ccc\", ld) -> " + lcd)
    lbcd = new ::("bb", lcd)
    println("new ::(\"bb\", lcd) -> " + lbcd)
    labcd = new ::("a", lbcd)
    println("new ::(\"a\", lbcd) -> " + labcd)
  }
}
