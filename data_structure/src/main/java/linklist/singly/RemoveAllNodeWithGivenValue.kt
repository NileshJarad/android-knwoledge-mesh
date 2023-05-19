package linklist.singly

fun main() {
    val singlyLL = SinglyLL<Int>()
    singlyLL.addNode(3)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(6)
    singlyLL.addNode(25)
    singlyLL.addNode(5)

    singlyLL.printSinglyLL()
    removeAllWith(singlyLL.head, 5)

    print("\nRemoved all 5\n")
    singlyLL.printSinglyLL()
}

fun removeAllWith(head: SinglyLLNode<Int>?, num: Int) {
    var curr = head
    var prev: SinglyLLNode<Int>? = null
    while (curr != null) {
        if (curr.data == num) {
            prev?.next = curr.next
        }else {
            prev = curr
        }
        curr = curr.next
    }
}
