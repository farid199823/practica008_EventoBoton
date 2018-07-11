package Layout;

import com.sun.jdi.Value;
import javafx.application.Application;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Scene;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.management.ValueExp;

public class Practica011_TreeView extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {

        TreeItem<String> raiz, rama1, rama2;
        raiz = new TreeItem<String>("Alimentos");
        raiz.setExpanded(true);

        rama1 = CrearHijo("carnes", raiz);
        rama2 = CrearHijo("vegtetales",raiz);
        CrearHijo("cebolla",rama1);
        CrearHijo("papa",rama1);
        CrearHijo("res",rama2);

        TreeView treeView = new TreeView(raiz);
        treeView.setShowRoot(true);

        treeView.getSelectionModel().selectedItemProperty()
                .addListener(new ChangeListener() {
                    @Override
                    public void changed(ObservableValue observable, Object oldValue, Object newValue) {
                        System.out.println(newValue);
                    }
                });


        VBox Layout = new VBox();
        Layout.getChildren().add(treeView);

        Scene scene = new Scene(Layout);
        primaryStage.setScene(scene);
        primaryStage.show();


    }
    private TreeItem<String> CrearHijo(String titulo, TreeItem padre){
        TreeItem<String> hijo = new TreeItem<>(titulo);
        hijo.setExpanded(true);
        padre.getChildren().add(hijo);
        return hijo;
    }
}
