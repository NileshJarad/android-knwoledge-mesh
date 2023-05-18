package graph

import graph.DfsTraversal.Companion.GRAPH_VERTEX
import java.util.Stack

/***
 * DFS (Depth first search)
 *  - Keep going to first neighbour and it's neighbour recursively
 *  - Then go to the next neighbour
 *  - Close to Tree PreOrder traversal
 */
fun main() {
    val dfsTraversal = DfsTraversal()
    dfsTraversal.createGraph()

    var visited = Array<Boolean>(GRAPH_VERTEX) {
        false
    }
    println("Dfs Recursive ")
    dfsTraversal.printDfsRecursive(0, visited, dfsTraversal.graph)


    visited = Array<Boolean>(GRAPH_VERTEX) {
        false
    }
    println()
    println("Dfs Iterative")
    dfsTraversal.printDfsIterative(0, visited, dfsTraversal.graph)

}


class DfsTraversal {
    companion object {
        val GRAPH_VERTEX = 7
    }

    class Edge(
        val src: Int,
        val dest: Int
    )

    val graph = Array<ArrayList<Edge>>(GRAPH_VERTEX) {
        ArrayList<Edge>()
    }

    fun createGraph() {

        /****
         *
         *      1 ------- 3
         *    /           | \
         *  0             |  5 --- 6
         *    \           | /
         *      2 ------- 4
         *
         *
         */

        graph[0].add(Edge(0, 1))
        graph[0].add(Edge(0, 2))

        graph[1].add(Edge(1, 3))

        graph[2].add(Edge(2, 4))

        graph[3].add(Edge(3, 4))
        graph[3].add(Edge(3, 5))

        graph[4].add(Edge(4, 3))
        graph[4].add(Edge(4, 5))

        graph[5].add(Edge(5, 6))
    }

    fun printDfsRecursive(curr: Int, visited: Array<Boolean>, graph: Array<ArrayList<Edge>>) {
        print("$curr\t")
        visited[curr] = true

        graph[curr].forEachIndexed { index, value ->
            if (!visited[value.dest]) {
                printDfsRecursive(value.dest, visited, graph)
            }
        }
    }

    fun printDfsIterative(curr: Int, visited: Array<Boolean>, graph: Array<ArrayList<Edge>>) {

        val dfsStack = Stack<Int>()

        dfsStack.push(curr)

        while (!dfsStack.isEmpty()){
            val data = dfsStack.pop()

            if(visited[data]){
                continue
            }

            visited[data] = true
            print("$data\t")
            graph[data].forEach {
                if(!visited[it.dest]){
                    dfsStack.push(it.dest)
                }
            }
        }

    }
}