package tree

fun main() {
    val bst = BinarySearchTree()
    val root = bst.createBst(arrayOf(2, 5, 3, 8, 15, 9, 1, 2))
    root?.inOrderTraversal()
    val valueToFind = 3
    print("\n $valueToFind found = ${bst.search(root, valueToFind)}")
}

class BinarySearchTree {

    private var root: BinaryNode? = null

    fun createBst(data: Array<Int>): BinaryNode? {
        data.forEach {
            root = insert(it, root)
        }
        return root
    }


    /***
     * Complexity of code
     *
     *  O(h) - height
     *
     */
    fun insert(value: Int, root: BinaryNode?): BinaryNode {
        if (root == null) {
            return BinaryNode(data = value)
        }
        if (value < root.data) {
            root.left = insert(value, root.left)
        } else {
            root.right = insert(value, root.right)
        }
        return root
    }


    /***
     * Complexity of code
     *
     *  O(h) - height
     *
     */
    fun search(root: BinaryNode?, value: Int): Boolean {
        root?.let {
            if (it.data == value) {
                return true
            }
            if (value < it.data) {
                return search(it.left, value)
            }
            return search(it.right, value)
        }
        return false
    }

}