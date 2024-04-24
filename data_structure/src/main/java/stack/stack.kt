fun main() {

    val stack = Stack<Int>()
    stack.push(4)
    val peekElement = stack.peek()
    println("Top of stack is $peekElement")
    stack.push(3)
    stack.push(53)
    stack.push(536)
    stack.push(14)
    val poppedElement = stack.pop()
    println("Popped Element of stack is $poppedElement")
    stack.printStack()

}

fun <T> Stack<T>.printStack() {
    println("\nStack elements :")
    stk.reversed().forEach {
        print("$it \t")
    }
}

class Stack<T> {
    val stk = ArrayList<T>()
    var top = -1

    fun push(value: T) {
        stk.add(value)
        top++
    }

    fun pop(): T {
        if (!isEmpty()) {
            val poppedElement = stk.removeAt(top)
            top--
            return poppedElement
        } else {
            throw RuntimeException("Stack is empty")
        }
    }

    fun peek(): T {
        if (!isEmpty()) {
            return stk[top]
        } else {
            throw RuntimeException("Stack is empty")
        }
    }

    fun isEmpty(): Boolean {
        return top < 0
    }
}