/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ta;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.ObservableList;

/**
 *
 * @author SMK TELKOM
 */
public class Barang {

    private String namabrg;
    private Integer hargasewa;

    public Barang(String namabrg, Integer hargasewa) {
        this.namabrg = namabrg;
        this.hargasewa = hargasewa;
    }

    /**
     * @return the namabrg
     */
    public String getNamabrg() {
        return namabrg;
    }

    /**
     * @param namabrg the namabrg to set
     */
    public void setNamabrg(String namabrg) {
        this.namabrg = namabrg;
    }

    /**
     * @return the hargasewa
     */
    public Integer getHargasewa() {
        return hargasewa;
    }

    /**
     * @param hargasewa the hargasewa to set
     */
    public void setHargasewa(Integer hargasewa) {
        this.hargasewa = hargasewa;
    }

    
}
