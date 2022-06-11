object Appl643 {
  def main(args: Array[String]): Unit = {
    val prodPrices = Map("A" -> 100, "B" -> 500, "C" -> 1000)
    val products = List("A", "B", "C")
    val totalDiscount = products
      .filter(prodPrices(_) > 499)
      .map(e => {
        val pr = prodPrices(e)
        if (pr > 999) pr * 0.3 else pr * 0.1
      })
      .reduce(_ + _)
    println(totalDiscount)

    val totalDiscount1 = products.filter(prodPrices(_) > 499)
    println(totalDiscount1)

    val totalDiscount2 = products
      .filter(prodPrices(_) > 499)
      .map(e => {
        val pr = prodPrices(e)
        if (pr > 999) pr * 0.3 else pr * 0.1
      })
    println(totalDiscount2)

    println(totalDiscount)
  }
}
