package UNIDAD2;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class Calculadora extends Application{

    double numero1;
private String operacion;

    @FXML
    private TextField Display;
    @FXML
    void accionBasica (ActionEvent event){
        numero1 = Double.valueOf(Display.getText());
        Display.setText("0");
        operacion = ((Button)event.getSource()).getText();
    }

    @FXML
    void agregaDigito (ActionEvent event){
        Button boton = (Button) event.getSource();
        String digito = boton.getText();

        if (Display.getText().equalsIgnoreCase("0")) {
            Display.setText(digito);
        } else {
            Display.setText(Display.getText() + digito);
        }

    }
    @FXML
    void acccionIgual(ActionEvent event) {
        double numero2 = Double.valueOf(Display.getText());
        double resultado =0;

        switch (operacion){
            case "+":
                resultado = numero1 + numero2;
                break;
            case "-":
                resultado = numero1 - numero2;
                break;
                case "*":
                resultado = numero1 * numero2;
                break;
                case "/":
                resultado = numero1 / numero2;
                break;
        }
        Display.setText(String.valueOf(resultado));

    }

    @FXML
    void agregaPunto(ActionEvent event) {
        if (Display.getText().contains(".") == false) {
            Display.setText(Display.getText()+".");
        }
    }


    @FXML
    void limpiarEntrada(ActionEvent event) {
        Display.setText("0");
    }

    @FXML
    void limpiarTodo(ActionEvent event) {
        numero1 =0;
        operacion="";
        Display.setText("0");
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent Layout = FXMLLoader.load(getClass().getResource("calculadora.fxml"));


        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.setTitle("calculadora VERGAS ");
        primaryStage.show();

    }
}



