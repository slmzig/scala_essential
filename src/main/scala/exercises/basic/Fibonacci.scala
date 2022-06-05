package exercises.basic

object Fibonacci extends App {

  // A Fibonacci function

  /**
   *
   * f(n) if n==0 f(n)=0
   * f(n) if n==1 f(n)=1
   * f(n) if n > 1 f(n) = f(n-1)+f(n-2)
   *
   * good explain of fibonacci https://www.youtube.com/watch?v=F4HNO4rCQ2c
   */

  /**
   *
   * not effective implementation
   * very long duration
   */
  def fibonacci(n: Int): Int = {
    n match {
      case 0 => 0
      case 1 => 1
      case _ => fibonacci(n - 1) + fibonacci(n - 2)
    }
  }

  println("fibonacci2: " + fibonacci(3))

  def fibonacciEffective(n: Long): Long = {
    def inner(n: Long, first: Long, second: Long): Long = {
      if (n == 1) second
      else {
        inner(n - 1, second, first + second)
      }
    }

    inner(n, 0, 1)
  }

  println(fibonacciEffective(100))
}
