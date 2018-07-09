package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.awt.*;

public class Evaluacion_1  extends Application {
    char opc;
    Double n1;
    Double n2;
    Double nr;

    public static void main (String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        TextField labelpantalla = new TextField("");
        //boton

        Button botonLimpiarTodo = new Button("Limpiar todo");
        botonLimpiarTodo.setPrefSize(150, 50);
        Button botonLimpiar = new Button("Limpiar");
        botonLimpiar.setPrefSize(75, 50);
        Button botonigual = new Button("=");
        botonigual.setPrefSize(75, 50);
        Button botonmas = new Button("+");
        botonmas.setPrefSize(75, 50);
        Button botonresta = new Button("-");
        botonresta.setPrefSize(75, 50);
        Button botonmultiplicacion = new Button("*");
        botonmultiplicacion.setPrefSize(75, 50);
        Button btondivision = new Button("/");
        btondivision.setPrefSize(75, 50);
        Button botonpunto = new Button(".");
        botonpunto.setPrefSize(75, 50);
        Button bonton1 = new Button("1");
        bonton1.setPrefSize(75, 50);
        Button boton2 = new Button("2");
        boton2.setPrefSize(75, 50);
        Button boton3 = new Button("3");
        boton3.setPrefSize(75, 50);
        Button boton4 = new Button("4");
        boton4.setPrefSize(75, 50);
        Button boton5 = new Button("5");
        boton5.setPrefSize(75, 50);
        Button boton6 = new Button("6");
        boton6.setPrefSize(75, 50);
        Button boton7 = new Button("7");
        boton7.setPrefSize(75, 50);
        Button boton8 = new Button("8");
        boton8.setPrefSize(75, 50);
        Button boton9 = new Button("9");
        boton9.setPrefSize(75, 50);
        Button boton0 = new Button("0");
        boton0.setPrefSize(150, 50);

        GridPane Layout = new GridPane();
        Layout.setPadding(new Insets(10));
        Layout.add(labelpantalla, 0, 0, 5, 1);
        Layout.add(botonLimpiarTodo, 0, 1, 2, 1);

        botonLimpiarTodo.setOnAction(event -> {
            labelpantalla.setText("");
        });

        Layout.add(botonLimpiar, 2, 1);
        Layout.add(botonigual, 3, 5);
        Layout.add(botonmas, 3, 4);
        Layout.add(botonresta, 3, 3);
        Layout.add(botonmultiplicacion, 3, 2);
        Layout.add(btondivision, 3, 1);
        Layout.add(botonpunto, 2, 5);

        Layout.add(bonton1, 0, 4);
        bonton1.setOnAction(event -> {
            if (labelpantalla.getText().equalsIgnoreCase("0")) {
                labelpantalla.setText("1");
            } else {
                labelpantalla.setText(labelpantalla.getText() + 1);

            }
        });

        Layout.add(boton2, 1, 4);
        boton2.setOnAction(event -> {
            if (labelpantalla.getText().equalsIgnoreCase("0")) {
                labelpantalla.setText("2");
            } else {
                labelpantalla.setText(labelpantalla.getText() + 2);
            }
        });

        Layout.add(boton3, 2, 4);
        boton3.setOnAction(event -> {
        if (labelpantalla.getText().equalsIgnoreCase("0")) {
            labelpantalla.setText("3");
        } else {
            labelpantalla.setText(labelpantalla.getText() + 3);

        }

    });

        Layout.add(boton4, 0, 3);
        boton4.setOnAction(event -> {
            if (labelpantalla.getText().equalsIgnoreCase("0")) {
                labelpantalla.setText("4");
             }        else {
                labelpantalla.setText(labelpantalla.getText() + 4);

            }
        });
        Layout.add(boton5, 1, 3);
        boton5.setOnAction(event -> {
                    if (labelpantalla.getText().equalsIgnoreCase("0")) {
                        labelpantalla.setText("5");
                    } else {
                        labelpantalla.setText(labelpantalla.getText() + 5);

                    }
                });


        Layout.add(boton6, 2, 3);
        boton6.setOnAction(event -> {
                    if (labelpantalla.getText().equalsIgnoreCase("0")) {
                        labelpantalla.setText("6");
                    } else {
                        labelpantalla.setText(labelpantalla.getText() + 6);

                    }
                });

        Layout.add(boton7, 0, 2);
        boton7.setOnAction(event -> {
                    if (labelpantalla.getText().equalsIgnoreCase("0")) {
                        labelpantalla.setText("7");
                    } else {
                        labelpantalla.setText(labelpantalla.getText() + 7);

                    }
                });


        Layout.add(boton8, 1, 2);
         boton8.setOnAction(event -> {
                     if (labelpantalla.getText().equalsIgnoreCase("0")) {
                         labelpantalla.setText("8");
                     } else {
                         labelpantalla.setText(labelpantalla.getText() + 8);

                     }
                 });

        Layout.add(boton9, 2, 2);
         boton9.setOnAction(event -> {
                     if (labelpantalla.getText().equalsIgnoreCase("0")) {
                         labelpantalla.setText("9");
                     } else {
                         labelpantalla.setText(labelpantalla.getText() + 9);

                     }

                 });



        Layout.add(boton0, 0, 5, 2, 1);
         boton0.setOnAction(event -> {
                     if (labelpantalla.getText().equalsIgnoreCase("0")) {
                         labelpantalla.setText("0");
                     } else {
                         labelpantalla.setText(labelpantalla.getText() + 0);

                     }
                 });

                    Layout.setHgap(10);
                    Layout.setVgap(10);


                    botonmas.setOnAction(event -> {
                                opc = '+';
                                n1 = Double.valueOf(labelpantalla.getText());
                                labelpantalla.setText("0");

                            });

                    botonigual.setOnAction(event -> {
                        switch (opc) {
                            case '+':
                                n2 = Double.valueOf(labelpantalla.getText());
                                nr = n1 + n2;
                                labelpantalla.setText(String.valueOf(nr));
                                break;
                        }
                            switch (opc){
                                case'*':
                                    n2 = Double.valueOf(labelpantalla.getText());
                                    nr = n1 * n2;
                                    labelpantalla.setText(String.valueOf(nr));
                                    break;
                            }
                            switch (opc){
                                case'-':
                                    n2 = Double.valueOf(labelpantalla.getText());
                                    nr = n1 - n2;
                                    labelpantalla.setText(String.valueOf(nr));
                                    break;
                            }
                            switch (opc){
                                case'/':
                                    n2 = Double.valueOf(labelpantalla.getText());
                                    nr = n1 / n2;
                                    labelpantalla.setText(String.valueOf(nr));
                                    break;
                            }
                        }
                            );


                    botonresta.setOnAction(event -> {
                                opc = '-';
                                n1 = Double.valueOf(labelpantalla.getText());
                                labelpantalla.setText("0");

                            });



                    botonmultiplicacion.setOnAction(event -> {
                                opc = '*';
                                n1 = Double.valueOf(labelpantalla.getText());
                                labelpantalla.setText("0");

                            });



                    btondivision.setOnAction(event -> {
                                opc = '/';
                                n1 = Double.valueOf(labelpantalla.getText());
                                labelpantalla.setText("0");

                            });








                    Scene escena = new Scene(Layout);
                    primaryStage.setScene(escena);
                    primaryStage.show();



                }


            }



