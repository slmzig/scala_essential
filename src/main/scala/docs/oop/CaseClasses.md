case classes

- case class enriched useful features unlike common classes
- parameters are at the same time fields
- sensible to String
- equals hashcode implemented so no need to implement it in custom data structures
- copy method is implemented - very useful for custom structures
- have companion object (no need to add new)
- are serializable, this useful for sending messages (akka)
- have extractors - can be used in patter matching


examples

- params are fields at the same time

```scala
  class Person2(name: String, age: Int) // common class
  case class Person(name: String, age: Int) // case class
  // class case parameters are fields unlike to common class params
  val tom = Person("tom", 13)
  tom.name // we can access params
  val tom2 = new Person2("tom2", 13)
  //  tom2.name // not legal, can not access params
```

- sensible toString, unlike common classes
```scala
  println(tom) // will print Person("tom", 13)
  println(tom2) // lectures.oop.CaseClasses$Person2@6108b2d7
```
