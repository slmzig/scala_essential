Functions in Purely Functional Programming Languages are exactly like Functions in Mathematics: they produce a result value based on their argument values and only based on their argument values.

A Side-Effect (often just called Effect) is everything else. I.e. everything that is not reading the arguments and returning a result is a Side-Effect.

This includes, but is not limited to:

    mutating state,
    reading input from the console,
    printing output to the console,
    reading, creating, deleting, or writing to files,
    reading or writing from the network,
    Reflection,
    depending on the current time,
    launching or aborting a thread or process, or
    really any kind of I/O, and most importantly
    calling an impure function.
