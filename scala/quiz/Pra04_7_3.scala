package quiz

// 文字 a,b,c のそれぞれを1文字から3文字まで繰り返した文字列から成るリストを求めよ.
// すなわち "a", "aa", "aaa", "b", "bb", "bbb", "c", "cc", "ccc" を求める．
object Pra04_7_3 {
  def main(args: Array[String]): Unit = {
    println(generates(List("a", "b", "c"), 3))
  }

  // 別関数
  def generates(words: List[String], n: Int): List[List[String]] = {
    for {
      word <- words
    } yield generate3(word, n)
  }

  // 文字一つに対する処理
  // あとで別関数に渡す
  def generate3(word: String, n: Int): List[String] = {
    def _rec(stack: String, rst: List[String], n: Int): List[String] = {
      if (n == 0) rst.reverse
      else _rec(word ++ stack, stack :: rst, n - 1)
    }

    _rec(word, Nil, n)
  }
}
