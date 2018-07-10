package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

public class Pregunton extends Application {
    public static void main (String[] args){

    launch(args);
}

    private  int indicePreguntaActual;
    @Override
    public void start(Stage primaryStage) throws Exception {

        ComboBox<String> respuesta = new ComboBox<String>();
        respuesta.getItems().add("todos los peces vuelan xdxd");
        respuesta.getItems().add("no hay peces");
        respuesta.getItems().add("7 peces");

        Label pregunta = new Label();
        pregunta.setText("pregunta: En una pecera habia 10 peces, 2 se ahogaron, 3 se fueron nadando");

        Label resultado = new Label();
        resultado.setText("correcto");
        resultado.setText("incorrecto");

        Button bAnterior = new Button("anterior");
        Button bSiguiente = new Button("siguiente");

        CheckBox Mostrarrespuesta = new CheckBox();

        Label Respuestacorrecta = new Label("los peces no pueden desaparecer por si solos");


        HBox LayoutBotones = new HBox();
        LayoutBotones.getChildren().addAll(bAnterior, bSiguiente);
        LayoutBotones.setSpacing(20);

        VBox Layoutprincipal = new VBox();
        Layoutprincipal.getChildren().add(pregunta);
        Layoutprincipal.getChildren().add(respuesta);
        Layoutprincipal.getChildren().add(LayoutBotones);
        Layoutprincipal.getChildren().add(Mostrarrespuesta);
        Layoutprincipal.getChildren().add(Respuestacorrecta);

        pregunta.setPrefWidth(200);
        pregunta.setPrefHeight(100);
        pregunta.setWrapText(true);


        Respuestacorrecta.setPrefWidth(200);
        Respuestacorrecta.setPrefHeight(50);
        Respuestacorrecta.setWrapText(true);

        LayoutBotones.setSpacing(10);
        bAnterior.setPrefSize(95, 25);
        bSiguiente.setPrefSize(95, 25);

        respuesta.setPrefHeight(25);
        respuesta.setPrefWidth(200);

        VBox Layout = new VBox();
        Layout.setPadding(new Insets(10));
        Layout.setSpacing(15);
        Layout.getChildren().addAll(pregunta, respuesta, LayoutBotones, resultado, Respuestacorrecta);

        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.show();


        Respuestacorrecta.setVisible(false);
        Mostrarrespuesta.setOnAction(event -> {
            if (Mostrarrespuesta.isSelected()) {
                respuesta.setVisible(true);
            } else {
                Respuestacorrecta.setVisible(false);

            }
        });


        cargarPreguntas();
        pregunta.setText(preguntas.get(indicePreguntaActual).getPregunta());








    }
        ArrayList<pregunta> preguntas;
        private void cargarPreguntas (){
                preguntas = new ArrayList<pregunta>();
        preguntas.add(new pregunta("¿cuanto es 1 mas 1?", new String[]{"1", "2", "3", "4"}, 1));
        preguntas.add(new pregunta("cuantos palnetas tiene el sistema solar", new String[]{"9", "8", "10", "5"}, 8));
        preguntas.add(new pregunta("cuantos satelites naturales tiene el planeta tierra,",new String[]{"10","2","3","8","1"},4));

        }

}






