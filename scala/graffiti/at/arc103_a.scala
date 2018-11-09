package graffiti.at

// https://beta.atcoder.jp/contests/arc103/tasks/arc103_a
object arc103_a {
  def main(args: Array[String]): Unit = {
    println(solve(Seq(3, 1, 3, 2))) // 1
    println(solve(Seq(105, 119, 105, 119, 105, 119))) // 0
    println(solve(Seq(1, 1, 1, 1))) // 2
  }

  def solve(target: Seq[Int]): Int = {
    ??? // todo: zipwithindex
  }
}
