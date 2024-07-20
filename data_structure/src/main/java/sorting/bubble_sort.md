# Bubble sort

Iterate through the array repeatedly, comparing adjacent pairs of elements and swapping them if they are in the wrong
order. Repeat until the array is fully sorted.
At every pass it pushed the largest element to last correct position

### Code

```kotlin
fun bubbleSort(arr: IntArray) {
    val n = arr.size

    for (i in 0 until n - 1) {
        for (j in 0 until n - i - 1) {
            if (arr[j] > arr[j + 1]) {
                // Swap the elements
                val temp = arr[j]
                arr[j] = arr[j + 1]
                arr[j + 1] = temp
            }
        }
    }
}
```

### Bubble Sort Time Complexity

| **Case**     | **Time Complexity**    |
|--------------|------------------------|
| Worst-case   | O(n^2)                 |
| Average-case | O(n^2)                 |
| Best-case    | O(n) - array is sorted |
