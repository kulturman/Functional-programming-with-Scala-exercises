//Generalize tail to the function drop, which removes the first n elements from a list
def drop[A](l: List[A], n: Int): List[A] = {
  if (n == 0) l
  else {
    l match {
      case Nil => Nil
      case Cons(h, t) => drop(t, n - 1)
    }
  }
}
