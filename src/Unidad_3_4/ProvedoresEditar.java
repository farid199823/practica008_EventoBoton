
package Unidad_3_4;

import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;

import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ProvedoresEditar  implements Initializable {
    private int index;

    @FXML
    private AnchorPane contenedor;

    @FXML
    private JFXTextField nombre;

    @FXML
    private JFXTextField rfc;

    @FXML
    private JFXTextField calle;

    @FXML
    private JFXTextField colonia;

    @FXML
    private JFXTextField ciudad;

    @FXML
    private JFXTextField pais;

    @FXML
    private JFXTextField telefono;

    @FXML
    private JFXTextField celular;

    @FXML
    private JFXTextField email;

    @FXML
    private JFXComboBox<String> proveedor;

    private ArrayList<Proveedor> proveedors;

    @FXML
    void actualizar(ActionEvent event) {

    }

    @FXML
    void cancelar(ActionEvent event) {
        Pane p = (Pane)contenedor.getParent();
        p.getChildren().remove(0);

    }

    @FXML
    void eliminar(ActionEvent event) throws  SQLException{
        Connection connection = DriverManager.getConnection("jdbc:sqlite:pventa.db");
        Statement statement = connection.createStatement();
        statement.setQueryTimeout(60);

        String sql = "DELETE FROM proveedores WHERE idProveedor="+
                proveedors.get(index).getIdproveedor();

        statement.execute(sql);
        proveedor.getItems().remove(index);

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            Connection  connection= DriverManager.getConnection("jdbc:sqlite:P.venta.db");

            Statement statement = connection.createStatement();
            statement.setQueryTimeout(60);

            String sql = "SELECT * FROM proveedores";

            ResultSet resultSet = statement.executeQuery(sql);
            proveedors = new ArrayList<Proveedor>();
            while (resultSet.next()){
                proveedors.add( new Proveedor(
                resultSet.getInt("idProveedor"),
                        resultSet.getString("nombre"),
                        resultSet.getString("rfc"),
                        resultSet.getString("calle"),
                        resultSet.getString("colonia"),
                        resultSet.getString("ciudad"),
                        resultSet.getString("pais"),
                        resultSet.getString("telefono"),
                        resultSet.getString("celular"),
                        resultSet.getString("email")
                ));
                proveedor.getItems().add(resultSet.getString("nombre"));

                proveedor.setOnAction(event -> {
                     index = proveedor.getSelectionModel().getSelectedIndex();

                    nombre.setText(proveedors.get(index).getNombre());
                    rfc.setText(proveedors.get(index).getRfc());
                    calle.setText(proveedors.get(index).getCalle());
                    colonia.setText(proveedors.get(index).getColonia());
                    ciudad.setText(proveedors.get(index).getCiudad());
                    pais.setText(proveedors.get(index).getPais());
                    telefono.setText(proveedors.get(index).getTelefono());
                    celular.setText(proveedors.get(index).getCelular());
                    email.setText(proveedors.get(index).getEmail());

                });
                statement.close();
                connection.close();


            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }
}
