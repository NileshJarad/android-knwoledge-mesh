fun main() {
    val str = "Reverse the string"
    val stack = Stack<Char>()
    str.forEach {
        if (it == ' ') {
            // print the stack
            printStackUsingPop(stack)
            print(it)
        } else {
            stack.push(it)
        }
    }
    printStackUsingPop(stack)
}

private fun printStackUsingPop(stack: Stack<Char>) {
    while (!stack.isEmpty()) {
        print("${stack.pop()}")
    }
}