package org.example.graph;

import java.util.ArrayList;

public class Graph {
    private ArrayList<Vertex> vertices;
    private ArrayList<Edge> edges;

    public Graph() {
        vertices = new ArrayList<>();
        edges = new ArrayList<>();
    }

    public void addVertex(Vertex v) {
        vertices.add(v);
    }

    public void addEdge(Edge e) {
        edges.add(e);
    }

    public void addEdge(Vertex v1, Vertex v2) {
        edges.add(new Edge(v1, v2));
    }

    public ArrayList<Edge> getEdges() {
        return edges;
    }

    public ArrayList<Vertex> getVertices() {
        return vertices;
    }

    public static Graph ExampleGraph(){
        Graph g = new Graph();
        g.addVertex(new Vertex(100.0,100.0));
        g.addVertex(new Vertex(200.0,100.0));
        g.addVertex(new Vertex(200.0,200.0));
        g.addEdge(g.getVertices().get(0), g.getVertices().get(1));
        g.addEdge(g.getVertices().get(1), g.getVertices().get(2));
        return g;
    }

}