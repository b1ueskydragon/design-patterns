package designPatterns.functors

object FunctorsExample {
  def main(args: Array[String]): Unit = {
    val numbers = List(1, 2, 3, 4, 5, 6)
    val mapping = Map(1 -> "one", 2 -> "two", 3 -> "three", 4 -> "four", 5 -> "five", 6 -> "six")

    println(listFunctor.map(numbers)(_ * 2))
    println(listFunctor.map(numbers)(i => (i, mapping(i))))
  }
}
