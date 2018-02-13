package com.company;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

public class draw extends Application {



    @Override
    public void start(Stage primaryStage) {

        StackPane root = new StackPane();
        //add a leaf
        Circle cir01 = new Circle(230,246,100);
        cir01.setFill(Color.CORNSILK);
        root.getChildren().add(cir01);
        Scene scene01 = new Scene(root,400,480);

        primaryStage.setTitle("Mehran Barzegar FX scene");
        primaryStage.setScene(scene01);
        primaryStage.show();

    }

    public static void main(String[] args) {
        launch(args);
    }
}
