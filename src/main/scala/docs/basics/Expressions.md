Expression 
- short: should return a value
- long: is a combination of values and functions that are combined and interpreted by the compiler to create a new value

Statement 
- short: has no value to return
- long: is just a standalone unit of execution and doesn’t return anything

in scala everything is expression

```scala
// in this case we see that statement returns type unit
val value: Unit = println("some text")
```

```scala
// if statement also return a value
val condition: Int = if (true) 1 else 0

// this also return as result
val ifBlock: Unit = {
  if (true)
    println(1)
  else
    println(2)
}
```