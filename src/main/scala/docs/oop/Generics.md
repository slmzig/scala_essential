generics
- Generics allow us to reuse the same logic on many (potentially unrelated) types
- we can add type param to class or method
- Generic classes (or traits) take a type as a parameter within square brackets
- The Scala convention is to use a single letter (like A) to name those type parameters
- The type can then be used inside the class as needed for method instance parameters, or on return types

generic classes
```scala
trait Animal[T]
class Dog extends Animal[String]
```

- as an example we can look at list - it is a generic

good article - https://blog.rockthejvm.com/scala-generics/