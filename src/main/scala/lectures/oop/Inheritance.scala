package lectures.oop

import scala.language.postfixOps

object Inheritance extends App {


  class Animal {
    def eat = println("nomnom")
  }
  class Cat extends Animal

  new Cat().eat // thanks to inheritance we can get eat method


  class Dog extends Animal {
    override def eat = println("clats clats")
  }

  println(new Dog().eat) // will print clats clats instead of nomnom
}
