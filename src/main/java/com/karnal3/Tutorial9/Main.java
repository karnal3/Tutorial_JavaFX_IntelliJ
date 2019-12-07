package com.karnal3.Tutorial9;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
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

        GridPane gridPane = new GridPane();
        gridPane.setPadding(new Insets(10));
        gridPane.setVgap(8);
        gridPane.setHgap(10);

        //Name label
        Label nameLabel = new Label("Username:");
        GridPane.setConstraints(nameLabel, 0, 0);

        //Name input

        TextField nameInput = new TextField("Bucky");
        nameInput.setPromptText("Username");
        GridPane.setConstraints(nameInput, 1, 0);

        //Pass input

        Label passLabel = new Label("Password:");
        GridPane.setConstraints(passLabel, 0, 1);

        //Pass input
        TextField passInput = new TextField();
        passInput.setPromptText("Password");
        GridPane.setConstraints(passInput, 1, 1);

        Button loginButton = new Button("Log in");
        GridPane.setConstraints(loginButton, 1, 2);

        gridPane.getChildren().addAll(nameInput,nameLabel,passInput,passLabel,loginButton);

        Scene scene = new Scene(gridPane,300,250);
        window.setScene(scene);
        window.show();
    }




}
