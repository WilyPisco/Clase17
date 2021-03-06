/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.pisco;

import javax.swing.AbstractListModel;
import javax.swing.ListModel;

/**
 *
 * @author alumno
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
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

        btnMovistar = new javax.swing.JToggleButton();
        btnClaro = new javax.swing.JToggleButton();
        pblEquiposMoviles = new javax.swing.JScrollPane();
        lstEquiposMoviles = new javax.swing.JList();
        lblTitulo = new javax.swing.JLabel();
        lblCaracteristicas = new javax.swing.JLabel();
        lblPantalla = new javax.swing.JLabel();
        lblCamara = new javax.swing.JLabel();
        lblProcesador = new javax.swing.JLabel();
        lblTPantalla = new javax.swing.JLabel();
        lblTCamara = new javax.swing.JLabel();
        lblTProcesador = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnMovistar.setText("MOVISTAR");
        btnMovistar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMovistarActionPerformed(evt);
            }
        });

        btnClaro.setText("CLARO");
        btnClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClaroActionPerformed(evt);
            }
        });

        lstEquiposMoviles.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstEquiposMovilesValueChanged(evt);
            }
        });
        pblEquiposMoviles.setViewportView(lstEquiposMoviles);

        lblTitulo.setText("EQUIPOS MOVILES DISPONIBLES");

        lblCaracteristicas.setText("CARACTERISTICAS");

        lblPantalla.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblPantalla.setText("lblPantalla");

        lblCamara.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblCamara.setText("lblCamara");

        lblProcesador.setFont(new java.awt.Font("Arial Black", 1, 14)); // NOI18N
        lblProcesador.setText("lblProcesador");

        lblTPantalla.setText("Pantalla");

        lblTCamara.setText("Camara");

        lblTProcesador.setText("Procesador");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(btnMovistar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblTitulo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(lblCaracteristicas)
                                .addGap(128, 128, 128))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(pblEquiposMoviles, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(12, 12, 12)
                                        .addComponent(btnClaro))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblPantalla)
                                            .addComponent(lblTPantalla))
                                        .addGap(70, 70, 70)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(lblTCamara)
                                            .addComponent(lblCamara))))
                                .addGap(54, 54, 54)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblProcesador)
                                    .addComponent(lblTProcesador))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnClaro, btnMovistar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnMovistar)
                    .addComponent(btnClaro))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTitulo)
                    .addComponent(lblCaracteristicas))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblProcesador)
                            .addComponent(lblPantalla)
                            .addComponent(lblCamara))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblTPantalla)
                            .addComponent(lblTCamara)
                            .addComponent(lblTProcesador)))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pblEquiposMoviles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(57, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMovistarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMovistarActionPerformed
      btnClaro.setSelected(false);
      
      ListModel<String> modeloMovistar= new AbstractListModel<String>(){
          String [] moviles={"SAMSUNG S7-M","iPHONE 8-M","LG K8-M"};
          @Override
          public int getSize() { return moviles.length;}

          @Override
          public String getElementAt(int index) {return moviles[index];}
          
      }; 
      lstEquiposMoviles.setModel(modeloMovistar);
    }//GEN-LAST:event_btnMovistarActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       
      lblPantalla.setText("--''");
      lblCamara.setText("--");
      lblProcesador.setText("--");
    }//GEN-LAST:event_formWindowOpened

    private void btnClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClaroActionPerformed
     btnMovistar.setSelected(false);
     
     ListModel<String> modeloClaro= new AbstractListModel<String>(){
          String [] moviles={"SAMSUNG S7","iPHONE 8","LG K8"};
          @Override
          public int getSize() { return moviles.length;}

          @Override
          public String getElementAt(int index) {return moviles[index];}
          
      }; 
      lstEquiposMoviles.setModel(modeloClaro);
    }//GEN-LAST:event_btnClaroActionPerformed

    private void lstEquiposMovilesValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstEquiposMovilesValueChanged
        if(!evt.getValueIsAdjusting()){
        if (btnClaro.isSelected()) {
            switch(evt.getFirstIndex()){
                case 0:
                    System.out.println("CLARO 1");
                    lblPantalla.setText("4.3''");
                    lblCamara.setText("8MP");
                    lblProcesador.setText("2.5GB");
                    break;
                case 1:
                    System.out.println("CLARO 2");
                    lblPantalla.setText("5.3''");
                    lblCamara.setText("13MP");
                    lblProcesador.setText("2.5GB");
                    break;
                case 2:
                    System.out.println("CLARO 2");
                    lblPantalla.setText("7.0''");
                    lblCamara.setText("15MP");
                    lblProcesador.setText("5GB");
            }
        }
        else if(btnMovistar.isSelected()) {
            switch(evt.getFirstIndex()){                
                case 0:
                    System.out.println("MOVISTAR 1");
                    lblPantalla.setText("5''");
                    lblCamara.setText("6MP");
                    lblProcesador.setText("3GB");
                    break;
                    case 1:
                    System.out.println("MOVISTAR 2");
                    lblPantalla.setText("4.8''");
                    lblCamara.setText("10MP");
                    lblProcesador.setText("5GB");
                    break;
                case 2:
                    System.out.println("MOVISTAR 3");
                    lblPantalla.setText("8.5''");
                    lblCamara.setText("8MP");
                    lblProcesador.setText("3.2GB");                   
            }
        }
        }
    }//GEN-LAST:event_lstEquiposMovilesValueChanged

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton btnClaro;
    private javax.swing.JToggleButton btnMovistar;
    private javax.swing.JLabel lblCamara;
    private javax.swing.JLabel lblCaracteristicas;
    private javax.swing.JLabel lblPantalla;
    private javax.swing.JLabel lblProcesador;
    private javax.swing.JLabel lblTCamara;
    private javax.swing.JLabel lblTPantalla;
    private javax.swing.JLabel lblTProcesador;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JList lstEquiposMoviles;
    private javax.swing.JScrollPane pblEquiposMoviles;
    // End of variables declaration//GEN-END:variables
}
