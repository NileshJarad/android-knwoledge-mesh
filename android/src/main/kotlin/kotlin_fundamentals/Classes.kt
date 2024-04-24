package kotlin_fundamentals


fun main() {

}


class KotlinClass {

    var name: String = ""
        get() = field
        set(value) {
            field = value +""
        }

    var isEmpty: Boolean = false
        get() = name.isEmpty()
        set(value){
            field = value
        }


}


@JvmInline
value class Person(private val fullName: String) {
    init {
        require(fullName.isNotEmpty()) {
            "Full name can not be empty"
        }
    }

    constructor(firstName: String, lastName: String) : this("$firstName $lastName")

    val length: Int
        get() = fullName.length

    fun greet(setVal: Int) {
        println("Hello $fullName")
    }
}