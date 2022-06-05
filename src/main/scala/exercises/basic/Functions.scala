package exercises.basic

object Functions extends App {

  // 1. greeting function (name, age) => "Hi, my name is $name and I am $age years old"

  def greeting(name: String, age: Int) = {
    s"Hi, my name is $name and I'am $age years old"
  }

  println(greeting("Slava", 35)) // Hi, my name is Slava and I'am 35 years old

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

  println(factorial(10, 1))
  println(factorial(10))


  // 3. A Fibonacci function

  /**
   *
   * f(n) if n==0 f(n)=0
   * f(n) if n==1 f(n)=1
   * f(n) if n > 1 f(n) = f(n-1)+f(n-2)
   *
   */

  // good explain https://www.youtube.com/watch?v=F4HNO4rCQ2c

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


  def isPrime(n: Int): Boolean = {
    n match
      case num if num < 2 => false
      case num if num == 2 => true
      case num if num % 2 == 0 => true
      case _ => false
  }


}
