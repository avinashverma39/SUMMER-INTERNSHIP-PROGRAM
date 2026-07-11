package DAY_18;

public class Graphs {

    int vertices;
    int graph[][];

    Graphs(int v) {
        vertices = v;
        graph = new int[vertices][vertices];
    }

    void addEdge(int source, int destination) {
        graph[source][destination] = 1;
        graph[destination][source] = 1;
        
    }

    public static void main(String[] args) {
        Graphs g = new Graphs(5);
        g.addEdge(0, 1);
        g.addEdge(0, 4);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 4);
        g.addEdge(2, 3);
        g.addEdge(3, 4);
        System.out.println("Graph is: ");


        for (int i = 0; i < g.vertices; i++) {
            for (int j = 0; j < g.vertices; j++) {
                System.out.print(g.graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}
