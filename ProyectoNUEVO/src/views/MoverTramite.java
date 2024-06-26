/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import javax.swing.JOptionPane;
import logica.LogicaTramite.Administrador;
import java.awt.Color;
import java.awt.Font;
import static java.time.LocalDateTime.now;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.*;
import logica.LogicaTramite.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import static logica.LogicaTramite.Administrador.BuscarDepe;
/**
 *
 * @author Maritza
 */
public class MoverTramite extends javax.swing.JFrame {
    
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    /**
     * Creates new form MoverTramite
     */
    public MoverTramite() {
        initComponents();
        llenarBoxDependenciasOrigen();
        llenarBoxDependenciasFin();
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
        jLabel3 = new javax.swing.JLabel();
        DepeOrigen = new javax.swing.JComboBox<>();
        DepeFin = new javax.swing.JComboBox<>();
        RealizarCambio = new javax.swing.JToggleButton();
        Cancelar = new javax.swing.JToggleButton();
        jLabel4 = new javax.swing.JLabel();
        prio = new javax.swing.JRadioButton();
        antiguo = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Mover Tramite");

        jLabel2.setText("Desde:");

        jLabel3.setText("Hasta:");

        DepeOrigen.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepeOrigenActionPerformed(evt);
            }
        });

        DepeFin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepeFinActionPerformed(evt);
            }
        });

        RealizarCambio.setText("Mover Trámite");
        RealizarCambio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RealizarCambioActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("¿Desea mover por prioridad o antigüedad?");

        buttonGroup1.add(prio);
        prio.setText("Prioridad");
        prio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioActionPerformed(evt);
            }
        });

        buttonGroup1.add(antiguo);
        antiguo.setText("Antigüedad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(0, 121, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DepeOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(DepeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(76, 76, 76))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(RealizarCambio)
                        .addGap(54, 54, 54)
                        .addComponent(Cancelar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(prio)
                        .addGap(18, 18, 18)
                        .addComponent(antiguo)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(DepeOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(DepeFin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prio)
                    .addComponent(antiguo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RealizarCambio)
                    .addComponent(Cancelar))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void llenarBoxDependenciasOrigen() {
        DepeOrigen.removeAllItems();
        DepeOrigen.addItem("Seleccionar Dependencia");

        Lista<Dependencia> nomDepe = GT.getDepes();

        if (nomDepe != null) {
            Nodo<Dependencia> ptr = nomDepe.getCabeza();
            while (ptr != null) {
                DepeOrigen.addItem(ptr.getElemento().getNombre());
                ptr = ptr.getSgteNodo(); // Añadir esta línea para avanzar al siguiente nodo
            }
        }
    }
    public void llenarBoxDependenciasFin() {
        DepeFin.removeAllItems();
        DepeFin.addItem("Seleccionar Dependencia");

        Lista<Dependencia> nomDepe = GT.getDepes();

        if (nomDepe != null) {
            Nodo<Dependencia> ptr = nomDepe.getCabeza();
            while (ptr != null) {
                DepeFin.addItem(ptr.getElemento().getNombre());
                ptr = ptr.getSgteNodo(); // Añadir esta línea para avanzar al siguiente nodo
            }
        }
    }
    private void DepeOrigenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepeOrigenActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepeOrigenActionPerformed

    private void RealizarCambioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RealizarCambioActionPerformed
        //Buscamos las dependencias
        String nombreDepOrigen = DepeOrigen.getSelectedItem().toString();
        Dependencia Origen = BuscarDepe(GT, nombreDepOrigen);
        String nombreDepFinal = DepeOrigen.getSelectedItem().toString();
        Dependencia Final = BuscarDepe(GT, nombreDepFinal);
        
        if(Origen == null || Final == null) {
            throw new RuntimeException("No existen las dependencias");
        } else if (Origen.getNombre() == Final.getNombre()) {
            throw new RuntimeException("No se puede encolar y desencolar entre dependencias");
        } else {
            boolean compro = false;
            if (prio.isSelected()) {
                compro = true;
            }
            admin.registrarMovimiento(compro, Origen, Final);
        }
        JOptionPane.showMessageDialog(this, "Tramite movido satisfactoriamente");
        PestañaAdmin po = new PestañaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_RealizarCambioActionPerformed

    private void DepeFinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepeFinActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DepeFinActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        PestañaAdmin po = new PestañaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_CancelarActionPerformed

    private void prioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioActionPerformed

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
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MoverTramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MoverTramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton Cancelar;
    private javax.swing.JComboBox<String> DepeFin;
    private javax.swing.JComboBox<String> DepeOrigen;
    private javax.swing.JToggleButton RealizarCambio;
    private javax.swing.JRadioButton antiguo;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JRadioButton prio;
    // End of variables declaration//GEN-END:variables
}
