# Graph
Network of node(vertex) and edges(connection)

---
### Types of graph
- **Undirected Graph**
  - An undirected graph is a graph where the edges do not have a direction
  - The edges represent a symmetric relationship between vertices. 
  - For example, if vertex A is connected to vertex B, then vertex B is also connected to vertex A.
- **Directed Graph (Digraph)**
  - In Directed graph edges have direction
  - The edges represent asymmetric relationship between vertices, that means A is connected B, does not mean B is connected A.
- **Un-Weighted Graph**
  - Graph where edge does not have weight or cost associated with it
  - The connections between vertices are considered to have equal importance or distance.
- **Weighted Graph**
  - A weighted graph is a graph where each edge has an associated weight or cost
  - These weights can represent various quantities, such as distances, costs, or capacities

---

### Graph representation
- **Adjacency Matrix**:
  - An adjacency matrix is a 2D matrix where each cell represents an edge between two nodes.
  - If there is an edge between nodes A and B, the corresponding cell will contain a value (usually 1), and if there is no edge, the cell will contain a special value (usually 0 or infinity).
    ```agsl
       A  B  C  D
    A  0  1  1  0
    B  1  0  0  1
    C  1  0  0  1
    D  0  1  1  0
    ```
- **Adjacency List**:
  - An adjacency list represents a graph as an array (or a hash table) of lists
  - Each element of the array corresponds to a node, and the list associated with each node contains its adjacent nodes.
    ```agsl
    A: [B, C, D]
    B: [A, D]
    C: [A, D]
    D: [B, C]
    ```
  
- **Edge List**
  - The edge list representation is a simple and straightforward way to represent a graph using a list of edge
  -  In this representation, each edge of the graph is listed individually, typically with the identifiers or labels of the vertices it connects.
      ```agsl
      [(A, B), (B, C), (C, D), (D, A)]
      ```

---

### Graph Traversal
Graph traversal is the process of visiting all the nodes in a graph.
- **Depth-First Search (DFS)**: 
  - In DFS, you start at a given node and explore as far as possible along each branch before backtracking. 
  - This approach is often implemented using recursion or a stack.

- **Breadth-First Search (BFS)**: 
  - In BFS, you start at a given node and explore all its neighboring nodes before moving to the next level of nodes. 
  - This approach is often implemented using a queue.
  - Is level order traversal in terms of tree
  - [BFS traversal code](bfs_traversal.kts)
