Class
- [defining class](#defining-a-class)
- [creating instance of class](#creating-instance-of-class)
- [constructor of class](#constructor-of-class)
- auxiliary constructor
- class params
- class fields
- params vs fields
- methods notations
- class methods
- overloading methods
- extending class
- abstract classes
- implicit classes
- anonymous classes
- class vs trait
- final keyword
- seal keyword

##### defining a class
- class is a blueprint for class instances
- we can then create new objects (instances) from the class
- we can define class with a `class` keyword
```scala
class Person
```

##### creating instance of class
- you can create an instance of a class with keyword `new`
```scala
  val person = new Person()
```

##### constructor of class
- we can add arguments to class constructor
```scala
class Person(name:String, age:Int)
```
- you can use class arguments inside class
```scala
  class Writer(firstName: String, surname: String, year: String) {
    def fullName:String = {
      s"$firstName $surname"
    }
  }
```
- but you can not call it from instance
```scala
class Person(name:String, age:Int)

val person = new Person("name", 20)
person.name // will not compile
```
- you can use it from class instance after your prepend val or val before argument
```scala
class Person(val name:String, age:Int)

val person = new Person("name", 20)
person.name // will compile
```

- `final` declares that a member may not be overridden in subclasses
```scala
//legal
class A {
    val a = 1
}

class B extends A {
    override val a = 2
}

//Illegal:

class A {
    final val a = 1
}

class B extends A {
    override val a = 2
}

```
- `sealed` keyword Declaring a class or trait as sealed restricts where we can define its subclasses — we have to define them in the same source file.
  - Using sealed classes, we can guarantee that only subclasses defined in the file exist
  - This helps the compiler know all the subclasses of the sealed class
  - Therefore, this behavior is useful in scenarios like pattern matching
  - The compiler can emit warnings in case the match cases are not exhaustive, to prevent a MatchError exception