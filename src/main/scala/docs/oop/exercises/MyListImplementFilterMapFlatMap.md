task is to extend MyList

1. Generic trait MyPredicate[-T]
2. Generic trait MyTransformer[-A,B]
3. MyList:
   1. map(transformer) => MyList
   2. filter(predicate) => MyList
   3. flatMap(transformer from A to MyList[B]) => MyList[B]

class EventPredicate extends MyPredicate[Int]
class StringToIntTransformer extends MyTransformer[String, Int]

[1,2,3].map(n*2) = [2,4,6]
[1,2,3,4].filter(n%2) = [2,4]
[1,2,3].flatMap(n => [n, n+1]) => [1,2,2,3,3,4]

[implementation](../../../exercises/oop/MyListImplementFilterMapFlatMap.scala)