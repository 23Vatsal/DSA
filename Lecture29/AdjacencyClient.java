package Lecture29;

public class AdjacencyClient {
    public static void main(String[] args) {
        AdjacencyListGraph<String> graph=new AdjacencyListGraph<>();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");
        //graph.addVertex("E");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("B","D");
        graph.addEdge("A","D");
        graph.addEdge("C","D");

        //graph.DFS();
        //graph.connectedComp();
        System.out.println(graph.bipartite());
    }
}
