package tree

import java.util.*

fun BinaryNode.postOrderTraversal() {
    this.left?.postOrderTraversal()
    this.right?.postOrderTraversal()
    print("$data - ")
}


fun BinaryNode.inOrderTraversal() {
    this.left?.inOrderTraversal()
    print("$data - ")
    this.right?.inOrderTraversal()
}

fun BinaryNode.preOrderTraversal() {
    print("$data - ")
    this.left?.preOrderTraversal()
    this.right?.preOrderTraversal()
}

fun BinaryNode.levelOrder() {
    val queue = LinkedList<BinaryNode>()
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