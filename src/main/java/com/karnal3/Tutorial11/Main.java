package com.karnal3.Tutorial11;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    Stage window;
    Scene scene;
    Button button;

    @Override
    public void start(Stage primaryStage) throws Exception {

        window=primaryStage;
        window.setTitle("Checkbox example");

        CheckBox box1 = new CheckBox("Bacon");
        CheckBox box2 = new CheckBox("Tuna");
        box2.setSelected(true);

        button = new Button("Order now!");

        button.setOnAction(e -> handleOptions(box1,box2));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,box1,box2);

        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void handleOptions(CheckBox box1, CheckBox box2){
        String message = "User order : \n";

        if(box1.isSelected()){
            message += "Bacon\n";
        }
        if(box2.isSelected()){
            message += "Tuna\n";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
