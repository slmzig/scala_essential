Anonymous function

- as scala function looks like more object oriented
- we have syntaxic sugar that look more oriented style
- this syntax sugar is called anonymous function
- also it is called lambda

```scala

trait Function1[-A, +B] {
  def apply(element: A): B
}

// object oriented style of describing function

val f: Function1[Int, Int] = new Function1[Int, Int] {
  override def apply(element: Int): Int = {
    element * 2
  }
}

// functional style of describing function
val f2: (Int => Int) = (x: Int) => x * 2  
```