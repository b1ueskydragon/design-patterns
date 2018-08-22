package graffiti

object Closures01 {

  def cons[T, U, F](a: T, b: U) = (p: (T, U) => F) => p(a, b)

  //def car[T, U](f: (T, U) => T => T) = f((a: T, b: U) => a)

  //def cdr[T, U](f: (T, U) => U => U) = f((a: T, b: U) => b)

  def main(args: Array[String]): Unit = {
    val pair = cons('a, 'b)
  }
}