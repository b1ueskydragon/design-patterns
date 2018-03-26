object CaseMatch {
  private def flag(isTrue: Option[Boolean]): Option[String] = isTrue match {
    case Some(true) => Some("1")
    case Some(_) => Some("0")
  }

  def main(args: Array[String]): Unit = {
    println(flag(Some(true)))
    println(flag(Some(false)))
    println(flag(None)) // case None 処理せずに None が return されるので例外.
  }
}
