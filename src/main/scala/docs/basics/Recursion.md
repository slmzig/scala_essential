Facts
- Recursion is a function that call itself
- Recursion can substitute a loop
- Recursion is more functional way

type of recursions:
- head recursion
- tail recursion


non tail recursion:
- uses new stack of memory for each iteration to save result of iteration
- there is a risk to get stackoverflow exception

tail recursion:
- can be optimazed by compiler
- use the same stack of memory for each iteration because it keeps result in accumulator
- considered better than non tail
- it is considered as tail when recursive call is the last thing to do in function
- we can use the @tailrec annotation to confirm that our algorithm is tail recursive