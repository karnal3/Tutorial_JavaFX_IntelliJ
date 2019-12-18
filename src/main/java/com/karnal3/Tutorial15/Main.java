package com.karnal3.Tutorial15;

import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    Stage window;
    Scene scene;
    Button button;
    ListView<String> listView;

    @Override
    public void start(Stage primaryStage)  {

        window=primaryStage;
        window.setTitle("Checkbox example");
        button = new Button("Click me!");

        listView = new ListView<>();
        listView.getItems().addAll("Iron man", "Tytanic", "Surgeons","Mememions");
        listView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);

        button.setOnAction(e -> buttonCliced());


        VBox layout = new VBox(10);
        layout.setPadding(new Insets(20));
        layout.getChildren().addAll(button,listView);

        scene = new Scene(layout,300,250);
        window.setScene(scene);
        window.show();
    }

    private void buttonCliced(){
        String message ="";
        ObservableList<String> movies;
        movies=listView.getSelectionModel().getSelectedItems();

        for (String m: movies) {
            message += m+"\n";
        }
        System.out.println(message);
    }

    public static void main(String[] args) {
        launch(args);
    }
}
