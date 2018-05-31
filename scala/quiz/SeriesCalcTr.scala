package quiz

import scala.annotation.tailrec

object SeriesCalcTr {
  def product[T: Numeric](n: T): T = {
    val _i = implicitly[Numeric[T]]
    lazy val _0 = _i.zero
    lazy val _1 = _i.one

    @tailrec
    def _tRec(n: T, res: T): T = n match {
      case _ if n == _0 => _0
      case _ if n == _1 => res
      case _ => _tRec(_i.minus(n, _1), _i.times(res, n))
    }

    _tRec(n, _1)
  }

  def sum[T: Numeric](list: List[T]): T = {
    lazy val _i = implicitly[Numeric[T]]

    @tailrec
    def _tRec(list: List[T], res: T): T = list match {
      case Nil => res
      case h :: tail => _tRec(tail, _i.plus(res, h))
    }

    _tRec(list, _i.zero)
  }
}
