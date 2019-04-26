package designPatterns.singleton

object AppRegistryExample {
  def main(args: Array[String]): Unit = {
    println("Sleeping for 5 seconds.")
    Thread.sleep(5000)

    println("I woke up.")

    // singleton instance is created
    AppRegistry.addUser("1", "Ivan")
    AppRegistry.addUser("2", "John")
    AppRegistry.addUser("3", "Martin")

    println(s"Is user with ID=1 registered? ${AppRegistry.isUserRegistered("1")}")

    println("Removing ID=2")
    AppRegistry.removeUser("2")

    println(s"Is user with ID=2 registered? ${AppRegistry.isUserRegistered("2")}")

    println(s"All users registered are: ${AppRegistry.getAllUserNames.mkString(",")}")
  }
}
