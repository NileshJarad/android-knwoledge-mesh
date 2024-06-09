package kotlin_fundamentals


fun main() {
    print("sol =${Solution().longestCommonPrefix(arrayOf("flower","flow","flight"))}")
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


internal class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.size == 0) return ""
        var prefix = strs[0]

        strs.forEach{ data ->
            while(data.indexOf(prefix) != 0){
                prefix = prefix.substring(0, prefix.length - 1)
                println("prefix $prefix")
            }
        }
        return prefix
    }
}