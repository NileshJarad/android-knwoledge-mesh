package tree

import java.util.*

fun <T> BinaryNode<T>.postOrderTraversal() {
    this.left?.postOrderTraversal()
    this.right?.postOrderTraversal()
    print("$data - ")
}


fun <T> BinaryNode<T>.inOrderTraversal() {
    this.left?.inOrderTraversal()
    print("$data - ")
    this.right?.inOrderTraversal()
}

fun <T> BinaryNode<T>.preOrderTraversal() {
    print("$data - ")
    this.left?.preOrderTraversal()
    this.right?.preOrderTraversal()
}

fun <T> BinaryNode<T>.levelOrder() {
    val queue = LinkedList<BinaryNode<T>>()
    queue.push(this)
    while (!queue.isEmpty()) {
        val pop = queue.pop()
        print("${pop?.data} - ")
        if (pop.left != null) {
            queue.add(pop.left!!)
        }
        if (pop.right != null) {
            queue.add(pop.right!!)
        }
    }
}