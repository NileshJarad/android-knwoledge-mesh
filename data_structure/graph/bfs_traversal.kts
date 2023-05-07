package ds.graph

import java.util.LinkedList
import java.util.Queue

fun main() {
    val bfsTraversal = BfsTraversal()
    bfsTraversal.createGraph()
    bfsTraversal.printBfs()
}

class BfsTraversal {

    private val graph = Array<ArrayList<Edge>>(7) {
        ArrayList<Edge>()
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

    class Edge(
        val src: Int,
        val dest: Int
    )

    fun createGraph() {
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
}