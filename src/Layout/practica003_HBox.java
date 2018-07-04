package Layout;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



public class practica003_HBox extends Application {
public static void main(String[] args) {
    launch(args);

}

    @Override
    public void start(Stage primaryStage) throws Exception {
        Button boton1 = new Button("boton1");
        Button boton2 = new Button("boton2");
        Button boton3 = new Button("boton3");

        HBox layout = new HBox();

        layout.setOpaqueInsets(new Insets(10));
        layout.setSpacing(15);
        layout.getChildren().addAll(boton1,boton2,boton3);

        Scene escena = new Scene(layout);

        primaryStage.setScene(escena);
        primaryStage.show();
}
}
