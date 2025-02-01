```groovy
def myMethod(List<Integer> numbers) {
  numbers.each { number ->
    println number?.toString() ?: "Null value encountered"
  }
}

myMethod([1, 2, null, 4])
```