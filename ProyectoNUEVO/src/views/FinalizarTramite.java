/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import logica.Cola;
import logica.Gestion_Tramite;
import logica.Lista;
import logica.LogicaTramite.*;
import logica.LogicaTramite.Dependencia;
import logica.Nodo;

/**
 *
 * @author gaway
 */
public class FinalizarTramite extends javax.swing.JFrame {
    
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
  

    /**
     * Creates new form FinalizarTramite
     */
    public FinalizarTramite() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        prioridad = new javax.swing.JRadioButton();
        antiguedad = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        Rellenar = new javax.swing.JButton();
        Rellenar1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("FINALIZAR TRAMITE");

        jLabel2.setText("Ingrese dependencia:");

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        buttonGroup1.add(prioridad);
        prioridad.setText("Prioridad");
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });

        buttonGroup1.add(antiguedad);
        antiguedad.setText("Antigüedad");
        antiguedad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                antiguedadActionPerformed(evt);
            }
        });

        jLabel3.setText("¿Desea finalizar por prioridad o antigüedad?");

        Rellenar.setText("Finalizar");
        Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarActionPerformed(evt);
            }
        });

        Rellenar1.setText("Cancelar");
        Rellenar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Rellenar1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(prioridad)
                                .addGap(81, 81, 81)
                                .addComponent(antiguedad)))
                        .addContainerGap(54, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rellenar1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Rellenar)
                        .addGap(101, 101, 101))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(126, 126, 126))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioridad)
                    .addComponent(antiguedad))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar)
                    .addComponent(Rellenar1))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadActionPerformed

    private void antiguedadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_antiguedadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_antiguedadActionPerformed

    private void RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarActionPerformed
       String depeselected = jTextField1.getText();
        Lista<Dependencia> nomDepe = GT.getDepes();
        Dependencia dependenciaEncontrada = null;

        if (nomDepe != null) {
            Nodo<Dependencia> ptr = nomDepe.getCabeza();
            while (ptr != null) {
                if (ptr.getElemento().getNombre().equals(depeselected)){
                    dependenciaEncontrada = ptr.getElemento();
                    break;
                }
                ptr = ptr.getSgteNodo(); // Añadir esta línea para avanzar al siguiente nodo
            }
        }

        if (dependenciaEncontrada != null) {
            Cola<Tramite> colaDeTramites = dependenciaEncontrada.getEncolados(); // Asegúrate de tener un método getTramites() en Dependencia
            boolean prio = false;
            if (prioridad.isSelected()) {
                prio = true;
            }
            admin.registrarFinal(prio, GT, dependenciaEncontrada);
            JOptionPane.showMessageDialog(this, "Tramite finalizado");
        }
        else{
            JOptionPane.showMessageDialog(this, "No se encontro dependencia");

        }
    }//GEN-LAST:event_RellenarActionPerformed

    private void Rellenar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Rellenar1ActionPerformed
        // TODO add your handling code here:
        PestañaAdmin po = new PestañaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Rellenar1ActionPerformed

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
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FinalizarTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FinalizarTramite().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rellenar;
    private javax.swing.JButton Rellenar1;
    private javax.swing.JRadioButton antiguedad;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JRadioButton prioridad;
    // End of variables declaration//GEN-END:variables
}
