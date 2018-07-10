package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Practica009_ComboBox_CheckBox_ImageView extends Application {
    public static void main (String[] args){
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        ComboBox<String> comboBox = new ComboBox<String>();
        comboBox.getItems().add("elemento0");
        comboBox.getItems().add("FORNITE");
        comboBox.getItems().add("PUBG");
        comboBox.setPromptText("seleccione un elemento");

        CheckBox checkBox = new CheckBox("cambiar imagen");

        comboBox.setOnAction(event -> {
            System.out.println();
            comboBox.getValue();

            int id = comboBox.getSelectionModel().getSelectedIndex();
            System.out.println("el indice es: " + id);

        });


        checkBox.setText("mostrar opciones avanzadas");
        checkBox.setSelected(true);
        checkBox.setOnAction(event -> {
            System.out.println(checkBox.isSelected());

            });

        Image imagenWC = new Image("imagen/pubg_vip_nell_notext.0.jpg");
        Image fornite = new Image("imagen/descarga.jpg");
        ImageView imageView = new ImageView();
        imageView.setImage(imagenWC);


        imageView.setFitHeight(400);
        imageView.setPreserveRatio(true);

        comboBox.setOnAction(event -> {
            if (checkBox.isSelected()) {
                if (comboBox.getSelectionModel().getSelectedIndex()==0){
                    imageView.setImage(imagenWC);
                }else {
                    imageView.setImage(fornite);

                }

                }


        });




        VBox Layout = new VBox();
        Layout.setPadding(new Insets(10));


        Layout.getChildren().add(comboBox);
        Layout.getChildren().add(checkBox);
        Layout.getChildren().add(imageView);


        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}
