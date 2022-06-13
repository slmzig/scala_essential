package lectures.oop

import scala.language.postfixOps

object MethodNotations extends App {


  class Person(val name: String, favouriteMovie: String) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def +(person: Person): String = s"$name is hangingout with ${person.name}"

    def unary_! : String = "it is unary operator"

    def isAlive: Boolean = true

    def apply(): String = "hello world"
  }

  val mary = new Person("mary", "terminator")
  mary.likes("terminator")
  // infix notation
  mary likes "terminator"
  val tom = new Person("tom", "forsage")
  mary + tom
  !mary

  mary.isAlive
  mary isAlive

  mary.apply()
  mary()

  // prefix notation
  val x = -1
  val y = 1.unary_-
}
