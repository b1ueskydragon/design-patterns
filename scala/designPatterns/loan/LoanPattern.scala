package designPatterns.loan

case class User(
  id: Long,
  email: String
)

case class Cookie(
  name: String,
  value: String,
  maxAge: Option[Int] = None,
  path: String = "/",
  domain: Option[String] = None,
  secure: Boolean = false,
  httpOnly: Boolean = true
)

case class Prepare(user: User) {

  def setup(): Unit = _setup(user)

  def clean(): Unit = _clean(user)

  private def _setup(user: User): Unit = println(s"""${user.id} created""")

  private def _clean(user: User): Unit = println(s"""${user.id} cleared""")

}

object LoanPattern {

  def sequence(user: User)(block: User => Unit): Unit = {
    Prepare(user).setup() // make a connection
    block(user) // function
    Prepare(user).clean() // close a resource
  }


  def main(args: Array[String]): Unit = {

    sequence(User(12345L, "penguin@example.com")) { user =>

      val cookie = Cookie(
        name = "_your_cookie",
        value = (user.id + scala.util.Random.nextLong).toHexString
      )

      println(s"""Gave ${user.id} to cookie value ${cookie.value}""")

    }

  }

}
