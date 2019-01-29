package kitapsatisi.model;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
//import javax.swing.table.*;﻿


/**
 *
 * @author Sammy
 */
public class Personel_Ekrani extends javax.swing.JFrame {
        
 
    void tableYazdirma(){
    /*
        Burada Table'ı ResultSet ile ekrana bastiracagiz.
        */
        try{
        Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sammy\\Documents\\NetBeansProjects\\KitapSatisi\\kitaplar.db");
        Statement statement = conn.createStatement();
        ResultSet rs = statement.executeQuery("SELECT * FROM kitaplistesi");
        
        DefaultTableModel model = (DefaultTableModel)jTable_kitaplistesison.getModel();
        for(int i = model.getRowCount() - 1; i>=0; i--){
            model.removeRow(i);
        }
        while(rs.next()){
            Object satir[] = new Object[6];
            satir[0] = rs.getString(1);
            satir[1] = rs.getString(2);
            satir[2] = rs.getString(3);
            satir[3] = rs.getString(4);
            satir[4] = rs.getString(5);
            satir[5] = rs.getString(6);
            model.addRow(satir);
        }
        conn.close();
        }
        catch(Exception e){
            System.out.println("HATA tableYazdirma()... " + e);
        }
                
    }
    
    public Personel_Ekrani() {
        initComponents();
        
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        KitapSatisiPUEntityManager = java.beans.Beans.isDesignTime() ? null : javax.persistence.Persistence.createEntityManagerFactory("KitapSatisiPU").createEntityManager();
        kitaplar_1Query = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query.getResultList();
        kitaplar_1Query1 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List1 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query1.getResultList();
        kitaplar_1Query2 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List2 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query2.getResultList();
        kitaplar_1Query3 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List3 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query3.getResultList();
        kitaplar_1Query4 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List4 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query4.getResultList();
        kitaplar_1Query5 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List5 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query5.getResultList();
        kitaplar_1Query6 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List6 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query6.getResultList();
        kitaplar_1Query7 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List7 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query7.getResultList();
        kitaplar_1Query8 = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplar_1 k");
        kitaplar_1List8 = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplar_1Query8.getResultList();
        kitaplistesiQuery = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM Kitaplistesi k");
        kitaplistesiList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitaplistesiQuery.getResultList();
        kitapListesiSonQuery = java.beans.Beans.isDesignTime() ? null : KitapSatisiPUEntityManager.createQuery("SELECT k FROM KitapListesiSon k");
        kitapListesiSonList = java.beans.Beans.isDesignTime() ? java.util.Collections.emptyList() : kitapListesiSonQuery.getResultList();
        jTextField_Adi = new javax.swing.JTextField();
        jTextField_Sayfa = new javax.swing.JTextField();
        jTextField_Yazar = new javax.swing.JTextField();
        jLabel_Adi = new javax.swing.JLabel();
        jLabel_Yazar = new javax.swing.JLabel();
        jLabel_Sayfa = new javax.swing.JLabel();
        jTextField_Yayinevi = new javax.swing.JTextField();
        jLabel_Yayinevi = new javax.swing.JLabel();
        jButton1_Ekle = new javax.swing.JButton();
        jButton1_Guncelle = new javax.swing.JButton();
        jButton1_Sil = new javax.swing.JButton();
        jTextField_Fiyat = new javax.swing.JTextField();
        jLabel_Fiyat = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton_yenile = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable_kitaplistesison = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel_id = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTextField_Adi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_AdiActionPerformed(evt);
            }
        });

        jTextField_Sayfa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_SayfaActionPerformed(evt);
            }
        });

        jLabel_Adi.setText("Adi");

        jLabel_Yazar.setText("Yazar");

        jLabel_Sayfa.setText("Sayfa Sayisi");

        jLabel_Yayinevi.setText("Yayinevi");

        jButton1_Ekle.setText("Ekle");
        jButton1_Ekle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_EkleActionPerformed(evt);
            }
        });

        jButton1_Guncelle.setText("Guncelle");
        jButton1_Guncelle.setMaximumSize(new java.awt.Dimension(55, 25));
        jButton1_Guncelle.setMinimumSize(new java.awt.Dimension(55, 25));
        jButton1_Guncelle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_GuncelleActionPerformed(evt);
            }
        });

        jButton1_Sil.setText("Sil");
        jButton1_Sil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_SilActionPerformed(evt);
            }
        });

        jTextField_Fiyat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField_FiyatActionPerformed(evt);
            }
        });

        jLabel_Fiyat.setText("Fiyat");

        jButton1.setText("Geri");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton_yenile.setText("Yenile");
        jButton_yenile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_yenileActionPerformed(evt);
            }
        });

        org.jdesktop.swingbinding.JTableBinding jTableBinding = org.jdesktop.swingbinding.SwingBindings.createJTableBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, kitapListesiSonList, jTable_kitaplistesison);
        org.jdesktop.swingbinding.JTableBinding.ColumnBinding columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${id}"));
        columnBinding.setColumnName("Id");
        columnBinding.setColumnClass(Integer.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${adi}"));
        columnBinding.setColumnName("Adi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${sayfa}"));
        columnBinding.setColumnName("Sayfa");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${yazar}"));
        columnBinding.setColumnName("Yazar");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${yayinevi}"));
        columnBinding.setColumnName("Yayinevi");
        columnBinding.setColumnClass(String.class);
        columnBinding = jTableBinding.addColumnBinding(org.jdesktop.beansbinding.ELProperty.create("${fiyat}"));
        columnBinding.setColumnName("Fiyat");
        columnBinding.setColumnClass(String.class);
        bindingGroup.addBinding(jTableBinding);
        jTableBinding.bind();
        jTable_kitaplistesison.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_kitaplistesisonMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable_kitaplistesison);

        jLabel1.setText("ID");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(260, 260, 260)
                                .addComponent(jButton_yenile)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel_Yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel_Sayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(81, 81, 81)
                                        .addComponent(jLabel2))
                                    .addComponent(jTextField_Yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jTextField_Sayfa)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton1_Ekle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(93, 93, 93)
                                .addComponent(jButton1_Guncelle, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1_Sil, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Fiyat))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Yazar, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Yazar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_Adi)
                                    .addComponent(jLabel_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(32, 32, 32)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel_id, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Adi, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Sayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Sayfa, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Yazar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Yazar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_Yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel_Yayinevi, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Fiyat, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1_Guncelle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_Sil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1_Ekle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_yenile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209))
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField_AdiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_AdiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_AdiActionPerformed

    private void jButton1_EkleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_EkleActionPerformed
        if(jTextField_Adi.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Kitap Adi girilmedi...");
        } 
        else{
            try{
                Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sammy\\Documents\\NetBeansProjects\\KitapSatisi\\kitaplar.db");
                Statement statement = conn.createStatement();
                String ins = "INSERT INTO kitaplistesison(adi,sayfa,yazar,yayinevi,fiyat)" + "VALUES('" + jTextField_Adi.getText() + 
                                  "','" + jTextField_Sayfa.getText() + "','" + jTextField_Yazar.getText() + 
                                  "','" + jTextField_Yayinevi.getText() + "','" + jTextField_Fiyat.getText() + "');";
                statement.executeUpdate(ins);
                statement.close();
                conn.close();
                JOptionPane.showMessageDialog(null, "Ekleme Basarili...");
                
                
                
            }catch(Exception e){
                System.out.println("HATA insert..." + e);
            }
           // this.tableYazdirma();
        }
    }//GEN-LAST:event_jButton1_EkleActionPerformed

    private void jTextField_SayfaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_SayfaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_SayfaActionPerformed

    private void jTextField_FiyatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField_FiyatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField_FiyatActionPerformed

    private void jButton1_GuncelleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_GuncelleActionPerformed
        if(jTextField_Adi.getText().compareTo("") == 0){
            JOptionPane.showMessageDialog(null, "Kitap Adi girilmedi...");
        } 
        else{
            try{
                Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Sammy\\Documents\\NetBeansProjects\\KitapSatisi\\kitaplar.db");
                Statement statement = conn.createStatement();
                String update = "UPDATE kitaplistesison SET adi='" + jTextField_Adi.getText() +
                                             "',sayfa='" + jTextField_Sayfa.getText() +
                                             "',yazar='" +jTextField_Yazar.getText() +
                                             "',yayinevi='" + jTextField_Yayinevi.getText() +
                                             "',fiyat='" + jTextField_Fiyat.getText() + 
                                             "' WHERE id=" + jLabel_id.getText();
                        
                statement.executeUpdate(update);
                statement.close();
                conn.close();
                JOptionPane.showMessageDialog(null, "Guncelleme Basarili...");
                
                
            }catch(Exception e){
                System.out.println("HATA...update !!" + e);
            }
        }
    }//GEN-LAST:event_jButton1_GuncelleActionPerformed

    private void jButton1_SilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_SilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1_SilActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        GirisEkrani grs = new GirisEkrani();
        grs.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton_yenileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_yenileActionPerformed
        this.setVisible(false);
        Personel_Ekrani prsnl = new Personel_Ekrani();
        prsnl.setVisible(true);
    }//GEN-LAST:event_jButton_yenileActionPerformed

    private void jTable_kitaplistesisonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_kitaplistesisonMouseClicked
        int satir = jTable_kitaplistesison.getSelectedRow();
        TableModel model = jTable_kitaplistesison.getModel();
        
        String string= jTable_kitaplistesison.getValueAt(satir, 0).toString();
        int test = Integer.parseInt(string);
        
        jLabel_id.setText(String.valueOf(test));
        jTextField_Adi.setText((String) model.getValueAt(satir, 1));

        jTextField_Sayfa.setText((String) model.getValueAt(satir, 2));

        jTextField_Yazar.setText((String) model.getValueAt(satir, 3));

        jTextField_Yayinevi.setText((String) model.getValueAt(satir, 4));

        jTextField_Fiyat.setText((String) model.getValueAt(satir, 5));
    }//GEN-LAST:event_jTable_kitaplistesisonMouseClicked

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
            java.util.logging.Logger.getLogger(Personel_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Personel_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Personel_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Personel_Ekrani.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Personel_Ekrani().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.persistence.EntityManager KitapSatisiPUEntityManager;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton1_Ekle;
    private javax.swing.JButton jButton1_Guncelle;
    private javax.swing.JButton jButton1_Sil;
    private javax.swing.JButton jButton_yenile;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel_Adi;
    private javax.swing.JLabel jLabel_Fiyat;
    private javax.swing.JLabel jLabel_Sayfa;
    private javax.swing.JLabel jLabel_Yayinevi;
    private javax.swing.JLabel jLabel_Yazar;
    private javax.swing.JLabel jLabel_id;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable_kitaplistesison;
    private javax.swing.JTextField jTextField_Adi;
    private javax.swing.JTextField jTextField_Fiyat;
    private javax.swing.JTextField jTextField_Sayfa;
    private javax.swing.JTextField jTextField_Yayinevi;
    private javax.swing.JTextField jTextField_Yazar;
    private java.util.List<kitapsatisi.model.KitapListesiSon> kitapListesiSonList;
    private javax.persistence.Query kitapListesiSonQuery;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List1;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List2;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List3;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List4;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List5;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List6;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List7;
    private java.util.List<kitapsatisi.model.Kitaplar_1> kitaplar_1List8;
    private javax.persistence.Query kitaplar_1Query;
    private javax.persistence.Query kitaplar_1Query1;
    private javax.persistence.Query kitaplar_1Query2;
    private javax.persistence.Query kitaplar_1Query3;
    private javax.persistence.Query kitaplar_1Query4;
    private javax.persistence.Query kitaplar_1Query5;
    private javax.persistence.Query kitaplar_1Query6;
    private javax.persistence.Query kitaplar_1Query7;
    private javax.persistence.Query kitaplar_1Query8;
    private java.util.List<kitapsatisi.model.Kitaplistesi> kitaplistesiList;
    private javax.persistence.Query kitaplistesiQuery;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables
}
