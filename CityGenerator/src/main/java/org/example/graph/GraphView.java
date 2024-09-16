package org.example.graph;

import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;

public class GraphView {
    GraphController graphController;

    public GraphView(GraphController graphController) {
        this.graphController = graphController;
    }

    public Canvas drawGraph(){
        Graph g = graphController.getGraph();
        Canvas map = new Canvas(300, 300);
        GraphicsContext gc = map.getGraphicsContext2D();
        for(Vertex v : g.getVertices()){
            gc.strokeRect(v.getX()-5, v.getY()-5, 10, 10);
        }
        for(Edge e : g.getEdges()){
            gc.strokeLine(e.getStart().getX(), e.getStart().getY(), e.getEnd().getX(), e.getEnd().getY());
        }
        return map;
    }
}
