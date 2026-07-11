package DAY_18;

//program to implement weighted graphs
public class weightedGraphs {

    int vertices;
    int graph[][];

    weightedGraphs(int v) {
        vertices = v;
        graph = new int[vertices][vertices];
    }

    void addEdge(int source, int destination, int weight) {
        graph[source][destination] = weight;
        graph[destination][source] = weight;

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
        if (graph[source][destination] != 0) {
            System.out.println("Edge exists");
        } else {
            System.out.println("Edge does not exist");
        }
    }

    void totalEdges() {
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                if (graph[i][j] != 0) {
                    count++;
                }
            }
        }
        System.out.println("Total edges in the graph: " + count / 2);
    }

    public static void main(String[] args) {
        weightedGraphs g = new weightedGraphs(5);
        g.addEdge(0, 1, 2);
        g.addEdge(0, 3, 4);
        g.addEdge(1, 2, 3);
        g.addEdge(1, 3, 5);
        g.addEdge(2, 3, 6);
        g.addEdge(2, 4, 7);

        g.addEdge(3, 4, 8);

        g.displayGraph();
        g.edgeExists(0, 1);
        g.edgeExists(0, 2);

    }
}
