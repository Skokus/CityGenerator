package org.example.graph;

import java.util.List;

public class GraphController {
    private Graph graph;

    public GraphController(Graph graph) {
        this.graph = graph;
    }

    public Graph getGraph() {
        return graph;
    }

    public List<Vertex> getVertices() {
        return graph.getVertices();
    }

    public List<Edge> getEdges() {
        return graph.getEdges();
    }
}
