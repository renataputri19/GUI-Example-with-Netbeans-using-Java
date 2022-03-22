/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Renata
 */
public class Database {
    private static Database instance;

    static Mahasiswa getInstance(String text) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private ArrayList<Mahasiswa> data = new ArrayList<>();

    private Database() {

    }

    public static synchronized Database getInstance() {
        if (instance == null){
            instance = new Database();
        }
        return instance;
    }

    public void delMhs(Mahasiswa mhs){
        for (Mahasiswa m : data){
            if(m.equals(getMhs(mhs.getNim()))){
                int a = data.indexOf(m);
                data.remove(a);
                break;
            }
        }
    }
    
    public void updateMhs(Mahasiswa mhs) {
        for (Mahasiswa m : data) {
            if (m.equals(getMhs(mhs.getNim()))) {
                int a = data.indexOf(m);
                data.set(a, mhs);
                break;
            }
        }
    }

    public void insertMahasiswa(Mahasiswa mahasiswa){
        data.add(mahasiswa);
    }

    public List<Mahasiswa> getListMahasiswa(){
        return data;
    }
    
    public Mahasiswa getMhs (String nim){
        Mahasiswa m = null;
        for(Mahasiswa mhs: data){
            if (nim.equals(mhs.getNim())){
                m = mhs;
                break;
            }
        }
        return m;
    }
}
