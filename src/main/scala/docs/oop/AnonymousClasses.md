Anonymous classes

what is anonymous class?
- it is a class without a name which you assign to a some variable
- when you create anonymous class you inherit all methods from a super class
- you can only override existing method from super class but not add new one to anonymous class
- it works for abstract, non abstract and  traits



how to define anonymous class
```scala
import lectures.oop.AnonymousClasses.Animal

trait Animal {
  def eat: Unit
}
// define anonymous class
val animal = new Animal {
  override def test: Unit = println("naymnaym")
}
```
and defining anonymous class is equivalent to 
```scala
  class AnonymousClasses$anon$2 extends Animal {
    override def test: Unit = ???
    def test2:Unit = ???
  }

  new AnonymousClasses$anon$2().test2
```


in what cases we need anonymous class