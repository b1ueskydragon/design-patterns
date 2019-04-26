package designPatterns.monads

trait Functor[T] {

  def map[Y](f: T => Y): Functor[Y]

}
