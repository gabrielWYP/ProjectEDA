/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package views;

import java.awt.Color;
import java.awt.Font;
import static java.time.LocalDateTime.now;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import logica.*;
import logica.LogicaTramite.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


/**
 *
 * @author Maritza
 */
public class Ingresar_Tramite extends javax.swing.JFrame {

    private static final String PRIO_PLACEHOLDER = "ingresar prioridad";;
    private static final String ASUN_PLACEHOLDER = "ingresar asunto";
    private static final String DOC_PLACEHOLDER = "ingresar documento";
    private Administrador admin = new Administrador("pepe", "1232");
    private Gestion_Tramite GT = new Gestion_Tramite();
    
    //Instancia de la clase Fecha
    private Fecha fechaTramiteIni = new Fecha();
    
    //Creación de Usuarios de la clase(Uusario)
    Usuario usu1 = new Usuario("71959397", "Pep Guardiola", "934999712", "pepitoalcachofa@gmail.com");
    Usuario usu2 = new Usuario("83Usuario usu1 = new Usuario(\"71959397\", \"941832", "Ricardo Moran", "999 975 222", "pepitoalcachofa@gmail.com");
    Usuario usu3 = new Usuario("71959397", "Pepito lagapija", "934999712", "pepitoalcachofa@gmail.com");
    
    //Creación de Documento de la clase(Documento)
    
    Documento doc1 = new Documento("Registro DNI", "registro del DNI en la base de datos");
    Documento doc2 = new Documento("Registro notas", "subir las notas del usuarios a la base de datos");
    Documento doc3 = new Documento("Declaración Jurada", "documento firmado por una notaria asumiendo la responsabilidad del usuario");
    
