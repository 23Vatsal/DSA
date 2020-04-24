package Lecture29;

import java.util.*;

public class AdjacencyListGraph<T> {
    LinkedList<Vertex> vertices;
    public AdjacencyListGraph(){
        this.vertices=new LinkedList<>();
    }
    public void addVertex(T value){
        vertices.add(new Vertex(value));
    }

    public void addEdge(T first, T second){
        Vertex F=get(first);
        Vertex S=get(second);
        //checks if input vertices exists or not
        if(F!=null && S!=null){
            F.neighbour.add(S);
            S.neighbour.add(F);
        }
    }
    public Vertex get(T value){
        for(Vertex vertex: vertices){
            if(vertex.value.equals(value)){
                return vertex;
            }
        }
        return null;
    }
    public void display(){
        for(Vertex vertex: vertices){
            System.out.print(vertex.value+ " => ");
            for(Vertex padosi: vertex.neighbour){
                System.out.print(padosi.value+" ");
            }
            System.out.println();
        }
    }

    public void BFS(){
        Queue<Vertex> q=new LinkedList<>();
        Set<Vertex> visited=new HashSet<>();
        Vertex first=vertices.get(0);
        visited.add(first);
        q.add(first);
        while(!q.isEmpty()){
            Vertex temp=q.remove();
            System.out.println(temp.value);
            for(Vertex vertex:temp.neighbour){
                if(!visited.contains(vertex)){
                    visited.add(vertex);
                    q.add(vertex);
                }
            }
        }
    }
    public void DFS(){
        Stack<Vertex> stack=new Stack<>();
        Set<Vertex> visited=new HashSet<>();
        Vertex first=vertices.get(0);
        visited.add(first);
        stack.push(first);
        while(!stack.isEmpty()){
            Vertex temp=stack.pop();
            System.out.println(temp.value);
            for(Vertex vertex:temp.neighbour){
                if(!visited.contains(vertex)){
                    visited.add(vertex);
                    stack.push(vertex);
                }
            }
        }

    }
    public void connectedComp(){
        Queue<Vertex> q=new LinkedList<>();
        Set<Vertex> visited=new HashSet<>();
        for(Vertex vertex:vertices){
            if(visited.contains(vertex)){
                continue;
            }
            q.add(vertex);
            visited.add(vertex);
            while(!q.isEmpty()){
                Vertex temp=q.remove();
                System.out.println(temp.value);
                for(Vertex padosi:temp.neighbour){
                    if(!visited.contains(padosi)){
                        visited.add(padosi);
                        q.add(padosi);
                    }
                }
            }
        }
    }
    public boolean bipartite(){
        Queue<Vertex> q=new LinkedList<>();
        Set<Vertex> visited=new HashSet<>();
        Vertex first=vertices.get(0);

        Set<Vertex> red=new HashSet<>();
        Set<Vertex> green=new HashSet<>();

        q.add(first);
        visited.add(first);
        red.add(first);

        while(!q.isEmpty()){
            Vertex temp=q.remove();

            if(red.contains(temp)){
                for(Vertex padosi: temp.neighbour){
                    if(!visited.contains(padosi)){
                        q.add(padosi);
                        green.add(padosi);
                        visited.add(padosi);
                    }
                    else if(red.contains(padosi)){
                        return false;
                    }
                }
            }

            if(green.contains(temp)){
                for(Vertex padosi: temp.neighbour){
                    if(!visited.contains(padosi)){
                        q.add(padosi);
                        red.add(padosi);
                        visited.add(padosi);
                    }
                    else if(green.contains(padosi)){
                        return false;
                    }
                }
            }

        }

        return true;
    }
    class Vertex{
        T value;
        LinkedList<Vertex> neighbour;

        public Vertex(T value) {
            this.value = value;
            this.neighbour = new LinkedList<>();
        }
    }
}
