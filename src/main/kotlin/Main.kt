class NoGenerics(val value: String)

class Generics<T>(val value: T)

// No error
fun NoGenerics(value: Int): NoGenerics = NoGenerics(value.toString())

// No error
fun <T> NoGenerics(value: T): NoGenerics = NoGenerics(value.toString())

// Error: support one-liner
fun NoGenerics(value: Double) = NoGenerics(value.toString())

// Error
fun <T> Generics(action: () -> T): Generics<T> = Generics(action())

fun main(args: Array<String>) {}
