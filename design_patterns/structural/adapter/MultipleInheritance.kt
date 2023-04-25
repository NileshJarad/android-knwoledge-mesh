


//class TestMultipleInheritance: FirstClass(2), SecondClass(3) {
//    /**
//     * Java Doesn't support this multiple is-A relationship, unlike other programming laguages such as c++
//     *
//     */
//    override fun show(): Int {
//        TODO("Not yet implemented")
//    }
//    override fun show(): Int {
//        TODO("Not yet implemented")
//    }
//}

class SimpleInheritance: FirstClass(2) {
    fun print() {
        println(show())
    }
}

open class FirstClass() {
    private var value = 0
    constructor(value: Int) : this() {
        this.value = value
    }
    fun show(): Int {
        return value
    }
}

open class SecondClass() {
    private var value = 0
    constructor(value: Int) : this() {
        this.value = value
    }
    internal fun show(): Int {
        return value
    }
}
