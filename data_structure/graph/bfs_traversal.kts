package ds.graph

import ds.graph.BfsTraversal.Companion.GRAPH_VERTEX
import java.util.LinkedList
import java.util.Queue

fun main() {
    val bfsTraversal = BfsTraversal()

    println("Connected Graph")

    bfsTraversal.createGraph()
    bfsTraversal.printBfs()

    val visited = Array<Boolean>(GRAPH_VERTEX) { false }
    val queue = LinkedList<Int>()
    queue.add(0)
    println()
    println("Connected Graph Recursive")
    bfsTraversal.printBfsRecursive(queue, visited)
    println()

    // Disconnected graph
    bfsTraversal.createDisconnectedGraph()
    println("Disconnected Graph")
    val queueDisconnected: Queue<Int> = LinkedList()
    val visitedDisconnected = Array<Boolean>(GRAPH_VERTEX) { false }
    bfsTraversal.disconnectedGraph.forEachIndexed { index, _ ->
        if (!visitedDisconnected[index]) {
            bfsTraversal.printDisconnectedBfs(queueDisconnected, visitedDisconnected, index)
        }
    }
}

class BfsTraversal {
    companion object {
        val GRAPH_VERTEX = 7
    }

    private val graph = Array<ArrayList<Edge>>(GRAPH_VERTEX) {
        ArrayList<Edge>()
    }

    val disconnectedGraph = Array<ArrayList<Edge>>(GRAPH_VERTEX) {
        ArrayList<Edge>()
    }


    fun printBfsRecursive(queue: Queue<Int>, visited: Array<Boolean>) {
        if (queue.isEmpty()) {
            return
        }
        val curr = queue.poll()
        if (!visited[curr]) {
            print("$curr\t")
            visited[curr] = true
            graph[curr].forEach {
                queue.offer(it.dest)
            }
        }
        printBfsRecursive(queue, visited)
    }

    fun printBfs() {
        val queue: Queue<Int> = LinkedList()
        val visited = Array<Boolean>(graph.size) { false }

        queue.add(0)

        while (queue.isNotEmpty()) {
            val curr = queue.remove()
            if (!visited[curr]) {
                print("$curr\t")
                visited[curr] = true
                graph[curr].forEach {
                    queue.add(it.dest)
                }
            }
        }
    }

    fun printDisconnectedBfs(queue: Queue<Int>, visited: Array<Boolean>, src: Int) {
        queue.add(src)
        while (queue.isNotEmpty()) {
            val curr = queue.remove()
            if (!visited[curr]) {
                print("$curr\t")
                visited[curr] = true
                disconnectedGraph[curr].forEach {
                    queue.add(it.dest)
                }
            }
        }
        println()
    }

    class Edge(
        val src: Int,
        val dest: Int
    )

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

    fun createDisconnectedGraph() {

        /****
         *
         *      1 ------- 3
         *    /
         *  0                5 --- 6
         *    \             /
         *      2         4
         *
         *
         */

        disconnectedGraph[0].add(Edge(0, 1))
        disconnectedGraph[0].add(Edge(0, 2))

        disconnectedGraph[1].add(Edge(1, 3))

        disconnectedGraph[4].add(Edge(4, 5))

        disconnectedGraph[5].add(Edge(5, 6))
    }
}