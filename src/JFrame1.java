
import JFrame2.JFrame2;
import javax.swing.ButtonGroup;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Win10
 */
public class JFrame1 extends javax.swing.JFrame {

    /**
     * Creates new form JFrame1
     */
    public JFrame1() {
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

        jurusan = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        nama = new javax.swing.JTextField();
        absen = new javax.swing.JTextField();
        kelas = new javax.swing.JComboBox<>();
        rpl = new javax.swing.JRadioButton();
        tkj = new javax.swing.JRadioButton();
        asas = new javax.swing.JLabel();
        alamat = new javax.swing.JTextField();
        Input = new javax.swing.JButton();
        Hapus = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Biodata");

        jLabel2.setText("Nama");

        jLabel3.setText("Absen");

        jLabel4.setText("Kelas");

        jLabel5.setText("Jurusan");

        kelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kelas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kelasActionPerformed(evt);
            }
        });

        jurusan.add(rpl);
        rpl.setText("RPL");

        jurusan.add(tkj);
        tkj.setText("TKJ");

        asas.setText("Alamat");

        Input.setText("Input");
        Input.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                InputActionPerformed(evt);
            }
        });

        Hapus.setText("Hapus");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(asas, javax.swing.GroupLayout.Alignment.LEADING))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(nama)
                                    .addComponent(absen)
                                    .addComponent(kelas, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rpl)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tkj))
                                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(13, 13, 13)
                                .addComponent(Input)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Hapus))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(199, 199, 199)
                        .addComponent(jLabel1)))
                .addContainerGap(156, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(nama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(absen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(kelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rpl)
                        .addComponent(tkj)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asas)
                    .addComponent(alamat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Input)
                    .addComponent(Hapus))
                .addContainerGap(101, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void kelasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kelasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_kelasActionPerformed

    private void InputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_InputActionPerformed
        String Nama = nama.getText();
        String Absen = absen.getText();
        String jurusan ;
        String Kelas = kelas.getSelectedItem().toString();
        String Alamat = alamat.getText();
        
        if(rpl.isSelected())
            jurusan = "RPL";
        else if(tkj.isSelected())
            jurusan = "TKJ";
        else
            jurusan = "-";
        
        if(kelas.getSelectedItem()=="XI RPL 1"){}
        if(kelas.getSelectedItem()=="XI RPL 2"){}
        if(kelas.getSelectedItem()=="XI RPL 3"){}
        if(kelas.getSelectedItem()=="XI RPL 4"){}
        if(kelas.getSelectedItem()=="XI RPL 5"){}
        if(kelas.getSelectedItem()=="XI RPL 6");
        
        if(kelas.getSelectedItem()== "XI RPL 1"){}
            if(kelas.getSelectedItem()== "XI RPL 2"){}
                if(kelas.getSelectedItem()== "XI RPL 3"){}
                    if(kelas.getSelectedItem()== "XI RPL 4"){}
                        if(kelas.getSelectedItem()== "XI RPL 5"){}
                            if(kelas.getSelectedItem()== "XI RPL 6"){}
                            
        
                            
    new JFrame2().setVisible(true);
        
    }//GEN-LAST:event_InputActionPerformed

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
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Hapus;
    private javax.swing.JButton Input;
    private javax.swing.JTextField absen;
    private javax.swing.JTextField alamat;
    private javax.swing.JLabel asas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.ButtonGroup jurusan;
    private javax.swing.JComboBox<String> kelas;
    private javax.swing.JTextField nama;
    private javax.swing.JRadioButton rpl;
    private javax.swing.JRadioButton tkj;
    // End of variables declaration//GEN-END:variables
}
