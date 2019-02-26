package designPatterns.functors

/** Functor is a class that has a map method
  * and conforms to a few laws (Identity, Composition)
  *
  * @tparam F Higher kinded type
  */
trait Functor[F[_]] {
  // map function does not change elements directly,
  // it just change the representation.
  def map[T, Y](l: F[T])(f: T => Y): F[Y]
}
