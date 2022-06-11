object Appl625 {
  def main(args: Array[String]): Unit = {
    import scala.collection.immutable.TreeSet
    val tree_set = TreeSet(9, 3, 1, 8, 0, 2, 7, 4, 6, 5)
    println(tree_set)

    import scala.collection.immutable.TreeMap
    val tree_map = TreeMap(3 -> "III", 1 -> "I", 4 -> "IV")
    println(tree_map)
  }
}
