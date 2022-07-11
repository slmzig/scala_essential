Functions

- jvm - everything is an object (we create classes and method inside)
- jvm was designed as object orientation
- function in scala it is a trait with method apply inside
- scala contain Function1 Function2 ... till Function22
- so function method can get 22 params

```scala

trait Function1[-A, +B] {
  def apply(element: A): B
}

// and now we can use it

val f: Function1[Int, Int] = new Function1[Int, Int] {
  override def apply(element: Int): Int = {
    element * 2
  }
}

// and we can do this syntactic sugar for Function1
val f2: Int => Int = new Function1[Int, Int] {
  override def apply(element: Int): Int = {
    element * 2
  }
}

// and  we can do this (also syntax sugar)
val f3: (Int => Int) = (x: Int) => x * 2  
```