package graffiti

object ForMap {
  def main(args: Array[String]): Unit = {

    val a =
      List.range(1, 5) flatMap {
        i =>
          List.range(1, i) map {
            j => (i, j)
          }
      }

    val b =
      for {
        i <- List.range(1, 5) // flatMap
        j <- List.range(1, i) // map
      } yield (i, j)

    println(a)
    println(b)
  }

  // 複数のジェネレータ(p <- e) がある場合,
  // 最後のジェネレータが map, それ以外が flatMap に展開
}
