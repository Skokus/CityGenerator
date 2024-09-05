package org.example;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String args[]){
        launch();
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("City generator");
        Circle circle = new Circle(10.0f, 10.0f, 10.0f);
        Group root = new Group(circle);
        Scene scene = new Scene(root, 500, 500);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}