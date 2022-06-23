package exercises.oop


object MyListGeneric extends App {

  /**
   * must be covariant
   * because we have two object NonEmpty and Empty inheriting MyList
   */
  abstract class MyList[+A] {

    def head: A

    def tail: MyList[A]

    def isEmpty: Boolean

    /**
     * we added B as supertype of A
     * and here we returns supertype
     * instead of child NonEmpty or Empty
     */
    def add[B >: A](value: B): MyList[B]

    def printElements: String

    override def toString: String = s"[$printElements]"

  }

  class NonEmpty[+A](val head: A, val tail: MyList[A]) extends MyList[A] {

    def isEmpty: Boolean = false

    def add[B >: A](value: B): MyList[B] = new NonEmpty(value, this)

    override def printElements: String = {
      if (tail.isEmpty)
        s"$head"
      else
        s"$head " + tail.printElements
    }
  }

  object Empty extends MyList[Nothing] {
    def head: Nothing = throw new NoSuchElementException

    def tail: MyList[Nothing] = throw new NoSuchElementException

    def isEmpty: Boolean = true

    def add[B >: Nothing](value: B): MyList[B] = new NonEmpty(value, Empty)

    override def printElements: String = "null"
  }

  val m1:MyList[Int] = Empty
  val m2:MyList[String] = Empty
  val m3= NonEmpty("1", Empty)

  val myList = Empty.add(2).add(3).add(4)
  println(myList)
  val myListString = Empty.add("2").add("3").add("4")
  println(myList)
}