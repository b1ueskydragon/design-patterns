package graffiti

import scala.util.Random

object MyLunch {
  def main(args: Array[String]): Unit = {
    // only for test.
    (1 to 20).toList foreach (_ => println(tester()))
  }

  /** Weighted random number.
    *
    * String: menu
    * Int: weight
    */
  def selectLunch(candidates: List[(String, Int)]): String = {
    // total weight.
    val total = candidates.map(_._2).sum

    // random weight. pick a value randomly from a range 1 to total.
    val random = Random.nextInt(total) + 1

    _pick(candidates, random)
  }

  /** Helper (Recursion) */
  def _pick(candidates: List[(String, Int)], random: Int): String = candidates match {
    case h :: _ if h._2 >= random => h._1
    case h :: tail => _pick(tail, random - h._2)
  }

  //  import java.util.Scanner
  //
  //  def candidate(): (String, Int) = {
  //    val sc = new Scanner(System.in)
  //    (sc.next, sc.nextInt)
  //  }
  //
  //  def candidates(): Stream[(String, Int)] = {
  //    candidate #:: candidates()
  //  }

  private def tester() = {
    val input = List(("a", 30), ("b", 10), ("c", 40), ("d", 20))
    var a, b, c, d = 0

    (1 to 1000000).toList foreach { _ =>
      val res = selectLunch(input)
      if (res == "a") a += 1
      if (res == "b") b += 1
      if (res == "c") c += 1
      if (res == "d") d += 1
    }

    ((a, b, c, d), a + b + c + d) // expected 3 : 1 : 4 : 2 , SUM=1000000
  }
}


