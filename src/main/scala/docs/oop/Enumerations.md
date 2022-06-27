Enumeration

- we can define it by extending `Enumeration` class
- each value has it own index and string represantation
- we can get all values as a list
- we can use it in patter matching
- but during patter matching does not produce warning when you miss some cases

```scala
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
```

but during patter matching does not produce warning when you miss some cases
so there is a risk that app will throw an error
```scala
def traffic(colour: Colours.Value) = colour match {
 case Colours.Green => "Go"
}
```

alternative of enums is case objects

```scala
object WeekDay {
  sealed trait EnumVal
  case object Mon extends EnumVal
  case object Tue extends EnumVal
  case object Wed extends EnumVal
  case object Thu extends EnumVal
  case object Fri extends EnumVal
  val daysOfWeek = Seq(Mon, Tue, Wed, Thu, Fri)
}
```
