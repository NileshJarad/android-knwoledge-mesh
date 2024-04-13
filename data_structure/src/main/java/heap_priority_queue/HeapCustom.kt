package heap_priority_queue

import java.util.*

class HeapCustom(private val isMinHeap: Boolean) {
    var heap = mutableListOf<Int>()

    fun push(value: Int) {
        heap.add(value)

        var currentItemIndex = heap.size - 1
        var parent = getParentIndex(currentItemIndex)

        if (isMinHeap) {
            while (currentItemIndex != 0 && heap[currentItemIndex] < heap[parent]) {
                Collections.swap(heap, currentItemIndex, parent)
                currentItemIndex = parent
                parent = getParentIndex(parent)
            }
        } else {
            while (currentItemIndex != 0 && heap[currentItemIndex] > heap[parent]) {
                Collections.swap(heap, currentItemIndex, parent)
                currentItemIndex = parent
                parent = getParentIndex(parent)
            }
        }
    }

    fun pop(): Int {
        val data = heap[0]
        Collections.swap(heap, 0, heap.size - 1)
        heap.removeLast()
        heapify(0)
        return data
    }

    fun heapify(currentIndex: Int) {
        val left = 2 * currentIndex + 1
        val right = 2 * currentIndex + 2

        var index = currentIndex

        val headpSize = heap.size
        if (isMinHeap) {
            if (left < headpSize && heap[left] < heap[index]) {
                index = left
            }
            if (right < headpSize && heap[right] < heap[index]) {
                index = right
            }
        } else {
            if (left < headpSize && heap[left] > heap[index]) {
                index = left
            }
            if (right < headpSize && heap[right] > heap[index]) {
                index = right
            }
        }
        if (index != currentIndex) {
            Collections.swap(heap, currentIndex, index)
            heapify(index)
        }
    }


    private fun getParentIndex(currentItemIndex: Int) = (currentItemIndex - 1) / 2

    fun print() {
        heap.forEachIndexed { index, values ->
            print(
                "$values${
                    if (index != heap.size - 1) {
                        ", "
                    } else {
                        ""
                    }
                }"
            )
        }
    }
}