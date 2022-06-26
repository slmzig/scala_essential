package lectures.oop

object Variance extends App {

  trait Animal

  class Dog extends Animal

  class Cat extends Animal

  /**
   * variance is helpful when you create your own data scructure
   * variance question?
   *
   * if dogs are animals, then is a MyList[Dog] also a MyList[Animal]
   */

  // 1 - yes => generic type is COVARIANT
  object Covariant {
    class MyList[+T]

    val anAnimal: Animal = new Dog
    val animals: MyList[Animal] = new MyList[Dog]
  }

  // 2 - no => generic type is invariant
  object Invariant {
    class MyList[T]

    val anAnimal: Animal = new Dog
    // will fail with an error - required Animal , found Dog
    // val animals: MyList[Animal] = new MyList[Dog]
    val animal: MyList[Animal] = new MyList[Animal]
  }

  // 3 no - backwards => generic type is CONTRAVARIANT

  object Contravariant {
    class Vet[-T]

    val lessiVet: Vet[Dog] = new Vet[Animal] // legal
    val lessiVet2: Vet[Dog] = new Vet[Dog] // legal
    // val lessiVet3: Vet[Animal] = new Vet[Dog] // not legal

  }

  // variance problem
  object VarianceProblem {

    /**
     *
     * this will cause an error
     * covariant type T occurs in contravariant position in type T of parameter element
     */
    /*
        abstract class MyList[+T] {
              def add(element:T):MyList[T]
        }
    */

    abstract class MyList[+T] {
      def add[B >: T](element: B): MyList[B]
    }


    class Vet1[-T] {
      def name[S <: T](element: T): S = ??? // legal
    }

    /**
     *
     */

    // class Vet[+T](val favouriteAnimal:T) // legal
    // class Vet[T](val favouriteAnimal:T) // legal
    // class Vet[-T](val favouriteAnimal:T) // not legal contravariant type T occurs in covariant position in type T of value favouriteAnimal

    /**
     * class Vet[-T] {
     * def name:T = ??? // not legal contravariant type T occurs in covariant position in type => T of method name
     * }
     *
     * class Vet2[+T] {
     * def name:T = ???
     * }
     *
     * class Vet3[T] {
     * def name:T = ???
     * }
     * */

    /*
    class Vet1[T] {
      def name(element: T): Unit = ??? // legal
    }

    class Vet2[+T] {
      def name(element: T): Unit = ??? // not legal covariant type T occurs in contravariant position in type T of parameter element
    }

    class Vet3[-T] {
      def name(element: T): Unit = ??? // legal
    }
    */
  }

  /**
   * so: VARIANCE POSITIONS
   *
   * methods return type is in COVARIANT position
   * type of class fields vals is in COVARIANT position
   * type of class fields vars is in COVARIANT and CONTRAVARIANT position
   * type of method argument is in CONTRAVARIANT position
   *
   * HOW TO SOLVE:
   *
   * covariant + methods argument: widen the type
   * contravariant + method return type: narrow the type
   */

}
