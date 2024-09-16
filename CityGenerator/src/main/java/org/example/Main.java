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
import org.example.graph.*;

public class Main extends Application {

    public static void main(String args[]){
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("City generator");
        Graph g = Graph.ExampleGraph();
        GraphController gctr = new GraphController(g);
        GraphView gv = new GraphView(gctr);
        Canvas canvas = gv.drawGraph();

        Group root = new Group(canvas);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

}