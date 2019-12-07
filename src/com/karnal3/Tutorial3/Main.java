package com.karnal3.Tutorial3;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

public class Main extends Application {

    Button button;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        stage.setTitle("Title of the window");
        StackPane layout = new StackPane();
        button = new Button();
        button.setText("Click me!");

        button.setOnAction(actionEvent -> {
            System.out.println("LOOOOOL");
            System.out.println("LOOOOOL");
            System.out.println("LOOOOOL");
            System.out.println("LOOOOOL");
        });
        layout.getChildren().add(button);

        button = new Button();
        button.setText("Click me2!");
        button.setRotate(90);

        button.setOnAction(actionEvent -> {
            System.out.println("LOOOsdfsdffgsdfsdfsdOOL");
            System.out.println("asdasfdasasd");
        });


        layout.getChildren().add(button);

        Scene scene = new Scene(layout, 300, 250);
        stage.setScene(scene);
        stage.show();

    }


}
