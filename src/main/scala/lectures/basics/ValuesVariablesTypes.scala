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
  /**
   *  as you can see above
   *  we the type of variable is optional
   *  compiler defines it by itself
   * */

  val x3 = 42;
  /**
   * semicolon is optional in scala
   * semicolon is required only when use write multiple expressions in one line
   */
}
/**
variables are:
- immutable
- mutable

immutable - means that can not reassign value to it
mutable - means that we can reassign new value to it

types:
- declaring the type of variable is optional
- compiler define type of variable by itself

semicolons:
- semicolon is optional in scala
- semicolon is required only when use write multiple expressions in one line
**/