package UNIDAD2.Practica015_JFoenix_iniciodesesion;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.sql.*;

public class Iniciodesesion extends Application
{

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent Layout = FXMLLoader.load(getClass().getResource("Iniciodesesion.fxml"));

        Scene scene = new Scene(Layout);
        primaryStage.setTitle("Genius Codec: inicio de sesion");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    @FXML
    private JFXTextField usuario;

    @FXML
    private JFXPasswordField clave;

    @FXML
    void incioSesion(ActionEvent event) {

        try {
            Connection connection =DriverManager.getConnection("jdbc:sqlite:basededatos.db");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(30);


            String correo = usuario.getText();
            String clv = clave.getText();

            String consulta = "SELECT * FROM usuarios "+
                    "WHERE correo='"+correo+"' AND clave= '"+clv+"'";
            ResultSet rs = statement.executeQuery(consulta);

            if (rs.next()) {
                System.out.println("usuario valido");
                System.out.println(rs.getString("nombre"));
            }
            else {
                System.out.println("usuario no valido");
            }



        } catch (SQLException e) {
            e.printStackTrace();
        }

        System.out.println("usuario: "+usuario.getText());
        System.out.println("clave: "+clave.getText());
    }

}
