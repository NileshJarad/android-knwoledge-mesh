fun main() {
    val str = "Reverse the string"
    val stack = Stack<Char>()

    str.forEach {
        stack.push(it)
    }

    while (!stack.isEmpty()) {
        print("${stack.pop()}")
    }

}
