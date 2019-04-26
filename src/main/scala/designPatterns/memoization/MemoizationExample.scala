package designPatterns.memoization

object MemoizationExample {
  private val (a, b, c) = ("penguin", "dragon", "browny")

  def main(args: Array[String]): Unit = {
    val hasher = new Hasher
    println(s"""$a -> ${hasher.mem(a)}""")
    println(s"""$b -> ${hasher.mem(b)}""")
    println(s"""$a -> ${hasher.mem(a)}""")
    println(s"""$c -> ${hasher.mem(c)}""")
    println(s"""$b -> ${hasher.mem(b)}""")
  }
}
