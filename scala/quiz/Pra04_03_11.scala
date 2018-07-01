package quiz

object Pra04_03_11 {
  def main(args: Array[String]): Unit = {
    val res00 = (0 to 99).map(generalTerm)
    val res01 = (0 to 99).map(i => if (i % 2 == 0) 1.0 / (2 * i + 1) else -1.0 / (2 * i + 1))
    println(res00)
    println(res01)
  }

  def generalTerm(i: Int): Double = Math.pow(-1, i) / (2 * i + 1)
}
