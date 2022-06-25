/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package formUtama;

import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MenuUtama extends javax.swing.JFrame {

    /**
     * Creates new form MenuUtama
     */
    //untuk mengeksekusi querey
    public Statement st;
    //untuk melihat dari eksekusi query
    public ResultSet rs;
    //untuk membuat tabel kita perlu membuat kelasnya dulu
    public DefaultTableModel tabModel;
    Connection conn = koneksi.Koneksi();
    
    public void judul(){
        Object[] judul = {
          "Nama","Aplikasi","Usename","Password",
        };
        tabModel = new DefaultTableModel(null, judul);
        tabel.setModel(tabModel);
    }
    
    public void tampilData(String where){
        try {
            st = conn.createStatement();
            tabModel.getDataVector().removeAllElements();;
            tabModel.fireTableDataChanged();
            rs = st.executeQuery("SELECT * FROM menu_utama" + where);
            while (rs.next()){
                Object[] data ={
                    rs.getString("Nama"),
                    rs.getString("Aplikasi"),
                    rs.getString("Username"),
                    rs.getString("Password"),
                }; 
                tabModel.addRow(data);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 
	public static byte[] getSHA(String input) throws NoSuchAlgorithmException
	{
		// Static getInstance method dipanggil dengan hashing SHA
		MessageDigest md = MessageDigest.getInstance("SHA-256");

	
		return md.digest(input.getBytes(StandardCharsets.UTF_8));
	}
	
	public static String toHexString(byte[] hash)
	{
		// buat parameter arraynya
		BigInteger number = new BigInteger(1, hash);

		// mengubah pesan menjadi hexvalue
		StringBuilder hexString = new StringBuilder(number.toString(16));

		
		while (hexString.length() < 64)
		{
			hexString.insert(0, '0');
		}

		return hexString.toString();
	}  

    
    public MenuUtama() {
        
        initComponents();  
        judul();
        tampilData("");
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNamaAkun = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtAplikasi = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtKeterangan = new javax.swing.JTextArea();
        btnHapus = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jScrollPane4 = new javax.swing.JScrollPane();
        tabel = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Kelola Akun");

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel1.setText("Nama Akun");

        txtNamaAkun.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel2.setText("Aplikasi/Website/URL");

        txtAplikasi.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel3.setText("Username");

        txtUsername.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        jLabel4.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel4.setText("Password");

        jLabel6.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel6.setText("Keterangan");

        txtKeterangan.setColumns(20);
        txtKeterangan.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        txtKeterangan.setRows(5);
        jScrollPane1.setViewportView(txtKeterangan);

        btnHapus.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnHapus.setText("Detele");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        btnSimpan.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnSimpan.setText("Save");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnUbah.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N
        btnUbah.setText("Update");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        txtPassword.setFont(new java.awt.Font("Yu Gothic UI", 0, 12)); // NOI18N

        tabel.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(tabel);

        jPanel2.setBackground(new java.awt.Color(0, 255, 204));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("STSong", 1, 18)); // NOI18N
        jLabel5.setText("MAIN MENU");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(180, 180, 180))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jLabel7.setFont(new java.awt.Font("Yu Gothic UI", 1, 12)); // NOI18N
        jLabel7.setText("Daftar Akun");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtNamaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel2))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtAplikasi, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel3))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel4))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel6))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel7))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel1)
                .addGap(6, 6, 6)
                .addComponent(txtNamaAkun, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel2)
                .addGap(11, 11, 11)
                .addComponent(txtAplikasi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel3)
                .addGap(6, 6, 6)
                .addComponent(txtUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel4)
                .addGap(8, 8, 8)
                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnSimpan))
                    .addComponent(btnHapus)
                    .addComponent(btnUbah))
                .addGap(26, 26, 26)
                .addComponent(jLabel7)
                .addGap(11, 11, 11)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        // TODO add your handling code here:
      String sql = "INSERT INTO menu_utama VALUES (?,?,?,?)";  
      try {
            String S1 = txtPassword.getText();
            txtPassword.setText("\n" + toHexString(getSHA(S1)));
            st = conn.createStatement();
            st.executeUpdate("INSERT INTO menu_utama VALUES('" + txtNamaAkun.getText() + "','"
                + txtAplikasi.getText() + "','"
                + txtUsername.getText() + "','"
                + txtPassword.getText()+ "')");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Simpan Data Berhasil");
            bersih();
          } catch (Exception e) {
            e.printStackTrace();
          }
      
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        // TODO add your handling code here:
      try {
            st = conn.createStatement();//untuk mengkoneksikan ke databasenya
            //untuk mengeksekusi update kita memerlukan executUpdate
            st.executeUpdate("UPDATE menu_utama set " 
                + "Aplikasi='"      + txtAplikasi.getText() + "', "
                + "Username='"      + txtUsername.getText() + "', "
                + "Password='"         + txtPassword.getText()+ "' where Nama= '"      +txtNamaAkun.getText() + "'");
            tampilData("");
            JOptionPane.showMessageDialog(null, "Ubah Data Berhasil");//kita buat massage dialog ketika data berhasil diubah
          bersih();
        } catch (Exception e) {
            e.printStackTrace();
        }  
    }//GEN-LAST:event_btnUbahActionPerformed

    private void tabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelMouseClicked
        // TODO add your handling code here:
        //ketika tabel di klik agar dapat mentriggernya sehingga dapat diubah2
        txtNamaAkun.setText(tabel.getValueAt(tabel.getSelectedRow(), 0).toString());
        txtAplikasi.setText(tabel.getValueAt(tabel.getSelectedRow(), 1).toString());
        txtUsername.setText(tabel.getValueAt(tabel.getSelectedRow(), 2).toString());
        txtPassword.setText(tabel.getValueAt(tabel.getSelectedRow(), 3).toString());
       
    }//GEN-LAST:event_tabelMouseClicked

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        // TODO add your handling code here:
        try {
            int jawab;
            //opsi pilihan ketika ingin menghapus data
            if ((jawab = JOptionPane.showConfirmDialog(null, "Ingin menghapus data?", "konfirmasi", JOptionPane.YES_NO_OPTION)) == 0) {
              st = conn.createStatement();//koneksi database
              st.executeUpdate("DELETE FROM menu_utama WHERE Nama='"
                  + tabModel.getValueAt(tabel.getSelectedRow(), 0) + "'");
              tampilData("");
              bersih();
            }
          } catch (Exception e) {
            e.printStackTrace();
          }
    }//GEN-LAST:event_btnHapusActionPerformed
    
    public void bersih(){
        txtNamaAkun.setText("");
        txtAplikasi.setText("");
        txtUsername.setText("");
        txtPassword.setText("");
       //ketika password diklik akan kembali seperti text yang kosong
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuUtama.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuUtama().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable tabel;
    private javax.swing.JTextField txtAplikasi;
    private javax.swing.JTextArea txtKeterangan;
    private javax.swing.JTextField txtNamaAkun;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
