SINGLETON OBJECTS

facts
- can be defined by keyword `object` then name of the object and the body inside brackets
- methods from object can be imported from anywhere from project
- object consists vals vars and methods
- objects not allow params
- An object is a class that has exactly one instance
- It is created lazily when it is referenced, like a lazy val.
- in java we can defint static constant with a public static value in class 
```scala
object Box {}
```

companion object
- An object with the same name as a class is called a companion object
- can access each other private methods
```scala
  class Person() {
    private val name:String = "name"
    Person.objName
  }

  object Person {
    private val objName = "name"
    new Person().name
  }

  val mary1 = new Person()
  val mary2 = new Person()

  val tom1 = Person
  val tom2 = Person

  println(mary1 == mary2) // false
  println(tom1 == tom2) // true
```
