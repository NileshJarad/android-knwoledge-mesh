package graph

fun main() {

    val dfsTraversal = DfsTraversal()
    dfsTraversal.createGraph()
    dfsTraversal.printGraph()
    dfsTraversal.depthFirstSearch()
}

class DfsTraversal {


    companion object {
        const val GRAPH_VERTEX = 7
    }

    private val graph = Array<ArrayList<Edge>>(GRAPH_VERTEX) {
        // Creating an empty list, to avoid having null checks within edges
        ArrayList<Edge>()
    }

    data class Edge(
        val src : Int,
        val dest: Int
    )

    fun depthFirstSearch() {

        val visited = Array(graph.size) { false }
        printDFS(0, visited)
    }

    private fun printDFS(currentV: Int, visited: Array<Boolean>) {
        print("$currentV ")
        visited[currentV] = true
        val edges = graph[currentV]
        edges.forEach {
            if (!visited[it.dest]) {
                printDFS(it.dest, visited)
            }
        }
    }

    fun createGraph() {
        /***
         *      1 ------- 3
         *    /           | \
         *  0             |  5 --- 6
         *    \           | /
         *      2 ------- 4
         */
        graph[0].add(Edge(0,1))
        graph[0].add(Edge(0,2))

        graph[1].add(Edge(1,3))

        graph[2].add(Edge(2,4))

        graph[3].add(Edge(3,4))
        graph[3].add(Edge(3,5))

        graph[4].add(Edge(4,3))
        graph[4].add(Edge(4,5))

        graph[5].add(Edge(5,6))
    }

    fun printGraph() {
        for (i: Int in graph.indices) {
            if (graph[i].size > 0) {
                print("$i --> ")
                for (j: Int in 0 until graph[i].size) {
                    val edge = graph[i][j]
                    print("(${edge.src}, ${edge.dest})")
                }
                println()
            } else {
                println("$i --> empty")
            }
        }
    }
}