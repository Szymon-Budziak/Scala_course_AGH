object Appl611 {

  def main(args: Array[String]): Unit = {
    var l123 = 1 :: 2 :: 3 :: Nil
    println("1 :: 2 :: 3 :: Nil -> " + l123)
    l123 = (1 :: (2 :: (3 :: Nil)))
    println("(1 :: (2 :: (3 :: Nil))) -> " + l123)
    l123 = Nil.::(3).::(2).::(1)
    println("Nil.::(3).::(2).::(1) -> " + l123)
    l123 = List(1, 2, 3)
    println("List(1, 2, 3) -> " + l123)
    l123 = new ::(1, List(2, 3))
    println("new ::(1, List(2, 3)) -> " + l123)

//    val l123 = new List(1, 2, 3) // -> error: class List is abstract; cannot be instantiated

    var l3 = 3 :: Nil
    println("3 :: Nil -> " + l3)
    var l23 = 2 :: l3
    println("2 :: l2 -> " + l23)
    l123 = 1 :: l23
    println("1 :: l23 -> " + l123)

    l3 = Nil.::(3)
    println("Nil.::(3) -> " + l3)
    l23 = l3.::(2)
    println("l3.::(2) -> " + l23)
    l123 = l23.::(1)
    println("l123 -> " + l123)

    l3 = new ::(3, Nil)
    println("new ::(3, Nil) -> " + l3)
    l23 = new ::(2, l3)
    println("new ::(2, l3) -> " + l23)
    l123 = new ::(1, l23)
    println("new ::(1, l23) -> " + l123)
  }
}
