package lectures.basics

object ValuesVariablesTypes extends App {
  println("start ValuesVariablesTypes")


  // immutable variable
  val x = 42
  println(x)

  /**
   *
   *  x = 43
   *  this will lead to compile error because it is mutable variable
   *
   * */

  val x2: Int = 42
  println(x2)

  /**
   *  as you can see above
   *  
   * */
}
/**
variables are:
- immutable
- mutable

immutable - means that can not reassign value to it
mutable - means that we can reassign new value to it

types:


**/