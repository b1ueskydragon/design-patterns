package quiz

import scala.annotation.tailrec

// ∑n i=0 (1/i)! は n→∞ で e に収束する.
// n=20 の場合の値を求めよ.
object Pra04_03_13 {
  def main(args: Array[String]): Unit = {
    lazy val n = 20
    lazy val res =
      for {
        i <- 1 to n
      } yield 1.0 / i

    println(res)
  }

  def product[T: Numeric](n: T): T = {
    @tailrec
    def _tRec(n: T, res: T): T = n match {
      case _ if n == 0 => implicitly[Numeric[T]].zero
      case _ if n == 1 => res
      case _ => _tRec(implicitly[Numeric[T]].minus(n, implicitly[Numeric[T]].one), implicitly[Numeric[T]].times(res, n))
    }

    _tRec(n, implicitly[Numeric[T]].one)
  }

  def sum[T: Numeric](list: List[T]): T = {
    @tailrec
    def _tRec(list: List[T], res: T): T = list match {
      case Nil => res
      case h :: tail => _tRec(tail, implicitly[Numeric[T]].plus(res, h))
    }

    _tRec(list, implicitly[Numeric[T]].zero)
  }
}
