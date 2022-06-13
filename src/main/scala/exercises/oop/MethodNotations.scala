package exercises.oop

import scala.language.postfixOps

object MethodNotations extends App {


  class Person(val name: String, favouriteMovie: String, val age: Int = 0) {
    def likes(movie: String): Boolean = movie == favouriteMovie

    def +(person: Person): String = s"$name is hangingout with ${person.name}"

    def +(newPerson: String): Person = {
      new Person(s"${this.name} ($newPerson)", this.favouriteMovie)
    }

    def unary_+ : Person = new Person(this.name, this.favouriteMovie, this.age + 1)

    def unary_! : String = "it is unary operator"

    def learns(subject:String): String = s"${this.name} learn $subject!"

    def learnsScala: String = learns("Scala")

    def isAlive: Boolean = true

    def apply(): String = "hello world"

    def apply(nTimes:Int): String = s"$name watched $favouriteMovie $nTimes times"
  }

  val mary = new Person("mary", "terminator")

  val newMary = mary + "rockstar"

  println(newMary.name) //mary (rockstar)

  val newAge = +newMary
  println(newAge.age) // age is 1

  println(mary learnsScala) // mary learn Scala!
  println(mary(4)) // mary watched terminator 4 times
}
