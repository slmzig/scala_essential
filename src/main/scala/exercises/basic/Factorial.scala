package exercises.basic

object Factorial extends App {

  // 2. Factorial function 1 * 2 * 3 * .. * n
  // 10 10 * 9 * 8 * 7
  def factorial(n: Int, result: Int): Int = {
    if (n == 0) result
    else factorial(n - 1, result * n)
  }

  def factorial(n: Int): Int = {
    def inner(n: Int, result: Int): Int = {
      if (n == 0) result
      else inner(n - 1, result * n)
    }

    inner(n, 1)
  }

  def factorial2(n: Int): Int = {
    if (n == 1) 1
    else n * factorial2(n - 1)
  }

  println(factorial(10, 1))
  println(factorial(0))
  println(factorial(1))
  println(factorial(2))
  println(factorial(3))
  println(factorial(4))
}
