object OptionalPra {
  val naaame =
    Map("Me" -> "Aleeex", "You" -> "Rick")

  def show(x: Option[String]) = x match {
    case Some(s) => s
    case None => "?"
  }

  def main(args: Array[String]): Unit = {
    println(show(naaame get "Me"))
    println(show(naaame get "She"))
  }
}
