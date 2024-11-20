package org.pujitha.learning.graph;

import sun.security.provider.certpath.AdjacencyList;

import java.util.ArrayList;
import java.util.HashMap;

public class Graph {
    private HashMap<String, ArrayList<String>> adjacencyList = new HashMap<>();

    public boolean addVertex(String vertex) {
        if (adjacencyList.get(vertex) == null) {
            adjacencyList.put(vertex, new ArrayList<String>());
            return true;
        }
        return false;
    }

    public boolean addEdge(String vertex1, String vertex2) {
        if (adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2) != null) {
            adjacencyList.get(vertex1).add(vertex2);
            adjacencyList.get(vertex2).add(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeEdge(String vertex1, String vertex2){
        if(adjacencyList.get(vertex1) != null && adjacencyList.get(vertex2)!=null){
            adjacencyList.get(vertex1).remove(vertex2);
            adjacencyList.get(vertex2).remove(vertex1);
            return true;
        }
        return false;
    }

    public boolean removeVertex(String vertex){
        if(adjacencyList.get(vertex) != null){
            for(String othervertex : adjacencyList.get(vertex)){
                adjacencyList.get(othervertex).remove(vertex);
            }
            adjacencyList.remove(vertex);
        }
        return false;
    }

    public void printGraph() {
        System.out.println(adjacencyList);
    }

}


