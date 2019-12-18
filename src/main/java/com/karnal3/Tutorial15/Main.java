package com.karnal3.Tutorial15;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    Stage window;
    Scene scene;
    Button button;
    ComboBox<String> comboBox;

    @Override
    public void start(Stage primaryStage)  {

        window=primaryStage;
        window.setTitle("Checkbox example");
        button = new Button("Click me!");

        comboBox = new ComboBox<>();
        comboBox.getItems().addAll("Shrek1",
                "Memorials", "something");
        comboBox.setPromptText("What is your favorite film?");
        button.setOnAction(e-> printMovie());

        comboBox.setOnAction(e -> System.out.println("User selected "+ comboBox.getValue()));

        comboBox.setEditable(true);

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,comboBox);



        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void printMovie(){
        System.out.println(comboBox.getValue());
    }

    public static void main(String[] args) {
        launch(args);
    }
}
