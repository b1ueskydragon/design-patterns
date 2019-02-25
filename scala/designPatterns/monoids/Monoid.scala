package designPatterns.monoids

/** Base trait for define monoid we want.
  *
  * The monoid is defined based on some laws it follows,
  * and these laws allows us to implement generic functionality with certainly,
  * just because we expect certain conditions to hold.
  * If a law is broken, and there is no way for us to know for sure
  * what to expect in terms of how something will behave.
  */
trait Monoid[T] {
  def op(l: T, r: T): T

  def zero: T
}
