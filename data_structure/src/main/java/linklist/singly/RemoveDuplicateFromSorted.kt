package linklist.singly

import kotlin.math.sin

fun main() {
    val singlyLL = SinglyLL<Int>()
    singlyLL.addNode(3)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(5)
    singlyLL.addNode(6)
    singlyLL.addNode(8)
    singlyLL.addNode(8)
    singlyLL.addNode(8)
    singlyLL.addNode(12)
    singlyLL.addNode(1)
    singlyLL.addNode(1)
    singlyLL.addNode(25)
    singlyLL.addNode(25)

    singlyLL.printSinglyLL()
    removeDuplicateFromSortedLinkList(singlyLL.head)

    print("\nRemoved duplicates\n")
    singlyLL.printSinglyLL()
}

fun removeDuplicateFromSortedLinkList(head: SinglyLLNode<Int>?) {
    var curr = head

    while (curr != null) {
        var temp = curr

        /**
         * Move temp until its null or we find another number that is not matching with current value
         */
        while (temp != null && temp.data == curr.data) {
            temp = temp.next
        }

        curr.next = temp
        curr = curr.next // go to next number to find duplicate
    }
}