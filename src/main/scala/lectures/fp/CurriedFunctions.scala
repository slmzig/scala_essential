package lectures.fp

object CurriedFunctions extends App {

  def cF(n: Int): Int => Int = {
    (x: Int) => x + n
  }

  def cF2(n:Int)(n2:Int) = {
    n+n2
  }

  val p: Int => Int = cF2(1)

  cF(1)(1) // result is 2

  def nTimes(f: Int => Int, n: Int): Int => Int = {
    if (n <= 0) (x: Int) => x
    else
      (x: Int) =>
        val fu: Int => Int = nTimes(f, n - 1)
        val res: Int = fu(f(x))
        res
  }

  /**
   * f=x+1 x=0 n=5
   */

  val f = nTimes((x => x + 1), 5)

  println(f(0))
}
