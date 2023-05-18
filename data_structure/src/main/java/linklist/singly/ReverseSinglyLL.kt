package linklist.singly


fun main() {
    val singlyLL = SinglyLL<Int>()
    singlyLL.addNode(3)
    singlyLL.addNode(5)
    singlyLL.addNode(6)
    singlyLL.printSinglyLL()
    singlyLL.head = reverseSinglyLL(singlyLL.head)
    println("\nReverse the link list - Iterative")
    singlyLL.printSinglyLL()

    singlyLL.head = reverseSinglyLLRecursively(singlyLL.head)
    println("\nReverse the link list  - Recursive")
    singlyLL.printSinglyLL()
}

fun reverseSinglyLL(head: SinglyLLNode<Int>?): SinglyLLNode<Int>? {
    var curr = head
    var prev: SinglyLLNode<Int>? = null
    while (curr != null) {
        val next = curr.next
        curr.next = prev
        prev = curr
        curr = next
    }
    return prev
}

fun reverseSinglyLLRecursively(head: SinglyLLNode<Int>?): SinglyLLNode<Int>? {
    if (head?.next == null) {
        return head
    }
    val prev = reverseSinglyLLRecursively(head.next)
    head.next?.next = head
    head.next = null
    return prev
}