    public Ingresar_Tramite() {
        initComponents();
        AddPlaceHolder(prioridad, PRIO_PLACEHOLDER);
        AddPlaceHolder(asunto, ASUN_PLACEHOLDER);
        llenarBoxUsuarios();
        llenarBoxDependencias();
        llenarBoxDocumentos();
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
      
      public void llenarBoxUsuarios()
      {
          usuario.removeAllItems();
          usuario.addItem("Seleccionar usuario");
          usuario.addItem(usu1.getNombre());
          usuario.addItem(usu2.getNombre());
          usuario.addItem(usu3.getNombre());
          
      }
      
      public void llenarBoxDocumentos()
      {
          docu.removeAllItems();
          docu.addItem("Seleccionar Documento");
          docu.addItem(doc1.getTipo());
          docu.addItem(doc2.getTipo());
          docu.addItem(doc3.getTipo());
          
      }
      
      public void llenarBoxDependencias()
      {
          depe.removeAllItems();
          depe.addItem("Seleccionar Dependencia");
          
          Lista<Dependencia> nomDepe = GT.getDepes();
          
          if(nomDepe != null)
          {
            Nodo<Dependencia> ptr = nomDepe.getCabeza();
            while(ptr != null)
            {
                depe.addItem(ptr.getElemento().getNombre());
            }
          }
      }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        prioridad = new javax.swing.JTextField();
        asunto = new javax.swing.JTextField();
        Rellenar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        vaciarcampos = new javax.swing.JButton();
        usuario = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        depe = new javax.swing.JComboBox<>();
        docu = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel1.setText("Ingresar Tramite");

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel2.setText("Prioridad:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel3.setText("Usuario:");

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Asunto:");
        jLabel7.setToolTipText("");

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Documento:");
        jLabel8.setToolTipText("");

        prioridad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                prioridadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                prioridadFocusLost(evt);
            }
        });
        prioridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                prioridadActionPerformed(evt);
            }
        });

        asunto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                asuntoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                asuntoFocusLost(evt);
            }
        });

        Rellenar.setText("Rellenar");
        Rellenar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RellenarActionPerformed(evt);
            }
        });

        cancelar.setText("Cancelar");
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        vaciarcampos.setText("Vaciar campos");
        vaciarcampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vaciarcamposActionPerformed(evt);
            }
        });

        usuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 1, 14)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Dependencia:");
        jLabel9.setToolTipText("");

        depe.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        docu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(vaciarcampos)
                        .addGap(18, 18, 18)
                        .addComponent(cancelar)
                        .addGap(18, 18, 18)
                        .addComponent(Rellenar))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGap(35, 35, 35)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(prioridad, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(usuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(asunto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                                    .addComponent(depe, javax.swing.GroupLayout.Alignment.LEADING, 0, 174, Short.MAX_VALUE)
                                    .addComponent(docu, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                .addGap(72, 72, 72))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(prioridad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(asunto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(docu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(depe, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Rellenar)
                    .addComponent(vaciarcampos)
                    .addComponent(cancelar))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void vaciarcamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vaciarcamposActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_vaciarcamposActionPerformed

    private void RellenarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RellenarActionPerformed
       String Prioridad = prioridad.getText();
       int PrioInt = 0;
       
       if (Prioridad.matches("\\d+"))
       {
           PrioInt = Integer.parseInt(Prioridad);
       }
       
       
       String Asunto = asunto.getText();
        
       String nombreUsu = usuario.getSelectedItem().toString();
       Usuario usuarioSeleccionado = null;
            
            if(nombreUsu.equals(usu1.getNombre()))
            {
                usuarioSeleccionado = usu1;
            }
            else if(nombreUsu.equals(usu2.getNombre()))
            {
                usuarioSeleccionado = usu2;
            }
            else if(nombreUsu.equals(usu3.getNombre()))
            {
                usuarioSeleccionado = usu3;
            }
            
       String TipoDoc = docu.getSelectedItem().toString();
       Documento documentoSeleccionado = null;
       
       if(TipoDoc.equals(doc1.getTipo()))
       {
           documentoSeleccionado = doc1;
       }
       else if(TipoDoc.equals(doc2.getTipo()))
       {
           documentoSeleccionado = doc2;
       }
       else if(TipoDoc.equals(doc3.getTipo()))
       {
           documentoSeleccionado = doc3;
       }
            
            
            //Capturar dependencia del ComboBox multiple
            
            String nombreDep = depe.getSelectedItem().toString();
            Dependencia dependenciaSeleccionada = null;
            
            
            
            Lista<Dependencia> listasDependencias = GT.getDepes();
            if(dependenciaSeleccionada != null)
                {
                Nodo<Dependencia> nodoDependencia = listasDependencias.getCabeza();
                while(nodoDependencia != null)
                {
                    if(nodoDependencia.getElemento().getNombre().equals(nombreDep))
                    {
                        dependenciaSeleccionada = nodoDependencia.getElemento();
                        break;
                    }
                    nodoDependencia = nodoDependencia.getSgteNodo();
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No hay dependencia registrada");
            }
       
       if(!Prioridad.equals(PRIO_PLACEHOLDER) && !Prioridad.isEmpty() &&
               !Asunto.equals(ASUN_PLACEHOLDER) && !Asunto.isEmpty() &&
               dependenciaSeleccionada != null && usuarioSeleccionado != null 
               && documentoSeleccionado != null)
       {         
           //Funcion tomada de Gestion_Tramite
            admin.registrarIngreso(usuarioSeleccionado, Asunto, PrioInt, documentoSeleccionado, dependenciaSeleccionada);
           
            JOptionPane.showMessageDialog(null, "Se registro todo correctamente");
            
            //fecha formateada con la instancia de fecha
            String fechaFTra = fechaTramiteIni.FechaFormateada("dd/MM/yyyy HH:mm:ss");
            JOptionPane.showMessageDialog(null, "Fecha del dia: " + fechaFTra);
            
            //Termino de crear tramite
            PestañaAdmin po = new PestañaAdmin();
            po.setVisible(true);
            this.dispose();
       }
       else
       {
           JOptionPane.showMessageDialog(null, "Falta rellenar un apartado");
       }
           

       
    }//GEN-LAST:event_RellenarActionPerformed

    private void prioridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_prioridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_prioridadActionPerformed

    private void prioridadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prioridadFocusGained
        if(prioridad.getText().equals(PRIO_PLACEHOLDER))
     {
         prioridad.setText("");
         RemovePlaceHolder(prioridad);
     }
    }//GEN-LAST:event_prioridadFocusGained

    private void asuntoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asuntoFocusGained
      if(asunto.getText().equals(ASUN_PLACEHOLDER));
     {
         asunto.setText("");
         RemovePlaceHolder(asunto);
     }
    }//GEN-LAST:event_asuntoFocusGained

    private void prioridadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_prioridadFocusLost
        if(prioridad.getText().isEmpty())
        {
            AddPlaceHolder(prioridad, PRIO_PLACEHOLDER);
        }
    }//GEN-LAST:event_prioridadFocusLost

    private void asuntoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_asuntoFocusLost
        if(asunto.getText().isEmpty())
        {
            AddPlaceHolder(asunto, ASUN_PLACEHOLDER);
        }
    }//GEN-LAST:event_asuntoFocusLost

    private void usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioActionPerformed
        
    }//GEN-LAST:event_usuarioActionPerformed

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
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingresar_Tramite.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingresar_Tramite().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Rellenar;
    private javax.swing.JTextField asunto;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox<String> depe;
    private javax.swing.JComboBox<String> docu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField prioridad;
    private javax.swing.JComboBox<String> usuario;
    private javax.swing.JButton vaciarcampos;
    // End of variables declaration//GEN-END:variables
}
