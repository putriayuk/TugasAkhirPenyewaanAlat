/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

/**
 *
 * @author Putri Ayu
 */
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;
public class koneksi {
    Connection login;
    public Connection getConnection(){
        try {
            login = DriverManager.getConnection("jdbc:mysql://localhost/konek_login","root","");
            JOptionPane.showMessageDialog(null, "Konesi ke Database BERHASIL");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Konesi ke Database GAGAL");
        }
        return login;
    }
}