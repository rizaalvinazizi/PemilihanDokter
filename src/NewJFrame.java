/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author riani
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jconadokt = new javax.swing.JComboBox<>();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        try {
            jtxtnama =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtnama");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel5 = new javax.swing.JLabel();
        try {
            jtxtalamat =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtalamat");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel6 = new javax.swing.JLabel();
        try {
            jtxtusia =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtusia");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel8 = new javax.swing.JLabel();
        try {
            jtxtjenis =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtjenis");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel9 = new javax.swing.JLabel();
        try {
            jtxtgol =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtgol");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel10 = new javax.swing.JLabel();
        try {
            jtxtstatus =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtstatus");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel11 = new javax.swing.JLabel();
        try {
            jtxtkewar =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtkewar");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel12 = new javax.swing.JLabel();
        try {
            jtxtwaktu =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtwaktu");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }
        jLabel13 = new javax.swing.JLabel();
        try {
            jtxtspesial =(javax.swing.JTextField)java.beans.Beans.instantiate(getClass().getClassLoader(), "NewJFrame_jtxtspesial");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (java.io.IOException e) {
            e.printStackTrace();
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("PEMILIHAN DOKTER");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 10, 270, 50);

        jLabel2.setText("Pilih Dokter");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 90, 80, 14);

        jconadokt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-- Pilih Salah Satu --", "DR. Farras Yassar", "DR. Anisa Putri ", "DR. Harun Fajar " }));
        jconadokt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jconadoktActionPerformed(evt);
            }
        });
        getContentPane().add(jconadokt);
        jconadokt.setBounds(150, 90, 190, 20);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Identitas"));
        jPanel1.setLayout(null);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel4.setText("Nama");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 30, 70, 15);

        jtxtnama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtnamaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtnama);
        jtxtnama.setBounds(120, 20, 130, 30);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Alamat");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 60, 80, 15);

        jtxtalamat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtalamatActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtalamat);
        jtxtalamat.setBounds(120, 50, 130, 30);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel6.setText("Usia");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(10, 90, 70, 15);

        jtxtusia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtusiaActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtusia);
        jtxtusia.setBounds(120, 80, 130, 30);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel8.setText("Jenis Kelamin");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 120, 80, 15);

        jtxtjenis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtjenisActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtjenis);
        jtxtjenis.setBounds(120, 110, 130, 30);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel9.setText("Golongan Darah");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(10, 150, 100, 15);

        jtxtgol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtgolActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtgol);
        jtxtgol.setBounds(120, 140, 130, 30);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel10.setText("Status");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(10, 180, 100, 15);

        jtxtstatus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtstatusActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtstatus);
        jtxtstatus.setBounds(120, 170, 130, 30);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel11.setText("Kewarganegaraan");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(10, 210, 100, 15);

        jtxtkewar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtkewarActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtkewar);
        jtxtkewar.setBounds(120, 200, 130, 30);

        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel12.setText("Waktu Praktek");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(10, 240, 100, 15);

        jtxtwaktu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtwaktuActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtwaktu);
        jtxtwaktu.setBounds(120, 230, 130, 30);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setText("Dokter Spesialis");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(10, 270, 100, 15);

        jtxtspesial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtspesialActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtspesial);
        jtxtspesial.setBounds(120, 260, 130, 30);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(20, 140, 340, 330);

        setBounds(0, 0, 416, 529);
    }// </editor-fold>//GEN-END:initComponents

    private void jconadoktActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jconadoktActionPerformed
        // TODO add your handling code here:
        if(jconadokt.getSelectedItem().equals("DR. Farras Yassar")){
        jtxtnama.setText("DR. Farras Yassar ");
        jtxtalamat.setText("Jl. Surabaya 16, Malang");
        jtxtusia.setText("20 Tahun");
        jtxtjenis.setText("Laki-Laki");
        jtxtgol.setText("A");
        jtxtstatus.setText("Belum Menikah ");
        jtxtkewar.setText("Indonesia");
        jtxtspesial.setText("Dokter Umum");
        jtxtwaktu.setText(" Pagi (07.00-15.00)");
        }
        else
        if(jconadokt.getSelectedItem().equals("DR. Anisa Putri ")){
        jtxtnama.setText("DR. Anisa Putri");
        jtxtalamat.setText("Jl. Veteran 3, Malang");
        jtxtusia.setText("20 Tahun");
        jtxtjenis.setText("Perempuan");
        jtxtgol.setText("O");
        jtxtstatus.setText("Belum Menikah");
        jtxtkewar.setText("Indonesia");
        jtxtspesial.setText("Dokter Gigi");
        jtxtwaktu.setText(" Sore (16.00-22.00)");
        }
        else
        if(jconadokt.getSelectedItem().equals("DR. Harun Fajar ")){
        jtxtnama.setText("DR. Harun Fajar ");
        jtxtalamat.setText("Jl. Bandung 9, Malang");
        jtxtusia.setText("20 Tahun");
        jtxtjenis.setText("Laki-Laki");
        jtxtgol.setText("B");
        jtxtstatus.setText("Belum Menikah");
        jtxtkewar.setText("Indonesia");
        jtxtspesial.setText("Dokter Gizi");
        jtxtwaktu.setText(" Malam (22.00-06.00)");
}
    }//GEN-LAST:event_jconadoktActionPerformed

    private void jtxtnamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtnamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtnamaActionPerformed

    private void jtxtalamatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtalamatActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtalamatActionPerformed

    private void jtxtusiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtusiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtusiaActionPerformed

    private void jtxtjenisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtjenisActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtjenisActionPerformed

    private void jtxtgolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtgolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtgolActionPerformed

    private void jtxtstatusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtstatusActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtstatusActionPerformed

    private void jtxtkewarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtkewarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtkewarActionPerformed

    private void jtxtwaktuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtwaktuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtwaktuActionPerformed

    private void jtxtspesialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtspesialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtspesialActionPerformed

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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> jconadokt;
    private javax.swing.JTextField jtxtalamat;
    private javax.swing.JTextField jtxtgol;
    private javax.swing.JTextField jtxtjenis;
    private javax.swing.JTextField jtxtkewar;
    private javax.swing.JTextField jtxtnama;
    private javax.swing.JTextField jtxtspesial;
    private javax.swing.JTextField jtxtstatus;
    private javax.swing.JTextField jtxtusia;
    private javax.swing.JTextField jtxtwaktu;
    // End of variables declaration//GEN-END:variables
}
