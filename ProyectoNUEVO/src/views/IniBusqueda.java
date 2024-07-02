/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.*;
import logica.LogicaTramite.*;
import views.PestañaAdmin;


public class IniBusqueda extends javax.swing.JFrame {

    private static final String INFOUID_PLACEHOLDER = "ingresar UID";
    private Administrador admin = Administrador.getInstance();
    private Gestion_Tramite GT = Gestion_Tramite.getInstance();
    
    
    public IniBusqueda() 
    {
        initComponents();
        AddPlaceHolder(infoUID, INFOUID_PLACEHOLDER);
    }

    public void AddPlaceHolder(JTextField textField, String placeholder)
        {
            Font font = textField.getFont();
            font = font.deriveFont(Font.ITALIC);
            textField.setFont(font);
            textField.setForeground(Color.gray);
            textField.setText(placeholder);
            
        }
    
      public void RemovePlaceHolder(JTextField textField)
        {
            Font font = textField.getFont();
            font = font.deriveFont(Font.PLAIN|Font.BOLD);
            textField.setFont(font);
            textField.setForeground(Color.black);  
            
        }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        infoUID = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        bus = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setText("UID:");

        infoUID.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                infoUIDFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                infoUIDFocusLost(evt);
            }
        });
        infoUID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoUIDActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Busqueda por UID");

        bus.setText("Buscar");
        bus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                busActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39)
                        .addComponent(bus, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(jLabel9)
                        .addGap(26, 26, 26)
                        .addComponent(infoUID, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(39, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoUID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bus)
                    .addComponent(cancelar))
                .addContainerGap(44, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void busActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_busActionPerformed
        String buscarTra = infoUID.getText();
        
        
        if(!buscarTra.equals(INFOUID_PLACEHOLDER) && !buscarTra.isEmpty())
        {
           Tramite tramiteEncontrado = admin.BuscarporUID(GT, buscarTra);
           
            
           if(tramiteEncontrado != null)
           {
                System.out.println("Entre aqui");
                JOptionPane.showMessageDialog(null, "Se encontró la UID solicitada");
                VisualizarTramite visiTra = new VisualizarTramite();
                visiTra.setVisible(true);
                this.dispose();
           }
           else
           {
               System.out.println("Pase por aqui");
                JOptionPane.showMessageDialog(null, "No se encontró el UID solicitado");
           }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Por favor ingrese un UID válido");
        }
    }//GEN-LAST:event_busActionPerformed

    private void infoUIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoUIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_infoUIDActionPerformed

    private void infoUIDFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoUIDFocusGained
     if(infoUID.getText().equals(INFOUID_PLACEHOLDER))
     {
         infoUID.setText("");
         RemovePlaceHolder(infoUID);
     }
    }//GEN-LAST:event_infoUIDFocusGained

    private void infoUIDFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_infoUIDFocusLost
    if(infoUID.getText().isEmpty())
        {
            AddPlaceHolder(infoUID, INFOUID_PLACEHOLDER);
        }
    }//GEN-LAST:event_infoUIDFocusLost

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        JOptionPane.showMessageDialog(null, "Operación cancelada");
        PestañaAdmin po = new PestañaAdmin();
        po.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_cancelarActionPerformed

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
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IniBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IniBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bus;
    private javax.swing.JButton cancelar;
    private javax.swing.JTextField infoUID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
