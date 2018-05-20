package graffiti

object DivideConquer {
  def main(args: Array[String]): Unit = {
    val origin = List('a, 'b, 'c, 'd)
    val add = List('e, 'f, 'g)
    println(append(origin, add))
  }

  def append[A](xs: List[A], ys: List[A]): List[A] = xs match {
    case List() => ys
    case h :: tail => h :: append(tail, ys)
  }
}
