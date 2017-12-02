/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.awt.Component;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Putri Ayu
 */
public class LOGINController implements Initializable {

    @FXML
    private TextField editusername;
    @FXML
    private PasswordField editpassword;
    @FXML
    private Button buttonlogin;
    private Component rootPane;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    private void login(ActionEvent event) throws IOException, SQLException {

        Connection connection;
        PreparedStatement ps;
        try {
            if (editusername.getText().length() == 0 && editpassword.getText().length() == 0) {
                javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Username Dan Password");
            } else if (editusername.getText().equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan username ");
            } else if (editpassword.getText().equals("")) {
                javax.swing.JOptionPane.showMessageDialog(null, "Harap inputkan password ");

            } else {
                connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/konek_login?zeroDateTimeBehavior=convertToNull", "root", "");
                ps = connection.prepareStatement("SELECT * FROM `login` WHERE username=? AND password =?");
                ps.setString(1, editusername.getText());
                ps.setString(2, editpassword.getText());
                ResultSet result = ps.executeQuery();

                if (result.next()) {
                    Component rootpane = null;
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Benar!");
                    ((Node) (event.getSource())).getScene().getWindow().hide();
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setLocation(getClass().getResource("PESAN.fxml"));
                    Scene scene = new Scene(fxmlLoader.load(), 650, 600);
                    Stage stage = new Stage();
                    stage.setScene(scene);
                    stage.setTitle("PESAN");
                    stage.show();
                } else {
                    javax.swing.JOptionPane.showMessageDialog(rootPane, "Salah");
                    editpassword.setText("");
                    editusername.requestFocus();
                }
            }
        } catch (SQLException ex) {
            javax.swing.JOptionPane.showMessageDialog(rootPane, "Gagal!");
        }
    }
}
