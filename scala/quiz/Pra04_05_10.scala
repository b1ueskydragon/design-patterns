package quiz

// 整数のリスト a0, a1, a2, …, an で，正則連分数を表すことにする.
// 正則連分数を表すリストから，その実数値を求める関数cfracを定義せよ.
// ヒント: 与えられた整数リストに対し，まず map(_.toDouble) で実数のリストに変換しておく
object Pra04_05_10 {
  def main(args: Array[String]): Unit = {
    lazy val list = List(1, 3, 5, 7, 9, 11)
    println(cfrac(list))
  }

  /**
    * 正則連分数を表すリストから，その実数値を求める.
    *
    * @param list list of Integer
    * @return list of regular continued fraction
    */
  def cfrac(list: List[Int]): List[Double] = {
    list.map(_.toDouble)
  }
}
