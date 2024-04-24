package linklist.singly


fun main() {
    val singlyLL = SinglyLL<Int>()
    singlyLL.addNode(3)
    singlyLL.addNode(5)
    singlyLL.addNode(6)
    singlyLL.addNode(8)
    singlyLL.addNode(12)
    singlyLL.addNode(1)
    singlyLL.addNode(25)

    singlyLL.printSinglyLL()
    printNthNodeFromLast(singlyLL.head, 3)
    removeNthNodeFromLast(singlyLL.head, 3)
    println()
    singlyLL.printSinglyLL()
}


fun printNthNodeFromLast(head: SinglyLLNode<Int>?, n: Int) {
    var fast = head
    var slow = head
    var cnt = 0
    while (cnt < n ) { // move faster pointer with 1 point ahead of position
        fast = fast?.next
        cnt++
    }
    while (fast != null) {
        slow = slow?.next
        fast = fast.next
    }
    print("\n $n the element from last is ${slow?.data}")

}
fun removeNthNodeFromLast(head: SinglyLLNode<Int>?, n: Int) {
    var fast = head
    var slow = head
    var cnt = 0
    while (cnt < n + 1) { // move faster pointer with 2 point extras using + 1 and cnt++
        fast = fast?.next
        cnt++
    }
    while (fast != null) {
        slow = slow?.next
        fast = fast.next
    }
    slow?.next = slow?.next?.next
}