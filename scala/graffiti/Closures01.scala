package graffiti

//object Closures01 {
//
//  def cons[T, U, F](a: T, b: U) = () => (f: (T, U) => F) => f(a, b)
//
//  def car[T, U](pair: () => T => T): T = pair((f: (T, U) => T) => a)
//
//  def cdr[T, U](pair: () => Pair[T, U]): U = pair.apply().u
//
//  def main(args: Array[String]): Unit = {
//    val pair = cons('a, 'b)
//    val pairPair = cons(cons(0, 1), cons(99, 100))
//    println(car(pair))
//    println(cdr(pair))
//    println(cdr(car(pairPair)))
//  }
//}

//def cons[T, U, F](a: T, b: U) = (p: (T, U) => F) => p(a, b)

//def car[T, U](f: (T, U) => T => T) = f((a: T, b: U) => a)

//def cdr[T, U](f: (T, U) => U => U) = f((a: T, b: U) => b)