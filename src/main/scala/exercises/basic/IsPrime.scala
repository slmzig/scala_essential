package exercises.basic

import scala.annotation.tailrec

object IsPrime extends App {

  def isPrime(n: Int): Boolean = {
    def inner(t: Int): Boolean = {
      if (t <= 1) true
      else n % t != 0 && inner(t - 1)
    }

    n match
      case num if num < 2 => false
      case num if num != 2 && n % 2 == 0 => false
      case num if num != 3 && num % 3 == 0 => false
      case num if num != 5 && num % 5 == 0 => false
      case _ => inner(n / 2)

  }

  (1 to 100).foreach {
    num =>
      if (isPrime(num)) println(s"$num is prime")
  }

}
