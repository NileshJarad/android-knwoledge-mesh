# Selection sort

Selection sort is a simple sorting algorithm that works by repeatedly finding the minimum element from the unsorted
portion of the array and swapping it with the first unsorted element.

### Code

```kotlin
fun selectionSort(arr: IntArray) {
    val n = arr.size

    for (i in 0 until n - 1) {
        var minIndex = i
        // Find the index of the minimum element in the unsorted portion
        for (j in i + 1 until n) {
            if (arr[j] < arr[minIndex]) {
                minIndex = j
            }
        }

        // Swap the minimum element with the first unsorted element
        if (minIndex != i) {
            val temp = arr[i]
            arr[i] = arr[minIndex]
            arr[minIndex] = temp
        }
    }
}
```

### Selection Sort Time Complexity

| **Case**     | **Time Complexity** |
|--------------|---------------------|
| Worst-case   | O(n^2)              |
| Average-case | O(n^2)              |
| Best-case    | O(n^2)              |

