package tree

open class BinaryNode(
    var data: Int,
    var left: BinaryNode? = null,
    var right: BinaryNode? = null,
    var height: Int = 0
){
    override fun toString(): String {
        return "BinaryNode(data=$data height=$height)"
    }
}