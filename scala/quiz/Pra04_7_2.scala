package quiz

// forを用いて0から40までの整数 x について x2+x+41 を要素とするリストを求めよ.
// また，それらのうち素数でない数のリストを求めよ．
object Pra04_7_2 {
  def main(args: Array[String]): Unit = {
    val list = generate(0 to 40 toList)
    println(list)
    println(list.filter(e => !isPrime(e)))
  }

  def func(x: Int): Int = x * x + x + 41

  def generate(nums: List[Int]): List[Int] = {
    for {
      num <- nums
    } yield func(num)
  }

  def isPrime(n: Int): Boolean = (2 to math.sqrt(n).toInt).forall(n % _ != 0)
}
