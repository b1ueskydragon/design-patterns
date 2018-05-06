package quiz

// forを用いて 1! から 10! までを要素とするリスト(あるいはVector)を求めよ．
object Pra04_7_1 {
  def main(args: Array[String]): Unit = {
    println(comprehension(1 to 10 toList))
  }

  def factorial(n: Int): Int = n match {
    case _ if n < 1 => 1
    case _ => n * factorial(n - 1)
  }

  def comprehension(nums: List[Int]): List[Int] = {
    for {
      num <- nums
    } yield factorial(num)
  }
}
