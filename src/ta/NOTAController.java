/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Putri Ayu
 */
public class NOTAController implements Initializable {

    @FXML
    private TextField hasilnama;
    @FXML
    private TextField hasilalamat;
    @FXML
    private TextField hasilnotelp;
    @FXML
    private TextArea hasil;
    
    @FXML
    private TextField hasiljumlah;
    
    @FXML
    private TextField tanggal;
    @FXML
    private TextField jeniskelamin;
    @FXML
    private Button buttonexit;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
   public void tampilnota(String nama,String alamat, String telp,String kelamin,String tanggal2){
        hasilnama.setText(nama);
        hasilalamat.setText(alamat);
        hasilnotelp.setText(telp);
        jeniskelamin.setText(kelamin);
        tanggal.setText(tanggal2);
    }
   public void tampilhasil(int jumlah1, int jumlah2, int jumlah3, int jumlah4, int jumlah5, int jumlah6, int jumlah7, int jumlah8){
    
        hasil.setText("Jumlah Harga Barang Anda"+"\n"+"Tas Carier = "+jumlah1+"\n"+"Kompor = "+jumlah2+"\n"+"Matras = "+jumlah3+"\n"+"SB = "+jumlah4+"\n"+"Tongkat = "+jumlah5+"\n"+"Sepatu = "+jumlah6+"\n"+"Sandal = "+jumlah7+"\n"+"Tenda = "+jumlah8);
        
   }
   public void tampilnota1(String jenis){
       hasil.setText(jenis);
      
   }

    void setText(String nama, String telp, String alamat, String jenis, String tanggal) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @FXML
    private void exit(ActionEvent event) throws IOException {
        ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("FXMLDocument.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("FXMLDocument");
            stage.show();
    }
    
}

   
    
