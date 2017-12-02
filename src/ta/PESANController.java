/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import com.jfoenix.controls.JFXTextArea;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author Putri Ayu
 */
public class PESANController implements Initializable {

    @FXML
    private TextField editnama;
    @FXML
    private TextField editalamat;
    @FXML
    private TextField edittelp;
    @FXML
    private ComboBox jeniskelamin; 
    ObservableList<String> list = FXCollections.observableArrayList("Laki Laki", "Perempuam");
    @FXML
    private TextField edittanggal;
    @FXML
    private Button buttonsimpan;
    
    public String nama, telp, alamat, tanggal, jenis;

    public String jmlhcarier;
    public int jumlah1;

    public String jmlhkompor;
    public int jumlah2;

    public String jmlhmatras;
    public int jumlah3;

    public String jmlhsleepingbag;
    public int jumlah4;

    public String jmlhtongkat;
    public int jumlah5;

    public String jmlhsepatu;
    public int jumlah6;
    
    public String jmlhsandal;
    public int jumlah7;
    
    public String jmlhtenda;
    public int jumlah8;
    
    @FXML
    private JFXTextArea taBarang;
    @FXML
    private TextField jmlhc;
    @FXML
    private Button buttonproses;
    @FXML
    private TextField jmlhk;
    @FXML
    private TextField jmlhm;
    @FXML
    private TextField jmlhsb;
    @FXML
    private TextField jmlht;
    @FXML
    private TextField jmlhtu;
    @FXML
    private TextField jmlhdal;
    @FXML
    private TextField jmlhda;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        jeniskelamin.setItems(list);
        jeniskelamin.setValue("Pilih Jenis Kelamin");
        // TODO
    }    

    @FXML
    private void simpan(ActionEvent event) throws IOException {
        
         if (editnama.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Nama !!");
            editnama.requestFocus();
        } else if (editalamat.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Alamat Anda !!");
            editalamat.requestFocus();
        } else if (edittelp.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Nomer Telepon !!");
            edittelp.requestFocus();
        } else if (edittanggal.getText().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Tanggal Booking !!");
            edittanggal.requestFocus();
        } else if (jeniskelamin.getValue().toString().length() == 0) {
            javax.swing.JOptionPane.showMessageDialog(null, "Mohon Masukkan Jenis Kelamin Anda !!");
            jeniskelamin.requestFocus();
        } else {
            nama = editnama.getText();
            telp = edittelp.getText();
            alamat = editalamat.getText();
            jenis = (String) jeniskelamin.getValue();
            tanggal = edittanggal.getText();

            ((Node) (event.getSource())).getScene().getWindow().hide();
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader.setLocation(getClass().getResource("NOTA.fxml"));
            Scene scene = new Scene(fxmlLoader.load());
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.setTitle("NOTA");
            stage.show();
            NOTAController Data = new NOTAController();
            Data = fxmlLoader.getController();
            Data.tampilnota(nama, telp, alamat, jenis, tanggal);

        
        }
    }

    @FXML
    private void proses(ActionEvent event) {
        jmlhcarier=jmlhc.getText();
        jmlhkompor=jmlhk.getText();
        jmlhmatras=jmlhm.getText();
        jmlhsleepingbag=jmlhsb.getText();
        jmlhtongkat=jmlht.getText();
        jmlhsepatu=jmlhtu.getText();
        jmlhsandal=jmlhdal.getText();
        jmlhtenda=jmlhda.getText();
        
        jumlah1 =Integer.parseInt(jmlhcarier)*20000;
        jumlah2 =Integer.parseInt(jmlhkompor)*10000;
        jumlah3 =Integer.parseInt(jmlhmatras)*5000;
        jumlah4 =Integer.parseInt(jmlhsleepingbag)*15000;
        jumlah5 =Integer.parseInt(jmlhtongkat)*15000;
        jumlah6 =Integer.parseInt(jmlhsepatu)*20000;
        jumlah7 =Integer.parseInt(jmlhsandal)*15000;
        jumlah8 =Integer.parseInt(jmlhtenda)*20000;
        
        taBarang.setText("Jumlah Harga Barang Anda"+"\n"+"Tas Carier = "+jumlah1+"\n"+
                "Kompor = "+jumlah2+"\n"+"Matras = "+jumlah3+"\n"+"SB = "+jumlah4+"\n"+
                "Tongkat = "+jumlah5+"\n"+"Sepatu = "+jumlah6+"\n"+"Sandal = "+jumlah7+"\n"+"Tenda = "+jumlah8);

        
    }
    
}
