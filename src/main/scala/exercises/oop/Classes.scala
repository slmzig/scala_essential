package exercises.oop

object Classes extends App {

  class Writer(val firstName: String, val surname: String, val year: Int) {
    def fullName: String = {
      s"$firstName $surname"
    }
  }

  class Novel(name: String, releaseYear: String, author: Writer) {
    def copy(newReleaseYear: String): Novel = {
      new Novel(name, newReleaseYear, author)
    }

    def authorAge(): Int = {
      2022 - author.year
    }

    def isWrittenBy(writer: Writer): Boolean = {
      val isYearTheSame = writer.year == author.year
      val isFirstName = writer.firstName == author.firstName
      val isSurname = writer.surname == author.surname
      if (isYearTheSame && isFirstName && isSurname) true else false
    }
  }

  class Counter(val count:Int) {
    def increment():Counter = new Counter(count + 1)
    def decrement():Counter = new Counter(count - 1)
  }

  val po = new Writer("Alan", "Po", 1900)

  println(po.fullName)

}
