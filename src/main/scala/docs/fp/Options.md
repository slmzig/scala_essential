options

- option is a wrapper for value that might be present or not
- Some wraps a concrete value
- None is for absent value
- option is implemented to deal with unsafe methods
- it reduces number of lines of code
- imperative code ofter returns null so we might have additional check in our code 


```scala
sealed abstract class Option[+A]
case class Some[+A](x:A) extends Option[A]
case class None extends Option[Nothing]
```