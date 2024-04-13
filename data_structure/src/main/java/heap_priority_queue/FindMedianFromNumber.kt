package heap_priority_queue

import java.util.*
import kotlin.math.min


/**
 * Find the Median of a Number Stream
 *
 *
 * Mean, median, and mode
 *
 * Mean: The "average" number; found by adding all data points and dividing by the number of data points.
 * Example: The mean of 4,1 and 7 is (4+1+7)/3 =  4
 *
 *Median: The middle number; found by ordering all data points and picking out the one in the middle
 * (or if there are two middle numbers, taking the mean of those two numbers)
 *
 * Example: The median of4,1 and 7 is 4 because when the numbers are put in order
 *
 *Mode: The most frequent number—that is, the number that occurs the highest number of times
 *
 * Example: The mode of {4,2,4,3,2,2,}4 is 2 because it occurs three times, which is more than any other number.
 *
 */
class FindMedianFromNumber {
    val maxHeap = PriorityQueue<Int>(Comparator.reverseOrder()) // left half of the array
    val minHeap = PriorityQueue<Int>(Comparator.reverseOrder()) // right half of array

    fun insertNum(num: Int) {
        if (maxHeap.isEmpty() || maxHeap.first() >= num) {
            maxHeap.offer(num);
        } else {
            minHeap.offer(num);
        }

        if (maxHeap.size > minHeap.size + 1) {
            minHeap.offer(maxHeap.poll()) // remove head from max heap and add it to minHeap
        } else {
            maxHeap.offer(minHeap.poll()) // remove head from min heap and add it to maxHeap
        }
    }

    fun median(): Float {
        if (minHeap.size == maxHeap.size) {
            return (minHeap.peek() + maxHeap.peek()) / 2F
        } else {
            return maxHeap.peek().toFloat()
        }
    }
}
/**
 * Time complexity #
 * The time complexity of the insertNum() will be O(logN) due to the insertion in the heap.
 * The time complexity of the findMedian() will be O(1) as we can find the median from the top elements of the heaps.
 *
 * Space complexity #
 * The space complexity will be O(N) because, as at any time, we will be storing all the numbers.
 */