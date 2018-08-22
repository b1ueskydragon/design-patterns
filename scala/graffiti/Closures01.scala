package graffiti

object Closures01 {

  def cons[T, U](a: T, b: U) = (p: (T, U) => _) => p(a, b)

  def car[T, U](p: ((T, U) => _) => _) = p((a: T, b: U) => a)

  def cdr[T, U](p: ((T, U) => _) => _)  = p((a: T, b: U) => b)

  def main(args: Array[String]): Unit = {
    val pair = cons('a, 'b)
    val pairPair = cons(cons(0, 1), cons('i, 'j))
    println(car(pair))
    println(cdr(pair))

    val test = cdr(pairPair)
    // car(cdr(pairPair)) // TODO
    println(test)
  }
}