package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;
import org.example.graph.Edge;
import org.example.graph.Graph;
import org.example.graph.Vertex;

public class Main extends Application {

    public static void main(String args[]){
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("City generator");
        Graph g = Graph.ExampleGraph();
        Canvas canvas = drawGraph(g);
        GraphicsContext gc = canvas.getGraphicsContext2D();
        Group root = new Group(canvas);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private Canvas drawGraph(Graph g){
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