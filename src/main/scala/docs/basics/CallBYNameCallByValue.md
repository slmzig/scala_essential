call by value
- function arguments are considered call by-value by default in Scala
- all argument are evaluating when pathing to function
- each argument evaluate only once

```scala
def test(a: Int) = a * a
```

call by name
- To make an argument called by-name, we simply prepend => (rocket symbol) to its type
- argument evaluates only inside function
- argument evaluates
- tricks with it and usage

```scala
def test(a: => Int) = a * a
```

```scala

object CallByValueCallByName extends App {

  def callByValue(param:Long):Unit = {
    println(param)
    Thread.sleep(50)
    println(param)
  }

  def callByName(param: =>Long):Unit = {
    println(param)
    Thread.sleep(50)
    println(param)
  }

  callByValue(System.currentTimeMillis()) // times are the same, argument evaluates once you pass it to function
  callByName(System.currentTimeMillis()) // times are different on each call because argument evaluated on each call
}

```

[implementation](../../lectures/basics/CallByValueCallByName.scala)