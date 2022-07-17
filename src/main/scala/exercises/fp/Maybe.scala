package exercises.fp

object Maybe extends App {

  trait Maybe[+T] {
    def map[B >: T](f: T => B): Maybe[B]

    def filter(f: T => Boolean): Maybe[T]

    def flatMap[B >: T](f: T => Maybe[B]): Maybe[B]
  }

  case class Value[+T](v: T) extends Maybe[T] {
    override def map[B >: T](f: T => B): Maybe[B] = {
      Value(f(v))
    }

    override def filter(f: T => Boolean): Maybe[T] = {
      if (f(v)) this
      else Empty
    }

    override def flatMap[B >: T](f: T => Maybe[B]): Maybe[B] = {
      f(v)
    }
  }

  case object Empty extends Maybe[Nothing] {
    override def map[B >: Nothing](f: Nothing => B): Maybe[B] = Empty

    override def filter(f: Nothing => Boolean): Maybe[Nothing] = Empty

    override def flatMap[B >: Nothing](f: Nothing => Maybe[B]): Maybe[B] = Empty
  }

  val maybe: Value[Int] = Value(1)
  val maybe2: Maybe[Int] = Value(1)
  val maybe3: Maybe[Int] = Empty

  println(maybe.map(x => x + 1))

  val l: Option[Int] = Some(1).flatMap {
    x => Some(x + 1)
  }

  val l2: Maybe[Int] = Value(1).flatMap {
    x => Value(x + 1)
  }

  println(l2)


  val res = for {
    a <- Value(1)
    a2 <- Value(1)
    a3 <- Value(1)
  } yield (a + a2 + a3)

  println(res)
}
