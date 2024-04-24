# Heap (Priority Queue)

>A heap is a specialized tree-based data structure that satisfies the heap property. The heap property can be of two types: max-heap and min-heap. In a max-heap, for any given node
i, the value of the node is greater than or equal to the values of its children. In a min-heap, for any given node
i, the value of the node is less than or equal to the values of its children.

- Heaps are specialized tree-based data structures that satisfy the heap property, which specifies the relationship between parent and child nodes. In a max-heap, for any given node i, the value of the node is greater than or equal to the values of its children. In a min-heap, the opposite holds true.

- Heaps are typically implemented using arrays, where the elements are arranged in a way that satisfies the heap property. However, the elements are not necessarily sorted in ascending or descending order.
- **Heap is complete binary tree**
- **Heap is implemented Queue and visualised as Tree.**

Below is complete Binary tree

[PlatUml Tree](https://www.plantuml.com/plantuml/uml/SoWkIImgoStCIybDBE0goIzGACbNICelASdFLKZ9B4fDBidCp-FIKZ0qCE3Iqb8m0P90oWX26OF5J24SGrCkXzIy5AXH0000)

![alt](https://www.plantuml.com/plantuml/png/SoWkIImgoStCIybDBE0goIzGACbNICelASdFLKZ9B4fDBidCp-FIKZ0qCE3Iqb8m0P90oWX26OF5J24SGrCkXzIy5AXH0000) 


Complete binary tree can be easily flatten into **Array / Queue**
Using below logic

>If the Parent is at 0 then  
> Left child = 2i+1  
> Right child = 2i+2
> Parent = (i-1)/2

>If the Parent is at 1 then  
> Left child = 2i  
> Right child = 2i+1
> Parent  = i/2


## Basic operation
1. Insert
2. Remove
3. Heapify (Sorting)

