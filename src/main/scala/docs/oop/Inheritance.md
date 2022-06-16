Inheritance

- class can inherit from other class or traits
- it can be single and multiple class inheritance
- class inherits all non private fields and methods
- so we can use public and protected methods of parent class
- we can also override methods of a superclass

```scala
  class Animal {}
  class Cat extends Animal
```

```scala
  class Animal {
    def eat = println("nomnom")
  }
  class Cat extends Animal

  new Cat().eat // thanks to inheritance we can get eat method
```

```scala
  class Animal {
  def eat = println("nomnom")
}
  class Dog extends Animal {
    override def eat = println("clats clats")
  }
  
  println(new Dog().eat) // will print clats clats instead of nomnom
```