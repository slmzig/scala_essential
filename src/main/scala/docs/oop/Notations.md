method notations:
- **infix notation** (operation notation)(syntax sugar )
    - works only with method that have only one param
  ```scala
    val mary = new Person("mary", "terminator")
    mary.likes("terminator")
    // infix notation
    mary likes "terminator"
  ```
  - this gives us a cool feature - we can name methods with operator name : + - * !
  and create our own algebra, all operators in scala is methods
  ```scala
    class Person(val name: String, favouriteMovie: String) {
      def +(person: Person): String = s"$name is hangingout with ${person.name}"
    }
    val mary = new Person("mary", "terminator")
    val tom = new Person("tom", "forsage")
    mary + tom // cool
  ```
- **prefix notation**
  - it is about unary operators
  - unary operators is for example -1 (minus us unary operator)
  - this applies only to - + ! ~ operators
  ```scala
  // prefix notation
  val x = -1
  val y = 1.unary_-
  ```
  ```scala
  class Person(val name: String, favouriteMovie: String) {
    def unary_! : String = "it is unary operator"
  }
  // now we can use exclamation mark
  !mary

  ```
- postfix notation
  - it is about methods that have no arguments
  ```scala
  class Person(val name: String, favouriteMovie: String) {
    def isAlive:Boolean = true
  }

  mary.isAlive
  mary isAlive // postfix notation
  ```
- apply method
  - apply method allow us to use only parentheses
  ```scala
  class Person(val name: String, favouriteMovie: String) {
    def apply():String = "hello world"
  }
  //they are the same
  mary.apply()
  mary()

  // prefix notation
  val x = -1
  val y = 1.unary_-
  ```


type of operators
- unary -2 (minus is unary operation)
- binary 2 + 2 (plus is binary operator)