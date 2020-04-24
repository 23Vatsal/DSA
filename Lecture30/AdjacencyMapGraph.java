package Lecture30;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class AdjacencyMapGraph<T> {

    Map<T,Vertex> vertexMap;
    Map<Vertex,Vertex> parent=new HashMap<>();

    public AdjacencyMapGraph() {
        this.vertexMap = new HashMap<>();
    }

    public void addVertex(T value){
        vertexMap.put(value,new Vertex(value));
    }

    public void addEdge(T first,T second){

        vertexMap.get(first).neighbour.put(vertexMap.get(second),1);
        vertexMap.get(second).neighbour.put(vertexMap.get(first),1);
    }
    public void addEdgeWeight(T first,T second,Integer weight){
        vertexMap.get(first).neighbour.put(vertexMap.get(second),weight);
        vertexMap.get(second).neighbour.put(vertexMap.get(first),weight);
    }
    public void display(){
        for(T vertex: vertexMap.keySet()){
            System.out.print(vertex+ " => ");

            for (Vertex padosi:vertexMap.get(vertex).neighbour.keySet()
                 ) {
                System.out.print(padosi.value+" ");
            }
            System.out.println();
        }
    }
    public void setParent(){
        for(Vertex vertex:vertexMap.values()){
            parent.put(vertex,null);
        }
    }
    public boolean union(Vertex first,Vertex second){
        Vertex f=find(first);
        Vertex s=find(second);
        if(f!=s){
            parent.put(f,s);
            return true;
        }
        return false;
    }
    private Vertex find(Vertex v){
        while(parent.get(v)!=null){
            v=parent.get(v);
        }
        return v;
    }

    /*public AdjacencyMapGraph<T> kruskal(){
        ArrayList<Edge> edges=new ArrayList<Edge>();
        AdjacencyMapGraph<T> map=new AdjacencyMapGraph<>();
        
    }*/

    class Vertex{
        T value;
        Map<Vertex,Integer> neighbour;

        public Vertex(T value){
            this.value=value;
            this.neighbour=new HashMap<>();
        }
    }
    class Edge{
        Vertex first;
        Vertex second;
        Integer weight;

        public Edge(Vertex first, Vertex second, Integer weight) {
            this.first = first;
            this.second = second;
            this.weight = weight;
        }
    }
}
