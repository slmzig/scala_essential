Higher order functions (HOFs)

- Currying is the process of converting a function with multiple arguments into a sequence of functions that take one argument. Each function returns another function that consumes the following argument.

creating own curried function
```scala
  def cF(n: Int): Int => Int = {
    (x: Int) => x + n
  }

val f = cF(1)
val f2 = f(1) // result is 2
// or we can do this

cF(1)(1)
```

scala curried function
```scala
def f(x:Int)(x2:Int) = x + x2


```