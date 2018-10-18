package graffiti

import java.util.Scanner
import scala.util.Random

object MyLunch {
  def main(args: Array[String]): Unit = {
    //    println(selectLunch(candidates().take(3))) // Enroll 3 menus.
    val input = List(("a", 30), ("b", 10), ("c", 40), ("d", 20))
    println(selectLunch(input))

  }

  /** Weighted random number.
    *
    * String: menu
    * Int: weight
    */
  def selectLunch(candidates: List[(String, Int)]): List[String] = {
    // total weight.
    val total = candidates.map(_._2).sum

    // random weight.
    // pick a value randomly from a range 1 to total.
    val random = Random.nextInt(total) + 1
    candidates.map(pick(_, random))
  }

  /** Helper (Recursion) */
  private def pick(candidate: (String, Int), random: Int): String = {
    println(random)
    if (candidate._2 >= random) candidate._1
    else pick(candidate, random - candidate._2)
  }

  private def candidate(): (String, Int) = {
    val sc = new Scanner(System.in)
    (sc.next, sc.nextInt)
  }

  private def candidates(): Stream[(String, Int)] = {
    candidate #:: candidates()
  }
}


