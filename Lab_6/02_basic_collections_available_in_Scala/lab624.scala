object Appl624 {
  def main(args: Array[String]): Unit = {
    var romanToArabic = Map("I" -> 1, "II" -> 2)
    println(romanToArabic)
    romanToArabic = romanToArabic + ("VI" -> 6)
    println(romanToArabic)
    romanToArabic = romanToArabic - "I"
    println(romanToArabic)
    romanToArabic = romanToArabic ++ List("III" -> 3, "V" -> 5)
    println(romanToArabic)
    romanToArabic = romanToArabic -- List("I", "II")
    println(romanToArabic)
    println(romanToArabic.size)
    println(romanToArabic.contains("I"))
    println(romanToArabic.contains("L"))
//    romanToArabic("I") // NoSuchElementException: key not found: I
    println(romanToArabic.keys)
    println(romanToArabic.keySet)
    println(romanToArabic.values)
    println(romanToArabic.isEmpty)

    import scala.collection.mutable
    var newRomanToArabic = mutable.Map.empty[String, Int]
    newRomanToArabic += ("I" -> 1)
    println(newRomanToArabic)
    newRomanToArabic += ("II" -> 2)
    println(newRomanToArabic)
    newRomanToArabic -= "II"
    println(newRomanToArabic)
    newRomanToArabic ++= List("II" -> 2, "III" -> 3, "IV" -> 4)
    println(newRomanToArabic)
    newRomanToArabic --= List("III", "IV")
    println(newRomanToArabic)

    val immutMap = collection.immutable.Map.empty ++
      collection.mutable.Map("I" -> 1, "II" -> 2)
    println(immutMap)
    val mutMap = collection.mutable.Map.empty ++=
      collection.immutable.Map("I" -> 1, "II" -> 2)
    println(mutMap)
  }
}
