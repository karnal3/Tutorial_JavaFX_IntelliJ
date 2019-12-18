package com.karnal3.Tutorial16;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;


public class Main extends Application {


    Stage window;
    TreeView<String> tree;

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Checkbox example");

        TreeItem<String> root, bucky, megan;

        //Root
        root = new TreeItem<>();
        root.setExpanded(true);

        //Bucky
        bucky = makeBranch("Bucky",root);
        makeBranch("YoutTube",bucky);
        makeBranch("Chicken",bucky);
        makeBranch("Something",bucky);

        //Megan
        megan = makeBranch("Bucky",root);
        makeBranch("pizza",megan);
        makeBranch("makeup",megan);

        //Creating the tree
        tree = new TreeView<>(root);
        tree.setShowRoot(false);

        tree.getSelectionModel().selectedItemProperty().addListener((v, oldValue,newValue)-> {
            if(newValue != null) System.out.println(newValue.getValue());
        });

        StackPane layout = new StackPane();
        layout.getChildren().add(tree);
        Scene scene = new Scene(layout,100,250);
        window.setScene(scene);
        window.show();
    }

    public TreeItem<String> makeBranch(String title, TreeItem<String> parent){
        TreeItem<String> item = new TreeItem<>(title);
        item.setExpanded(true);
        parent.getChildren().add(item);
        return  item;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
