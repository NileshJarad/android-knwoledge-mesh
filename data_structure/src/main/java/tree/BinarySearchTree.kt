package tree

fun main() {
    val bst = BinarySearchTree()
    val root = bst.createBst(arrayOf(2, 5, 3, 8, 15, 9, 1, 2))
    root?.inOrderTraversal()

    val valueToFind = 3
    println("\n $valueToFind found = ${bst.search(root, valueToFind)}")

    val valueToDelete = 15
    bst.deleteNode(root, valueToDelete)
    root?.inOrderTraversal()
}

class BinarySearchTree {

    private var root: BinaryNode<Int>? = null

    fun createBst(data: Array<Int>): BinaryNode<Int>? {
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
    fun insert(value: Int, root: BinaryNode<Int>?): BinaryNode<Int> {
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
    fun search(root: BinaryNode<Int>?, value: Int): Boolean {
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

    fun deleteNode(root: BinaryNode<Int>?, value: Int): BinaryNode<Int>? {
        root ?: return null
        when {
            value < root.data -> root.left = deleteNode(root.left, value)
            value > root.data -> root.right = deleteNode(root.right, value)
            else -> {
                when {
                    root.left == null && root.right == null -> {
                        // No children
                        return null
                    }

                    root.left == null -> {
                        // Single Child left}
                        return root.right
                    }

                    root.right == null -> {
                        // Single Child right
                        return root.left
                    }

                    else -> {   //2 Children
                        val minRight = findMinNode(root.right)
                        root.data = minRight!!.data
                        root.right = deleteNode(root.right, minRight.data)
                    }
                }
            }
        }

        return root
    }

    private fun findMinNode(root: BinaryNode<Int>?): BinaryNode<Int>? {
        var current = root
        while (current?.left != null) {
            current = current.left
        }
        return current
    }
}