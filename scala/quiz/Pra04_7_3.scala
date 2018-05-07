package quiz

// 文字 a,b,c のそれぞれを1文字から3文字まで繰り返した文字列から成るリストを求めよ.
// すなわち "a", "aa", "aaa", "b", "bb", "bbb", "c", "cc", "ccc" を求める．
object Pra04_7_3 {
  def main(args: Array[String]): Unit = {
    println(generate3("a", 3))
  }

  // 文字一つに対する処理
  // あとで別関数に渡す
  def generate3(word: String, n: Int) = {
    def _rec(stack: List[String], rst: List[List[String]], n: Int): List[List[String]] = n match {
      case -1 => rst.reverse
      case _ => _rec(word :: stack, stack :: rst, n - 1)
    }

    _rec(Nil, Nil, n)
  }
}
