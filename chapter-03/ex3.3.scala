//implement the function setHead for replacing the first element of a List with a different value
def setHead[A](h: A, l: List[A]): List[A] = {
  l match {
    case Nil => Cons(h, Nil)
    case Cons(x, xs) => Cons(h, xs)
  }
}
