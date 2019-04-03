package designPatterns.monads

/** The Monad laws
  *
  * - identity law
  * map(x) { i => i} == x
  * x.flatMap { y => unit(y) } == x  # flatMap undoes unit.
  *
  * - the unit law
  * unit(x).flatMap { x' => f(x') } == f(x)
  * unit(x).map { x' => f(x) } == unit(f(x))
  *
  * - composition
  */
trait Monad[T] extends Functor[T] {

  def unit[Y](value: Y): Monad[Y]

  def flatMap[Y](f: T => Monad[Y]): Monad[Y]

  override def map[Y](f: T => Y): Monad[Y] = flatMap(i => unit(f(i)))

}
