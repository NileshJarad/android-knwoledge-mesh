package heap_priority_queue

import java.util.*

fun main() {
//    InbuiltHeap().buildMaxHeap()

    val input = intArrayOf(1, 3, 5, 4, 6, 13, 10, 9, 8, 15, 17)
    val heapCustom = HeapCustom(true)
    input.forEach {
        heapCustom.push(it)
    }
    heapCustom.print()
    println()
    heapCustom.pop()
    println()
    heapCustom.print()

}

class InbuiltHeap {
    fun buildMaxHeap() {
        // Creating a max heap PriorityQueue
        val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder()) // by default its min heap, natural ordering

        // Inserting elements into the max heap
        maxHeap.add(10)
        maxHeap.add(20)
        maxHeap.add(15)
        maxHeap.add(30)

        print(maxHeap)

        // Extract the maximum element (root of the max heap)
//        println(maxHeap.poll()) // Output: 30
//        println(maxHeap.poll()) // Output: 20
//        println(maxHeap.poll()) // Output: 15
//        println(maxHeap.poll()) // Output: 10
        while (maxHeap.isNotEmpty()) {
            println(maxHeap.poll())
        }
    }
}