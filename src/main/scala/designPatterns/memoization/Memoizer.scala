package designPatterns.memoization

import scala.collection.mutable

/** Retrieve the result of a function based on its input (param),
  * or calls the actual function if the result is not already in the map.
  *
  * !! Not thread safe !!
  * Multiple threads could access the map in parallel
  * and cause the function to be executed twice.
  */
trait Memoizer {

  def memo[X, Y](f: X => Y): X => Y = {

    val cache = mutable.Map[X, Y]()

    x: X => cache.getOrElseUpdate(x, f(x))

  }

}
