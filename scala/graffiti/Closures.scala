package graffiti

object Closures {

  def cons[T, U](a: T, b: U): () => (T, U) = () => (a, b)

  def car[T, U](pair: () => (T, U)): T = pair.apply()._1

  def cdr[T, U](pair: () => (T, U)): U = pair.apply()._2

  def main(args: Array[String]): Unit = {
    val pair = cons('a, 'b)
    val pairPair = cons(cons(0, 1), cons(99, 100))
    println(car(pair))
    println(cdr(pair))
    println(cdr(car(pairPair)))
  }
}
