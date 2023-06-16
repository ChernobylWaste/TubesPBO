/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author Just Mine
 */
import classes.User;
import classes.mysql;

public class Profile extends javax.swing.JFrame {

    /**
     * Creates new form Profile
     */
    public Profile() {
        initComponents();
        User user = User.getInstance();
        nama_praktikan1.setText(user.getUsername());
        nim_praktikan.setText(Integer.toString(user.getNim()));
        prodi_praktikan.setText(user.getProdi());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        TeluLogo = new javax.swing.JLabel();
        TeluLogo1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nim_praktikan = new javax.swing.JTextField();
        prodi_praktikan = new javax.swing.JTextField();
        nama_praktikan1 = new javax.swing.JTextField();
        TeluLogo2 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        TabelListPrak = new javax.swing.JTable();
        mbcinfo = new javax.swing.JTextField();
        daskominfo = new javax.swing.JTextField();
        fisdasinfo = new javax.swing.JTextField();
        imvinfo = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(113, 201, 206));

        jPanel2.setBackground(new java.awt.Color(166, 227, 233));
        jPanel2.setForeground(new java.awt.Color(84, 91, 119));
        jPanel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(84, 91, 119));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("DATA PRIBADI");

        TeluLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telu.png"))); // NOI18N

        TeluLogo1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/telu.png"))); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(TeluLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(150, 150, 150)
                .addComponent(TeluLogo1, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TeluLogo1)
                    .addComponent(TeluLogo)
                    .addComponent(jLabel1))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(203, 241, 245));

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jToggleButton1.setBackground(new java.awt.Color(22, 120, 191));
        jToggleButton1.setText("LOGOUT");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(84, 91, 119));
        jLabel3.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(84, 91, 119));
        jLabel3.setText("NAMA  :");

        jLabel4.setBackground(new java.awt.Color(84, 91, 119));
        jLabel4.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(84, 91, 119));
        jLabel4.setText("NIM      :");

        jLabel5.setBackground(new java.awt.Color(84, 91, 119));
        jLabel5.setFont(new java.awt.Font("Gill Sans Ultra Bold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(84, 91, 119));
        jLabel5.setText("PRODI  :");

        nim_praktikan.setEditable(false);
        nim_praktikan.setBackground(new java.awt.Color(167, 236, 238));
        nim_praktikan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nim_praktikan.setForeground(new java.awt.Color(0, 0, 0));
        nim_praktikan.setText("-NIM-");
        nim_praktikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nim_praktikanActionPerformed(evt);
            }
        });

        prodi_praktikan.setEditable(false);
        prodi_praktikan.setBackground(new java.awt.Color(167, 236, 238));
        prodi_praktikan.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        prodi_praktikan.setForeground(new java.awt.Color(0, 0, 0));
        prodi_praktikan.setText("-PRODI-");
        prodi_praktikan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prodi_praktikanActionPerformed(evt);
            }
        });

        nama_praktikan1.setEditable(false);
        nama_praktikan1.setBackground(new java.awt.Color(167, 236, 238));
        nama_praktikan1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nama_praktikan1.setForeground(new java.awt.Color(0, 0, 0));
        nama_praktikan1.setText("-NAMA-");
        nama_praktikan1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nama_praktikan1ActionPerformed(evt);
            }
        });

        TeluLogo2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/favpng_avatar-user-profile (1).png"))); // NOI18N

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(nim_praktikan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(prodi_praktikan, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nama_praktikan1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel4Layout.createSequentialGroup()
                                        .addGap(31, 31, 31)
                                        .addComponent(TeluLogo2)))
                                .addGap(11, 11, 11))))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(TeluLogo2)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(nama_praktikan1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(nim_praktikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(prodi_praktikan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jToggleButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Gill Sans Ultra Bold", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(84, 91, 119));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("PRAKTIKUM YANG DIIKUTI");

        jToggleButton2.setBackground(new java.awt.Color(22, 120, 191));
        jToggleButton2.setText("ENROLL PRAKTIKUM");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        TabelListPrak.setAutoCreateRowSorter(true);
        TabelListPrak.setBackground(new java.awt.Color(154, 179, 245));
        TabelListPrak.setFont(new java.awt.Font("Gill Sans MT", 1, 18)); // NOI18N
        TabelListPrak.setForeground(new java.awt.Color(0, 0, 0));
        TabelListPrak.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"1", "MBC", "TT3"},
                {"2", "IMV", "TT3"},
                {"3", "DASKOM", "TT1"},
                {"4", "FISDAS", "TT1"},
                {"----", "----", "----"}
            },
            new String [] {
                " No", "Nama Lab", "Nama Praktikum"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TabelListPrak.setGridColor(new java.awt.Color(0, 0, 0));
        TabelListPrak.setRowHeight(55);
        TabelListPrak.setShowGrid(true);
        jScrollPane1.setViewportView(TabelListPrak);

        mbcinfo.setEditable(false);
        mbcinfo.setBackground(new java.awt.Color(194, 222, 220));
        mbcinfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        mbcinfo.setForeground(new java.awt.Color(0, 0, 0));
        mbcinfo.setText("TIDAK MENGIKUTI");
        mbcinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mbcinfoActionPerformed(evt);
            }
        });

        daskominfo.setEditable(false);
        daskominfo.setBackground(new java.awt.Color(194, 222, 220));
        daskominfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        daskominfo.setForeground(new java.awt.Color(0, 0, 0));
        daskominfo.setText("TIDAK MENGIKUTI");
        daskominfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daskominfoActionPerformed(evt);
            }
        });

        fisdasinfo.setEditable(false);
        fisdasinfo.setBackground(new java.awt.Color(194, 222, 220));
        fisdasinfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        fisdasinfo.setForeground(new java.awt.Color(0, 0, 0));
        fisdasinfo.setText("TIDAK MENGIKUTI");
        fisdasinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fisdasinfoActionPerformed(evt);
            }
        });

        imvinfo.setEditable(false);
        imvinfo.setBackground(new java.awt.Color(194, 222, 220));
        imvinfo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        imvinfo.setForeground(new java.awt.Color(0, 0, 0));
        imvinfo.setText("TIDAK MENGIKUTI");
        imvinfo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                imvinfoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 407, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 401, Short.MAX_VALUE)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(126, 126, 126)
                                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mbcinfo)
                            .addComponent(daskominfo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(fisdasinfo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                            .addComponent(imvinfo))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(mbcinfo)
                        .addGap(35, 35, 35)
                        .addComponent(imvinfo)
                        .addGap(29, 29, 29)
                        .addComponent(daskominfo)
                        .addGap(28, 28, 28)
                        .addComponent(fisdasinfo)
                        .addGap(19, 19, 19)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // Tombol back ke homepage
        Home ho = new Home();
        ho.show();

        dispose();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void nim_praktikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nim_praktikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nim_praktikanActionPerformed

    private void prodi_praktikanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prodi_praktikanActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prodi_praktikanActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // Tombol Enroll
        PilihP pp = new PilihP();
        pp.show();

        dispose();
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void nama_praktikan1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nama_praktikan1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nama_praktikan1ActionPerformed

    private void mbcinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mbcinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mbcinfoActionPerformed

    private void daskominfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daskominfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daskominfoActionPerformed

    private void fisdasinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fisdasinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fisdasinfoActionPerformed

    private void imvinfoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_imvinfoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_imvinfoActionPerformed

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
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Profile.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Profile().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TabelListPrak;
    private javax.swing.JLabel TeluLogo;
    private javax.swing.JLabel TeluLogo1;
    private javax.swing.JLabel TeluLogo2;
    private javax.swing.JTextField daskominfo;
    private javax.swing.JTextField fisdasinfo;
    private javax.swing.JTextField imvinfo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JTextField mbcinfo;
    private javax.swing.JTextField nama_praktikan1;
    private javax.swing.JTextField nim_praktikan;
    private javax.swing.JTextField prodi_praktikan;
    // End of variables declaration//GEN-END:variables
}
