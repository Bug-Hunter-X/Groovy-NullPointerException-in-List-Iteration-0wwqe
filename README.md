# Groovy NullPointerException Handling in List Iteration

This example demonstrates a common error in Groovy when processing lists: the `NullPointerException`. The code iterates through a list of integers, but doesn't handle the case where a list element is `null`. This leads to a runtime exception.

The solution demonstrates how to gracefully handle null values using Groovy's safe navigation operator (`?.`) and the elvis operator (`?:`).