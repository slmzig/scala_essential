package exercises.oop

import scala.annotation.tailrec
import scala.jdk.Accumulator
import scala.runtime.Nothing$

object MyListImplementFilterMapFlatMap extends App {

  class Animal

  class Cat extends Animal

  class Dog extends Animal

  //  val error: Nothing = throw new Exception("")
  val cat: Cat = new Cat
  val cat2: Animal = new Cat
  val cat3: Any = new Cat
  //  val cat4: Cat = error // it is nothing

  val dog: Animal = new Dog

  trait MyPredicate[-T] {
    def test(element: T): Boolean
  }

  trait MyTransformer[-A, B] {
    def transform(element: A): B
  }

  case object DoubleTransform extends MyTransformer[Int, Int] {
    def transform(element: Int): Int = element * 2
  }

  case object flatMapTransform extends MyTransformer[Int, MyList[Int]] {
    def transform(element: Int): MyList[Int] = Value(element * 2, Empty)
  }

  case object IsEven extends MyPredicate[Int] {
    def test(element: Int): Boolean = element % 2 == 0
  }

  trait MyList[+A] {

    def ++[B >: A](list: MyList[B]): MyList[B]

    def filter(predicate: MyPredicate[A]): MyList[A]

    def map[B](transformer: MyTransformer[A, B]): MyList[B]

    def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B]

    def add[B >: A](element: B): MyList[B]

    def isEmpty: Boolean

    def head: A

    def tail: MyList[A]

    def print: String

    override def toString: String = s"MyList($print)"

  }

  object MyList {
    def apply[A](element: A): MyList[A] = Value(element, Empty)
  }

  case class Value[+A](head: A, tail: MyList[A]) extends MyList[A] {
    def isEmpty: Boolean = false

    override def ++[B >: A](list: MyList[B]): MyList[B] = Value(head, tail ++ list)

    /**
     * [1,2,3].flatmap(el => n, n + 1) = [1,2] ++ [2,3] ++ [3,4]
     */
    override def flatMap[B](transformer: MyTransformer[A, MyList[B]]): MyList[B] = {
      transformer.transform(head) ++ tail.flatMap(transformer)
    }

    override def map[B](transformer: MyTransformer[A, B]): MyList[B] = {
      Value(transformer.transform(head), tail.map(transformer))
    }

    override def filter(predicate: MyPredicate[A]): MyList[A] = {
      if (predicate.test(head)) Value(head, tail.filter(predicate))
      else tail.filter(predicate)
    }

    override def add[B >: A](element: B): MyList[B] = Value(element, this)

    override def print: String = if (tail.isEmpty)
      head.toString
    else
      head.toString + " " + tail.print
  }

  case object Empty extends MyList[Nothing] {

    override def ++[B >: Nothing](list: MyList[B]): MyList[B] = list

    override def flatMap[B](transformer: MyTransformer[Nothing, MyList[B]]): MyList[B] = Empty

    override def filter(predicate: MyPredicate[Nothing]): MyList[Nothing] = Empty

    override def map[B](transformer: MyTransformer[Nothing, B]): MyList[B] = Empty

    override def head: Nothing = throw new Exception("value not found")

    override def tail: MyList[Nothing] = throw new Exception("value not found")

    def isEmpty: Boolean = true

    override def add[A](element: A): MyList[A] = Value(element, Empty)

    override def print: String = ""
  }

  val list = Value[Int](1, Empty)
  val list2 = Value(1, Value(2, Value(3, Empty)))
  val list3: MyList[Int] = Empty.add(1).add(2).add(3).add(4).add(5).add(6).add(7)
  val list4: MyList[Int] = Empty
  val list5: MyList[String] = Empty
  println(list3)
  println(list3.filter(IsEven))
  println(list3.map(DoubleTransform))


  list3.flatMap {
    new MyTransformer[Int, MyList[Int]] {
      def transform(element: Int): MyList[Int] = Value(element * 2, Empty)
    }
  }

  // hmm why this is working
  val list7 = list3.flatMap(element => Value(element * 2, Empty))

}


