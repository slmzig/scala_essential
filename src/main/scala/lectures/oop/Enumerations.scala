package lectures.oop

object Enumerations extends App {

  object Days extends Enumeration {
    type Day = Value

    val Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday = Value
  }

  // get value
  Days.Monday

  // get list of values
  println(Days.values) // Days.ValueSet(Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday)

  // from string to value
  Days.withName("Monday") // returns Days.Monday
}
