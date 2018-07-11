package Layout;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;



public class Practica012_TableView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TableView<producto> tableView;
        TableColumn<producto, String> columnaNombre =
                new TableColumn<>("nombre");
        columnaNombre.setMaxWidth(250);
        columnaNombre.setCellValueFactory(
                new PropertyValueFactory<>("nombreproducto"));

 //655456465465465465465465152164654ñ
        TableColumn<producto, String> columnaCosto =
                new TableColumn<>("costo");
        columnaCosto.setMaxWidth(50);
        columnaCosto.setCellValueFactory(
                new PropertyValueFactory<>("costo"));


        TableColumn<producto, String> cantidadExistencia =
                new TableColumn<>("existencia");
        cantidadExistencia.setMaxWidth(250);
        cantidadExistencia.setCellValueFactory(
                new PropertyValueFactory<>("cantidadExist"));


        ObservableList<producto> elemntos = FXCollections.observableArrayList();
        elemntos.add(new producto("monitor hp", 2000, 20));
        elemntos.add(new producto("mouse hp", 200, 206));
        elemntos.add(new producto("cpu hp", 7000, 13));
        tableView = new TableView<>();
        tableView.setItems(elemntos);

        tableView.getColumns().addAll(
                columnaNombre,
                columnaCosto,
                cantidadExistencia
        );

        StackPane Layout = new StackPane();
        Layout.getChildren().add(tableView);

        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.show();

    }


    public class producto {
        private String nombreproducto;
        private double costo;
        private int cantidadExist;

        public producto() {
            this.nombreproducto = "";
            this.costo = 0;
            this.cantidadExist = 0;
        }

        public producto(String nombre, double costo, int cantidad) {
            this.nombreproducto = nombre;
            this.cantidadExist = cantidad;
        }

        public String getNombreproducto() {
            return nombreproducto;
        }

        public void setNombreproducto(String nombreproducto) {
            this.nombreproducto = nombreproducto;
        }

        public double getCosto() {
            return costo;
        }

        public void setCosto(double costo) {
            this.costo = costo;
        }

        public int getCantidadExist() {
            return cantidadExist;
        }

        public void setCantidadExist(int cantidadExist) {
            this.cantidadExist = cantidadExist;
        }
    }

}