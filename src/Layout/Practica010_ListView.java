package Layout;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Orientation;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.SelectionMode;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practica010_ListView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        ListView<String> ListView = new ListView<String>();
        ObservableList<String> elementos = FXCollections.observableArrayList();
        elementos.add("manzana");
        elementos.add("melon");
        elementos.add("papaya");
        elementos.add("fresa");
        elementos.add("mamey");
        ListView.setItems(elementos);
        ListView.getSelectionModel().setSelectionMode(SelectionMode.MULTIPLE);
        ListView.setOrientation(Orientation.HORIZONTAL);

        Button boton = new Button("cuales estan seleccionados");
        boton.setOnAction(event -> {

            ObservableList<String> elementosseleccionables=
                    ListView.getSelectionModel().getSelectedItems();

            System.out.println("elementos seleccionados");

            for (String eSelected : elementosseleccionables) {
                System.out.println(eSelected);
            }
                });

        VBox Layout = new VBox();
        Layout.getChildren().add(ListView);
        Layout.getChildren().add(boton);
        Scene scene = new Scene(Layout,150,50);



        primaryStage.setScene (scene);
        primaryStage.show();



    }
}
