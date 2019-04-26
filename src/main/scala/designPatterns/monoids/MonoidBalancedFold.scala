package designPatterns.monoids

object MonoidBalancedFold {
  def main(args: Array[String]): Unit = {
    val nums = Array(1, 2, 3, 4)
    println(balancedFold(nums, intMultiplication)(identity))
  }
}
