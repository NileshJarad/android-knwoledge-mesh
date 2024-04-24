package tree

fun main() {
    val bst = BinarySearchTree()
    val root = bst.createBst(arrayOf(2, 5, 3, 8, 15, 9, 1, 2))
    root?.inOrderTraversal()
    val isBst = CheckIsBst().inOrderTraversalToCheckBst(root)
    println("\nTree isBst = $isBst")
}

/***
 *
 * Ap 1
 *
 * To check the BST we can use one property of BST which is
 * InOrder traversal of the BST is always sorted
 *
 * We can keep track of the last node and check if it's smaller than current else it's not BST
 */
class CheckIsBst {
    private var lastNode: BinaryNode<Int>? = null

    fun inOrderTraversalToCheckBst(node: BinaryNode<Int>?): Boolean {
        if (node == null) {
            return true
        }

        // Check that left tree is BST
        if (!inOrderTraversalToCheckBst(node.left)) {
            return false
        }
        lastNode = node
        return inOrderTraversalToCheckBst(node.right)
    }
}