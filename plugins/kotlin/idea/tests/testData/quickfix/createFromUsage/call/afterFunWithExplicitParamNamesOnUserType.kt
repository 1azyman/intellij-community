// "Create function 'foo' from usage" "true"

class A<T>(val n: T) {
    fun foo(abc: T, ghi: A<T>, def: String): A<T> {
        throw UnsupportedOperationException("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}

fun test() {
    val a: A<Int> = A(1).foo(abc = 1, ghi = A(2), def = "s")
}