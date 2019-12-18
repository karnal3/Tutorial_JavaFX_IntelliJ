package com.karnal3.Tutorial12;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
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

        button = new Button("Click me!");

        ChoiceBox<String> choisceBox = new ChoiceBox<>();

        choisceBox.getItems().add("Apples");
        choisceBox.getItems().add("Bananas");
        choisceBox.getItems().addAll("Graple","Ham","Meatballs");
        choisceBox.setValue("Apples");

        button.setOnAction(e -> getChoisce(choisceBox));

        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,choisceBox);

        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }


    private void getChoisce(ChoiceBox<String> choiceBox){
        String food = choiceBox.getValue();
        System.out.println(food);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
