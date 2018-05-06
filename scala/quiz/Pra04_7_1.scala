package quiz

// forを用いて 1! から 10! までを要素とするリスト(あるいはVector)を求めよ．
object Pra04_7_1 {
  def main(args: Array[String]): Unit = {
    println(comprehension(1 to 10 toList))
  }

  def factorial(n: Int): Int = {
    // accumulating
    def _tailRec(stack: Int, n: Int): Int = {
      if (n < 1) stack
      else _tailRec(stack * n, n - 1)
    }

    _tailRec(1, n)
  }

  def comprehension(nums: List[Int]): List[Int] = {
    for {
      num <- nums
    } yield factorial(num)
  }
}
