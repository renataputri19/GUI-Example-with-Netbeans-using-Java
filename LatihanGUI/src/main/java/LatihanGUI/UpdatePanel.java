/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LatihanGUI;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Renata
 */
public class UpdatePanel extends javax.swing.JPanel {

    /**
     * Creates new form EntryPanel
     */
    public UpdatePanel() {
        initComponents();
        loadTableData();
        nimTextField.setEditable(false);
        nimTextField.setEnabled(false); 
    }
    
    String errormessage;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jkButtonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        asalProvComboBox = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        membacaCheckBox = new javax.swing.JCheckBox();
        menyanyiCheckBox = new javax.swing.JCheckBox();
        menontonFilmCheckBox = new javax.swing.JCheckBox();
        resetButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        nimTextField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lakiLakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        namaTextField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        alamatTextArea = new javax.swing.JTextArea();
        umurSpinner = new javax.swing.JSpinner();
        deleteButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        mahasiswaTable = new javax.swing.JTable();

        setLayout(new java.awt.BorderLayout(20, 20));

        jLabel5.setText("Umur : ");

        jLabel6.setText("Alamat : ");

        jLabel7.setText("Asal Provinsi : ");

        asalProvComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Aceh", "Sumatera Utara", "Sumatera Barat", "Riau", "Kepulauan Riau", "Jambi", "Sumatera Selatan", "Kepulauan Bangka Belitung", "Bengkulu", "Lampung", "DKI Jakarta", "Banten", "Jawa Barat", "Jawa Tengah", "DI Yogyakarta", "Jawa Timur", "Bali", "Nusa Tenggara Barat", "Nusa Tenggara Timur", "Kalimantan Barat", "Kalimantan Tengah", "Provinsi Kalimantan Selatan", "Kalimantan Timur", "Kalimantan Utara", "Sulawesi Utara", "Gorontalo", "Sulawesi Tengah", "Sulawesi Barat", "Provinsi Sulawesi Selatan", "Sulawesi Tenggara", "Maluku", "Maluku Utara", "Papua Barat", "Papua" }));
        asalProvComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                asalProvComboBoxActionPerformed(evt);
            }
        });

        jLabel8.setText("Hobi : ");

        membacaCheckBox.setText("Membaca");
        membacaCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                membacaCheckBoxActionPerformed(evt);
            }
        });

        menyanyiCheckBox.setText("Menyanyi");
        menyanyiCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menyanyiCheckBoxActionPerformed(evt);
            }
        });

        menontonFilmCheckBox.setText("Menonton Film");
        menontonFilmCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menontonFilmCheckBoxActionPerformed(evt);
            }
        });

        resetButton.setText("Reset ME!");
        resetButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("Nama : ");

        nimTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nimTextFieldActionPerformed(evt);
            }
        });

        jLabel2.setText("NIM : ");

        jLabel3.setText("Jenis Kelamin : ");

        jkButtonGroup.add(lakiLakiRadioButton);
        lakiLakiRadioButton.setText("Laki-laki");
        lakiLakiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiLakiRadioButtonActionPerformed(evt);
            }
        });

        jkButtonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");

        namaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaTextFieldActionPerformed(evt);
            }
        });

        jLabel4.setText("Tahun");

        alamatTextArea.setColumns(20);
        alamatTextArea.setRows(5);
        jScrollPane2.setViewportView(alamatTextArea);

        umurSpinner.setModel(new javax.swing.SpinnerNumberModel(15, 10, 60, 1));

        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        updateButton.setText("Update");
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(resetButton)
                .addGap(18, 18, 18)
                .addComponent(deleteButton)
                .addGap(18, 18, 18)
                .addComponent(updateButton)
                .addContainerGap(38, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel4))
                        .addComponent(lakiLakiRadioButton)
                        .addComponent(asalProvComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(perempuanRadioButton)
                        .addComponent(membacaCheckBox)
                        .addComponent(menyanyiCheckBox)
                        .addComponent(menontonFilmCheckBox)
                        .addComponent(namaTextField)
                        .addComponent(nimTextField)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE))
                    .addContainerGap(39, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(588, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resetButton)
                    .addComponent(deleteButton)
                    .addComponent(updateButton))
                .addGap(24, 24, 24))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nimTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(namaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(24, 24, 24)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(lakiLakiRadioButton)
                            .addGap(18, 18, 18)
                            .addComponent(perempuanRadioButton)))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(umurSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addGap(33, 33, 33)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel6)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(27, 27, 27)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(asalProvComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7))
                    .addGap(56, 56, 56)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(membacaCheckBox)
                        .addComponent(jLabel8))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(menyanyiCheckBox)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(menontonFilmCheckBox)
                    .addContainerGap(18, Short.MAX_VALUE)))
        );

        add(jPanel1, java.awt.BorderLayout.LINE_START);

        mahasiswaTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "NIM", "Nama", "Jenis kelamin", "Umur"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        mahasiswaTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mahasiswaTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(mahasiswaTable);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 482, Short.MAX_VALUE)
                .addGap(16, 16, 16))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        add(jPanel2, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void asalProvComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_asalProvComboBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_asalProvComboBoxActionPerformed

    private void membacaCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_membacaCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_membacaCheckBoxActionPerformed

    private void menyanyiCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menyanyiCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menyanyiCheckBoxActionPerformed

    private void menontonFilmCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menontonFilmCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_menontonFilmCheckBoxActionPerformed

    private void resetButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetButtonActionPerformed
       clearForm();
    }//GEN-LAST:event_resetButtonActionPerformed

    private boolean validasi(){
        boolean status = true;
        errormessage= "";
        if (nimTextField.getText().equals("")){
            status = false;
            errormessage = errormessage + "NIM Kosong\n";
        }
        
        if(namaTextField.getText().equals("")){
            status = false;
            errormessage = errormessage + "Nama Kosong\n";
        }
        
        if(!lakiLakiRadioButton.isSelected() && !perempuanRadioButton.isSelected()){
            status = false;
            errormessage = errormessage + "Jenis Kelamin belum dipilih\n";
        }
        return status;
    }
    
    private void clearForm(){
        nimTextField.setText("");
        namaTextField.setText("");
        jkButtonGroup.clearSelection();
        umurSpinner.setValue(15);
        alamatTextArea.setText("");
        asalProvComboBox.setSelectedIndex(-1);
        membacaCheckBox.setSelected(false);
        menyanyiCheckBox.setSelected(false);
        menontonFilmCheckBox.setSelected(false);
    }
    
    private void loadTableData(){
        DefaultTableModel dtm = (DefaultTableModel) mahasiswaTable.getModel();
        //Bersihkan tabel
        while(dtm.getRowCount()>0){
            dtm.removeRow(0);
        }
        for(Mahasiswa mhs : Database.getInstance().getListMahasiswa()){
        dtm.addRow(new Object[]{mhs.getNim(), mhs.getNama(), mhs.getJenisKelamin(),mhs.getUmur()});
        }
    }
    
    private void nimTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nimTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nimTextFieldActionPerformed

    private void lakiLakiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiLakiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiLakiRadioButtonActionPerformed

    private void namaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaTextFieldActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        Mahasiswa mhs = Database.getInstance().getMhs(nimTextField.getText());
        if (JOptionPane.showConfirmDialog(this, "Hapus Data?") == JOptionPane.OK_OPTION){
            Database.getInstance().delMhs(mhs);
            clearForm();
        }
        loadTableData();
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        Mahasiswa mhs = new Mahasiswa();

        mhs.setNim(nimTextField.getText());
        mhs.setNama(namaTextField.getText());
        if(lakiLakiRadioButton.isSelected()){
            mhs.setJenisKelamin("Laki-laki");
        }
        if(perempuanRadioButton.isSelected()){
            mhs.setJenisKelamin("Perempuan");
        }
        int umur = (Integer) umurSpinner.getValue();
        mhs.setUmur(umur);
        mhs.setAlamat(alamatTextArea.getText());
        mhs.setAsalProvinsi(asalProvComboBox.getSelectedItem().toString());
        ArrayList<String> hobiList = new ArrayList<>();
        if(membacaCheckBox.isSelected()){
            hobiList.add("Membaca");
        }
        if(menyanyiCheckBox.isSelected()){
            hobiList.add("Menyanyi");
        }
        if(menontonFilmCheckBox.isSelected()){
            hobiList.add("Menonton Film");
        }
        mhs.setHobi(hobiList);

        if(validasi()){
        Database.getInstance().updateMhs(mhs);
        clearForm();
        JOptionPane.showMessageDialog(this,"Update Data Berhasil");
        }
        else JOptionPane.showMessageDialog(this, errormessage, "Error", JOptionPane.ERROR_MESSAGE);
        
        
        loadTableData();
    }//GEN-LAST:event_updateButtonActionPerformed

    private void mahasiswaTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mahasiswaTableMouseClicked
        DefaultTableModel dataMhs = (DefaultTableModel) mahasiswaTable.getModel();
        
        String nim = dataMhs.getValueAt(mahasiswaTable.getSelectedRow(), 0).toString();
        Mahasiswa m = Database.getInstance().getMhs(nim);
        try{
            m = Database.getInstance().getMhs(nim);
        }
        catch(Exception e){
            
        }
        
        nimTextField.setText(m.getNim());
        namaTextField.setText(m.getNama());
        if (m.getJenisKelamin().equalsIgnoreCase("Perempuan")){
            perempuanRadioButton.setSelected(true);
        }   else {
            lakiLakiRadioButton.setSelected(true);
        }
        
        umurSpinner.setValue(m.getUmur());
        alamatTextArea.setText(m.getAlamat());
        asalProvComboBox.setSelectedItem(m.getAsalProvinsi());
        membacaCheckBox.setSelected(false);
        menyanyiCheckBox.setSelected(false);
        menontonFilmCheckBox.setSelected(false);
        
        for (String hobi : m.getHobi()){
            if(hobi.equalsIgnoreCase("Membaca")){
                membacaCheckBox.setSelected(true);
            }
            
            if(hobi.equalsIgnoreCase("Menyanyi")){
                menyanyiCheckBox.setSelected(true);
            }
             
            if(hobi.equalsIgnoreCase("Menonton Film")){
                menontonFilmCheckBox.setSelected(true);
            }
        }
    }//GEN-LAST:event_mahasiswaTableMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea alamatTextArea;
    private javax.swing.JComboBox<String> asalProvComboBox;
    private javax.swing.JButton deleteButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.ButtonGroup jkButtonGroup;
    private javax.swing.JRadioButton lakiLakiRadioButton;
    private javax.swing.JTable mahasiswaTable;
    private javax.swing.JCheckBox membacaCheckBox;
    private javax.swing.JCheckBox menontonFilmCheckBox;
    private javax.swing.JCheckBox menyanyiCheckBox;
    private javax.swing.JTextField namaTextField;
    private javax.swing.JTextField nimTextField;
    private javax.swing.JRadioButton perempuanRadioButton;
    private javax.swing.JButton resetButton;
    private javax.swing.JSpinner umurSpinner;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
