package com.karnal3.Tutorial17;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class Main extends Application {


    Stage window;
    TableView<Product> table;

    @Override
    public void start(Stage primaryStage) {

        window = primaryStage;
        window.setTitle("Checkbox example");

        TableColumn<Product, String> nameColumn = new TableColumn<>("Name");
        nameColumn.setMinWidth(200);
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));

        TableColumn<Product, String> priceColumn = new TableColumn<>("Price");
        priceColumn.setMinWidth(100);
        priceColumn.setCellValueFactory(new PropertyValueFactory<>("price"));

        TableColumn<Product, String> quantityColumn = new TableColumn<>("Quantity");
        quantityColumn.setMinWidth(100);
        quantityColumn.setCellValueFactory(new PropertyValueFactory<>("quantity"));

        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(nameColumn,priceColumn,quantityColumn);

        VBox layout = new VBox();
        layout.getChildren().addAll(table);
        Scene scene = new Scene(layout,100,250);
        window.setScene(scene);
        window.show();
    }

    public ObservableList<Product> getProduct(){
        ObservableList<Product> products = FXCollections.observableArrayList();
        products.add(new Product("Laptop",859.00,20));
        products.add(new Product("Bouncy Ball",2.49,76));
        products.add(new Product("DVD",99.00,12));
        products.add(new Product("Corn",1.49,856));
        return products;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
