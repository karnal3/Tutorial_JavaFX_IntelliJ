package com.karnal3.Tutorial10;

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

        Label name = new Label();
        GridPane.setConstraints(name, 0, 3);
        Label pass = new Label();
        GridPane.setConstraints(pass, 1, 3);

        loginButton.setOnAction(e -> {
            String password = passInput.getText();
            String login = nameInput.getText();
            name.setText(login);
            pass.setText(password);
            isInt(passInput,passInput.getText());
        });

        gridPane.getChildren().addAll(nameInput,nameLabel,passInput,passLabel,loginButton,name,pass);

        Scene scene = new Scene(gridPane,300,250);
        window.setScene(scene);
        window.show();
    }

    private boolean isInt(TextField input, String message){
        try{
            int age = Integer.parseInt(input.getText());
            System.out.println("User is : "+age);
            return true;
        }catch (NumberFormatException e) {
            System.out.println("Error: "+message+" is not a number");
            return false;
        }
    }


}
