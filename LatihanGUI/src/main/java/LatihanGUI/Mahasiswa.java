 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;
import java.util.ArrayList;

/**
 *
 * @author Renata
 */
public class Mahasiswa {

    private String nim;
    private String nama;
    private String jenisKelamin;
    private int umur;
    private String alamat;
    private String asalProvinsi;
    private ArrayList<String> hobi;

    /**
     * @return the nim
     */
    public String getNim() {
        return nim;
    }

    /**
     * @param nim the nim to set
     */
    public void setNim(String nim) {
        this.nim = nim;
    }

    /**
     * @return the nama
     */
    public String getNama() {
        return nama;
    }

    /**
     * @param nama the nama to set
     */
    public void setNama(String nama) {
        this.nama = nama;
    }

    /**
     * @return the jenisKelamin
     */
    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * @param jenisKelamin the jenisKelamin to set
     */
    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    /**
     * @return the umur
     */
    public int getUmur() {
        return umur;
    }

    /**
     * @param umur the umur to set
     */
    public void setUmur(int umur) {
        this.umur = umur;
    }

    /**
     * @return the alamat
     */
    public String getAlamat() {
        return alamat;
    }

    /**
     * @param alamat the alamat to set
     */
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    /**
     * @return the asalProvinsi
     */
    public String getAsalProvinsi() {
        return asalProvinsi;
    }

    /**
     * @param asalProvinsi the asalProvinsi to set
     */
    public void setAsalProvinsi(String asalProvinsi) {
        this.asalProvinsi = asalProvinsi;
    }
    
    public ArrayList<String> getHobi(){
        return hobi;
    }

    /**
     * @param hobi the hobi to set
     */
    public void setHobi(ArrayList<String> hobi) {
        this.hobi = hobi;
    }
} 
