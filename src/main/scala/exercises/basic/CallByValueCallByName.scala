package exercises.basic

object CallByValueCallByName extends App {

  def callByValue(param:Long):Unit = {
    println(param)
    Thread.sleep(50)
    println(param)
  }

  def callByName(param: =>Long):Unit = {
    println(param)
    Thread.sleep(50)
    println(param)
  }

  callByValue(System.nanoTime()) // times are the same, argument evaluates once you pass it to function
  callByName(System.nanoTime()) // times are different on each call because argument evaluated on each call
}
