package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Practica008_EventoBoton extends Application {
    public static void main (String[] args) {
        launch(args);

    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        Label labelvalor1 = new Label("valor1");
        Label labelvalor2 = new Label("valor2");
        Label labelResultado = new Label("resultado");
        TextField textFielValor1 = new TextField();
        TextField textFieldValor2 = new TextField();
        TextField textFieldResultado = new TextField();

        Button botonsumar = new Button("sumar");
        Button botonborrar= new Button("BORRAR");

        GridPane layout = new GridPane();
        layout.setPadding(new Insets(10));
        layout.add(labelvalor1,0,0);
        layout.add(textFielValor1,1,0);

        layout.add(labelvalor2,0,1);
        layout.add(textFieldValor2,1,1);

        layout.add(botonsumar,0,2);
        botonsumar.setAlignment(Pos.CENTER);
        layout.add(botonborrar,1,2);


        botonsumar.setOnAction( e ->{

            int v1 = Integer.valueOf(textFielValor1.getText());
            int v2 = Integer.valueOf(textFieldValor2.getText());

            int r = v1 +v2;
            textFieldResultado.setText(String.valueOf(r));


        });


        layout.add(labelResultado,0,3);
        layout.add(textFieldResultado,1,3);
        Scene escena = new Scene(layout);
        primaryStage.setScene((escena));
        primaryStage.setTitle("suamdor!!");
        primaryStage.show();
    }
}
