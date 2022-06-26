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

  val animal = new Cat()
  val animalList:MyList[Animal] = new MyList[Cat]
  // if animalList.add(new Dog()) ??? question - can we add this?  
  // we can solve it by making list more general - list of animals instead of list of cats

  class MyList[+T] {
    def add[B>:T](element:B):MyList[B]

    /**
     * T - list of cats
     * B - is a dog = animal
     * so we make list of cats a list of animals instead
     * by adding a supertype of B
     */
  }
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
