package graffiti

import java.util.Scanner
import scala.util.Random

object MyLunch {
  def main(args: Array[String]): Unit = {
    println(selectLunch(candidates().take(3)))
    // TODO take a weight for select randomly
  }

  def selectLunch(candidates: Stream[(String, Int)]): List[(String, Int)] = {
    Random.shuffle(candidates).take(1).toList
  }

  private def candidate(): (String, Int) = {
    val sc = new Scanner(System.in)
    (sc.next, sc.nextInt)
  }

  private def candidates(): Stream[(String, Int)] = {
    candidate #:: candidates()
  }
}


