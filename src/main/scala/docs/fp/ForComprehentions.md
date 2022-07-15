for comprehentions

- it is syntactic sugar for flatmap map representation
- more user friendly representation for flatmap map
- data structures that have methods below can have for comprehentions
  - map[B>:A] (f:A=>B):Container[B]
    - just extract element and apply function to it
  - flatmap[B>:A] (f:A=>Container[B]):Container[B]
    - accept function and for each element return a list of elements
    - probably thay concatinate all lists at the end with some ++
  - filter(f:A=>Boolean):Container[A]
    - accept predicat and emit values that is not true

```scala
val numbers = List(1, 2, 3, 4)
val chars = List('a', 'b', 'c', 'd')

val combinedList = chars.flatMap {
  char =>
    numbers.map { number =>
      s"$char$number"
    }
}

val forC = for {
  char <- chars
  nummber <- numbers
} yield "" + char + nummber

// result are the same
println(combinedList) //  List(a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4)
println(forC)         //  List(a1, a2, a3, a4, b1, b2, b3, b4, c1, c2, c3, c4, d1, d2, d3, d4)
```