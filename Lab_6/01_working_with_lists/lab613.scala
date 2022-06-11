object Appl613 {

  def main(args: Array[String]): Unit = {
    println("List(1, 2, 3).head -> " + List(1, 2, 3).head)
    println("List(1, 2, 3).tail -> " + List(1, 2, 3).tail)
    println("(1 :: 2 :: 3 :: Nil).head -> " + (1 :: 2 :: 3 :: Nil).head)
    println("(1 :: 2 :: 3 :: Nil).tail -> " + (1 :: 2 :: 3 :: Nil).tail)
    println("(1 :: 2 :: 3 :: Nil).last -> " + (1 :: 2 :: 3 :: Nil).last)

//    List(1).tail.tail // UnsupportedOperationException: tail of empty list
//    List().head // -> NoSuchElementException: head of empty list
//    List().tail // -> UnsupportedOperationException: tail of empty list
//    List().last // -> NoSuchElementException
//    Nil.head // -> NoSuchElementException: head of empty list
//    Nil.tail // -> UnsupportedOperationException: tail of empty list
//    1 :: 2 :: 3 :: Nil.tail // -> UnsupportedOperationException: tail of empty list

    val _1To1e6List = (1 to 1000000).toList
    println("_1To1e6List.head -> " + _1To1e6List.head)
    _1To1e6List.tail // to long to display

//    val _1To1e7List = (1 to 10000000).toList // java.lang.OutOfMemoryError: Java heap space

    val _1To100List = (1 to 100).toList
    println("_1To100List.tail.head ->" + _1To100List.tail.head)
    println("_1To100List.tail.tail.head -> " + _1To100List.tail.tail.head)
    println("_1To100List.last -> " + _1To100List.last)
//    _1To100List.tail.tail.head.head // error: value head is not a member of Int

    val even1to1e3List = for (i <- (1 to 1000).toList if i % 2 == 0) yield i
    println("even1to1e3List.head -> " + even1to1e3List.head)
    println("even1to1e3List.tail -> " + even1to1e3List.tail)
    println("even1to1e3List.last -> " + even1to1e3List.last)
  }
}
