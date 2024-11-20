package org.pujitha.learning.graph;

public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.printGraph();

        graph.addEdge("A","B");
        graph.addEdge("B","C");
        graph.addEdge("A","C");
        graph.printGraph();

        graph.removeEdge("A","B");
        graph.printGraph();
    }

}
