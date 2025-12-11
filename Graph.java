import java.util.*;

class Graph {

    private int V;                          // Number of vertices
    private LinkedList<Integer> adj[];      // Adjacency list

    Graph(int v) {
        V = v;
        adj = new LinkedList[v];

        for (int i = 0; i < v; i++)
            adj[i] = new LinkedList<>();
    }

    // Add edge to graph
    void addEdge(int v, int w) {
        adj[v].add(w);
    }

    // BFS Traversal
    void BFS(int s) {

        boolean visited[] = new boolean[V];
        LinkedList<Integer> queue = new LinkedList<>();

        visited[s] = true;
        queue.add(s);

        System.out.print("BFS Traversal: ");

        while (!queue.isEmpty()) {

            s = queue.poll();
            System.out.print(s + " ");

            for (int n : adj[s]) {
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }
        System.out.println();
    }

    public static void main(String args[]) {

        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);

        g.BFS(2);
    }
}
