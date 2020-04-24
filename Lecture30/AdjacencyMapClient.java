package Lecture30;

public class AdjacencyMapClient {
    public static void main(String[] args) {
        AdjacencyMapGraph<String> graph=new AdjacencyMapGraph();

        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("D");

        graph.addEdge("A","B");
        graph.addEdge("A","C");
        graph.addEdge("C","B");
        graph.addEdge("D","C");
        graph.display();
    }
}
