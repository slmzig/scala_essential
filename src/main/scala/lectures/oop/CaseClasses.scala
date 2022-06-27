package lectures.oop

object CaseClasses extends App {

  class Person2(name: String, age: Int)

  case class Person(name: String, age: Int)

  // 1. class case parameters are fields
  val tom = Person("tom", 13)
  tom.name // we can access params
  val tom2 = new Person2("tom2", 13)
  //  tom2.name // not legal, can not access params

  // 2. sensible toString
  println(tom) // will print Person("tom", 13)
  println(tom2) // lectures.oop.CaseClasses$Person2@6108b2d7

  // 3. equals hashcode implemented so no need to implement it in custom data structures

  // 4. copy method is implemented - very useful for custom structures

  // 5. have companion object

  // 6. are serializable, this usefull for sending messages (akka)
  
  // 7. have extractors - can be used in patter matching

}
