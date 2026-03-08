//Not everything works out so nicely. Implement a function, init, that returns a List consisting of all but the last element of a List
def init[A](l: List[A]): List[A] = {
  l match {
    case Cons(h, Nil) => Nil
    case Cons(h, t) => Cons(h, init(t))
    case Nil => Nil
  }
}
