# HashMap
- Stores data in key value pair
- Can contain only one null key
- Can contains multiple empty values again keys

| Operation | Average | Worst |
|-----------|---------|-------|
| Insert    | O(1)    | O(N)  |
| Delete    | O(1)    | O(N)  |
| Search    | O(1)    | O(N)  |
| Access    | O(1)    | O(N)  |



> **Average Case (O(1)):** This assumes that the hash function distributes keys uniformly across the hash table and the number of collisions is minimal. Under ideal conditions, the HashMap operations take constant time to execute.

> **Worst Case (O(n)):** In the worst-case scenario, all keys could hash to the same bucket due to hash collisions or poor hash function performance. When this happens, the hash table essentially degrades into a linked list of entries, making operations like put, remove, and get take linear time relative to the number of entries in the map (O(n)).