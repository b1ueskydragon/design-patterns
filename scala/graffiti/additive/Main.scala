package graffiti.additive

import additives.{IntAdditive, StringAdditive}

object Main {

  def sum[A](lst: List[A])(implicit m: Additive[A]): A = lst.foldLeft(m.zero)((x, y) => m.plus(x, y))

  def main(args: Array[String]): Unit = {

    println("型チェックする時点で List の型が伝わっているため, 型推論を利用する")

    println(sum(List(1, 2, 3)))
    println(sum(List("A", "B", "C")))
  }
}
