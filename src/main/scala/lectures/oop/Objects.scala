package lectures.oop

import scala.language.postfixOps

object Objects extends App {


  class Person() {
    private val name:String = "name"
    Person.objName
  }

  object Person {
    private val objName = "name"
    new Person().name
  }

  val mary1 = new Person()
  val mary2 = new Person()

  val tom1 = Person
  val tom2 = Person

  println(mary1 == mary2) // false
  println(tom1 == tom2) // true

}
