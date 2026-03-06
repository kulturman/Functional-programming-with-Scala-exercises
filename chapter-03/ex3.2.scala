//Implement the function tail for removing the first element of a List
def tail[A](l: List[A]): List[A] = {
  l match {
    case Cons(x, xs) => xs
    case Nil => sys.error("tail of empty list")
  }
}
