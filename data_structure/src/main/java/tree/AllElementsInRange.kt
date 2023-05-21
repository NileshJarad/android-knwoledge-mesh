package tree


fun main() {
    val bst = BinarySearchTree()
    val root = bst.createBst(arrayOf(8, 3, 10, 1, 6, 14, 4, 7, 13))
    root?.inOrderTraversal()
    println()
    printInRange(root, 5, 12)
}


fun printInRange(root: BinaryNode?, n1: Int, n2: Int) {
    root?.let {
        printInRange(it.left, n1, n2)
        if (it.data in n1..n2) {
            print("${it.data} - ")
        }
        printInRange(it.right, n1, n2)
    }
}