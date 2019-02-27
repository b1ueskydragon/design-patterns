package designPatterns.singleton

/** This object will be a singleton instance,
  * it more resembles a class with static methods.
  *
  * The singleton design pattern ensures that
  * a class has only one object instance in the entire application.
  * It introduces a global state in the applications it is used in.
  */
object StringUtils {
  def countNumberOfSpaces(text: String): Int = text.split("\\s+").length - 1
}
