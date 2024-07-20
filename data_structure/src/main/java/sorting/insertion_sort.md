# Insertion sort


Build up a sorted sub-array from left to right by inserting each new element into its correct position in the subarray. Repeat until the array is fully sorted.


### Code
```kotlin
fun insertionSort(arr: IntArray) {
    val n = arr.size
    for (i in 1 until n) {
        val key = arr[i]
        var j = i - 1
        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
}
```


### Insertion  Sort Time Complexity

| **Case**     | **Time Complexity**    |
|--------------|------------------------|
| Worst-case   | O(n^2)                 |
| Average-case | O(n^2)                 |
| Best-case    | O(n) - array is sorted |
