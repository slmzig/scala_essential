Variance

- variance is helpful when you create your own data scructure 
- variance is defining relations between subtypes

variance positions
- covariant
- contravariant
- invariant

```scala
class Foo[+A] // A covariant class
class Bar[-A] // A contravariant class
class Baz[A]  // An invariant class
```

variance question?
- if dogs are animals, then is a MyList[Dog] also a MyList[Animal]
```scala
  trait Animal
  class Dog extends Animal
  class Cat extends Animal
  class MyList[+T]
```
- yes  => generic type is COVARIANT
```scala
class MyList[+T]

val anAnimal: Animal = new Dog
val animals: MyList[Animal] = new MyList[Dog] // legal
```
- no => generic type is invariant
```scala
class MyList[T]

val anAnimal: Animal = new Dog
// will fail with an error - required Animal , found Dog
// val animals: MyList[Animal] = new MyList[Dog]
val animal: MyList[Animal] = new MyList[Animal] // only this legal
```
