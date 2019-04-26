package designPatterns.singleton

import scala.collection.concurrent.TrieMap

/** A singleton class contains a concurrent map of all the users
  * currently using the application.
  *
  * Singletons in Scala are lazily initialized.
  *
  * While creating a singleton instance, we cannot provide dynamic parameters
  * to the singleton class instance.
  */
object AppRegistry {
  // will be executed when the singleton instance is created
  println("Registry initialization block called.")

  /** A concurrent hash-trie or TrieMap is a concurrent thread-safe lock-free
    * implementation of a hash array mapped trie.
    */
  private val users: TrieMap[String, String] = TrieMap.empty

  def addUser(id: String, name: String): Unit = users.put(id, name)

  def removeUser(id: String): Unit = users.remove(id)

  def isUserRegistered(id: String): Boolean = users.contains(id)

  def getAllUserNames: List[String] = users.values.toList

}
