package com.karnal3.Tutorial8;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Main extends Application {

    Stage window;

    public static void main(String[] args) {

        launch(args);
    }

    @Override
    public void start(Stage stage) {
        window=stage;
        window.setTitle("Title here");

        HBox topMenu = new HBox();
        Button buttonA = new Button("File");
        Button buttonB = new Button("Edit");
        Button buttonC = new Button("View");
        topMenu.getChildren().addAll(buttonA,buttonB,buttonC);

        VBox leftMenu = new VBox();
        Button buttonD = new Button("D");
        Button buttonE = new Button("E");
        Button buttonF = new Button("F");
        leftMenu.getChildren().addAll(buttonD,buttonF,buttonE);

        BorderPane borderPane = new BorderPane();
        borderPane.setLeft(leftMenu);
        borderPane.setTop(topMenu);

        Scene scene = new Scene(borderPane,300,250);
        window.setScene(scene);
        window.show();
    }




}
