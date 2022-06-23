package exercises.oop

object MyList extends App {
  abstract class MyList {

    def head: Int

    def tail: MyList

    def isEmpty: Boolean

    def add(value: Int): MyList

    def printElements: String

    override def toString: String = s"[$printElements]"

  }

  class NonEmpty(val head: Int, val tail: MyList) extends MyList {

    def isEmpty: Boolean = false

    def add(value: Int): MyList = new NonEmpty(value, this)

    override def printElements: String = {
      if (tail.isEmpty)
        s"$head"
      else
        s"$head " + tail.printElements
    }
  }

  object Empty extends MyList {
    def head: Int = throw new NoSuchElementException

    def tail: MyList = throw new NoSuchElementException

    def isEmpty: Boolean = true

    def add(value: Int): MyList = new NonEmpty(value, Empty)

    override def printElements: String = "null"
  }

  val myList = Empty.add(2).add(3).add(4)
  println(myList)
}