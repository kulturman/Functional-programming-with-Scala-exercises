//Implement isSorted, which checks whether an Array[A] is sorted according to a given comparison function

private def isSorted[A](as: Array[A], ordered: (A, A) => Boolean) = {
  @tailrec
  def loop(i: Int): Boolean = {
    if (i >= as.length - 1) true
    else if (!ordered(as(i), as(i + 1))) false
    else loop(i + 1)
  }
  loop(0)
}