package DAY_18;

//list represented graph using array of linked list

import java.util.LinkedList;

public class listRepersented {

    int vertices;
    LinkedList<Integer> graph[];

    listRepersented(int v) {
        this.vertices = v;
        this.graph = new LinkedList[vertices];

        for (int i = 0; i < vertices; i++) {
            this.graph[i] = new LinkedList<>();
        }
    }

    void addEdge(int source, int destination) {
        graph[source].add(destination);
        graph[destination].add(source); // For undirected graph
    }

    void displayGraph() {
        for (int i = 0; i < vertices; i++) {
            System.out.print("Vertex " + i + ": ");
            for (int j : graph[i]) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

    void removeEdge(int source, int destination) {
        graph[source].remove(Integer.valueOf(destination));
        graph[destination].remove(Integer.valueOf(source)); // For undirected graph
    }

    void edgeExists(int source, int destination) {
        if (graph[source].contains(destination)) {
            System.out.println("Edge exists between ");
        } else {
            System.out.println("Edge does not exist between ");
        }
    }

    void totalEdges() {
        int count = 0;
        for (int i = 0; i < vertices; i++) {
            count += graph[i].size();
        }
        System.out.println("Total number of edges: " + (count / 2)); // Divide by 2 for undirected graph
    }

    // class Graphs {
    public static void main(String[] args) {
        listRepersented g = new listRepersented(5);
        g.addEdge(0, 1);
        g.addEdge(0, 3);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(2, 3);
        g.addEdge(2, 4);

        g.displayGraph();

        g.removeEdge(0, 3);
        // g.removeEdge(1, 3);
        g.displayGraph();
        g.edgeExists(0, 1);
        g.totalEdges();
    }
}
// }