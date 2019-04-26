package designPatterns

package object monoids {

  val intAddition: Monoid[Int] = new Monoid[Int] {
    override def op(l: Int, r: Int): Int = l + r

    val zero: Int = 0
  }

  val intMultiplication: Monoid[Int] = new Monoid[Int] {
    override def op(l: Int, r: Int): Int = l * r

    val zero: Int = 1
  }

  val stringConcatenation: Monoid[String] = new Monoid[String] {
    override def op(l: String, r: String): String = l + r

    val zero: String = ""
  }

  /** op(op(op(1, 2), 3), 4)
    * -> op(op(1, 2), op(3, 4))
    *
    * IndexedSeq guarantees that getting elements
    * by index will be efficient.
    *
    * this code is not parallel, but will improve the performance.
    */
  def balancedFold[T, Y](list: IndexedSeq[T], m: Monoid[Y])(f: T => Y): Y = {
    if (list.isEmpty) m.zero
    else if (list.length == 1) f(list(0)) // has only a single element
    else {
      val (left, right) = list.splitAt(list.length / 2)
      m.op(balancedFold(left, m)(f), balancedFold(right, m)(f))
    }
  }

}
