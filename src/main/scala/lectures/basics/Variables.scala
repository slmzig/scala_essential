package lectures.basics

object Variables extends App {

  // immutable variable
  val immutableValue = 42
  println(immutableValue) // 42
  /**
   *
   * immutableValue = 43
   * this will lead to compile error because it is mutable variable
   *
   * */

  // mutable value
  var mutableValue = 3
  mutableValue = 4

  println(mutableValue) // 4

}