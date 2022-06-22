package lectures.oop

object AnonymousClasses extends App {

  trait Animal {
    def test:Unit
  }

  val animal = new Animal {
    val one = 1
    def test =  println("boom!")
    def test2 = println("boom2!")
  }

  animal.test
  // will throw an error
  // animal.test2

  println(animal.getClass) // class lectures.oop.AnonymousClasses$$anon$1

  class AnonymousClasses$anon$2 extends Animal {
    override def test: Unit = ???
    def test2:Unit = ???
  }

  new AnonymousClasses$anon$2().test2
}
