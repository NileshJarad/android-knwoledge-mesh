package tree


/** Binary Search Tree:
 *
 *            60
 *           /  \
 *         50    66
 *        /     /  \
 *       40    62  90
 *      / \
 *    3    55
 *        /
 *       45
 */
fun main() {

//    val values = listOf(60, 50, 40, 66, 90, 55, 62, 3,45)
    val avlTree = AVLTree()
    avlTree.root = avlTree.insert(60, avlTree.root)
    avlTree.root = avlTree.insert(50, avlTree.root)
    avlTree.root = avlTree.insert(40, avlTree.root)
    avlTree.root = avlTree.insert(66, avlTree.root)
    avlTree.root = avlTree.insert(90, avlTree.root)
    avlTree.root = avlTree.insert(55, avlTree.root)
    avlTree.root = avlTree.insert(62, avlTree.root)
    avlTree.root = avlTree.insert(3, avlTree.root)
    avlTree.root = avlTree.insert(45, avlTree.root)
    avlTree.root?.inOrderTraversal()
    println()
}

class AVLTree {
    var root: BinaryNode? = null

    private fun balanceFactor(node: BinaryNode?): Int {
        return node?.left?.heightOfNode() ?: (0 - (node?.right?.heightOfNode() ?: 0))
    }

    fun insert(value: Int, rootNode: BinaryNode?): BinaryNode {
        if (rootNode == null) {
            return BinaryNode(data = value)
        }

        if (rootNode.data > value) {
            rootNode.left = insert(value, rootNode.left)
            rootNode.left.calculateHeight()
        } else {
            rootNode.right = insert(value, rootNode.right)
            rootNode.right.calculateHeight()
        }

        rootNode.calculateHeight()
        println("value = $value height = $rootNode")
        return rootNode
    }
}

fun BinaryNode?.calculateHeight(): Int {
    this?.height = maxOf(this?.left.heightOfNode(), this?.right.heightOfNode()) + 1
    return this?.height ?: 0
}

fun BinaryNode?.heightOfNode(): Int {
    return this?.height ?: 0
}
