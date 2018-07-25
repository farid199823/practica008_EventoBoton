package Unidad_3_4;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.IOException;

public class PVenta  extends Application {

    @FXML
    private Pane contenedor;

    @FXML
    void editarcliente(ActionEvent event) {

    }

    @FXML
    void editarexistencia(ActionEvent event) {

    }

    @FXML
    void editarproducto(ActionEvent event) {

    }

    @FXML
    void editarproveedor(ActionEvent event) throws IOException {
        Parent Layout = FXMLLoader.load(getClass().getResource("ProvedoresEditar.fxml"));

        contenedor.getChildren().add(Layout);
    }

    @FXML
    void nuevaexistecia(ActionEvent event) {

    }

    @FXML
    void nuevavista(ActionEvent event) {

    }

    @FXML
    void nuevocliente(ActionEvent event) {

    }

    @FXML
    void nuevoproducto(ActionEvent event) {

    }

    @FXML
    void nuevoproveedor(ActionEvent event) throws IOException {
        Parent Layout = FXMLLoader.load(getClass().getResource("ProvedoresNuevo.fxml"));

        contenedor.getChildren().add(Layout);

    }

    @FXML
    void salir(ActionEvent event) {


    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent Layout = FXMLLoader.load(getClass().getResource("P.venta.fxml"));

        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("punto de venta 1.0");
        primaryStage.show();

    }
}

