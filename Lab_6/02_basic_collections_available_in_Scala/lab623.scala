object Appl623 {
  import collection.mutable

  def main(args: Array[String]): Unit = {
    val s123 = Set(1, 2, 3)
    println(s123)
    val s1234 = s123 + 4
    println(s1234)
    val s124 = s1234 - 3
    println(s124)
    val s12456 = s124 ++ List(5, 6)
    println(s12456)
    val s456 = s12456 -- List(1, 2)
    println(s456)
    val s45 = s456 & Set(3, 4, 5)
    println(s45)
    println(s45.size)
    println(s12456.contains(5))
    println(s12456.contains(9))

    val fruits = mutable.Set.empty[String]
    fruits += "apple"
    println(fruits)
    fruits += "pear"
    println(fruits)
    fruits += "plum"
    println(fruits)
    fruits += "orange"
    println(fruits)
    fruits -= "orange"
    println(fruits)
    fruits ++= List("lemon", "banana")
    println(fruits)
    fruits.clear
    println(fruits)

    val ms = collection.mutable.Set.empty ++= collection.immutable.Set(1, 2, 3)
    println(ms)
    val ims = collection.immutable.Set.empty ++ collection.mutable.Set(1, 2, 3)
    println(ims)
  }
}
