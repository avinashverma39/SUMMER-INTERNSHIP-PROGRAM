package DAY_18;

public class directedGraphs {

    int vertices;
    int graph[][];

    directedGraphs(int v) {
        vertices = v;
        graph = new int[vertices][vertices];
    }

    void addEdge(int source, int destination) {
        graph[source][destination] = 1;
        // graph[destination][source] = 1;

    }

    void displayGraph() {
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    void removeEdge(int source, int destination) {
        graph[source][destination] = 0;
        graph[destination][source] = 0;
    }

    void edgeExists(int source, int destination) {
        if (graph[source][destination] == 1) {
            System.out.println("Edge exists");
        } else {
            System.out.println("Edge does not exist");
        }
    }

    void totalEdges() {
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] == 1) {
                    count++;
                }
            }
        }
        System.out.println("Total edges in the graph: " + count / 2);
    }

    public static void main(String[] args) {
        Graphs g = new Graphs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 4);
        System.out.println("Graph is: ");

        g.displayGraph();
        System.out.println(" ");
        g.removeEdge(1, 3);
        g.edgeExists(1, 4);

        for (int i = 0; i < g.vertices; i++) {
            for (int j = 0; j < g.vertices; j++) {
                System.out.print(g.graph[i][j] + " ");
            }
            System.out.println();
        }
        g.totalEdges();
    }
}
