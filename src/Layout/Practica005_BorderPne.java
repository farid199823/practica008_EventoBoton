package Layout;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonBar;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class Practica005_BorderPne extends Application {
    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Button bArriba = new Button("ARRIBA");
        Button bAbajo = new Button("ABAJO");
        Button bIzquierda = new Button("IZQUIERDA");
        Button bDerecha = new Button("DERECHA");
        Button bCentro = new Button("CENTRO");

        BorderPane layout = new BorderPane();
        layout.setTop(bArriba);
        layout.setBottom(bAbajo);
        layout.setLeft(bIzquierda);
        layout.setRight(bDerecha);
        layout.setCenter(bCentro);

        BorderPane.setAlignment(bAbajo, Pos.CENTER);
        BorderPane.setAlignment(bArriba, Pos.CENTER);

        Scene escena = new Scene(layout);
        primaryStage.setScene(escena);
        primaryStage.show();

    }
}
