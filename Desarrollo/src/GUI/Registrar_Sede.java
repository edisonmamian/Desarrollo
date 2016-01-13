/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import logica.Sedes;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author edison
 */
public class Registrar_Sede extends javax.swing.JFrame {
    String nombre;
    String ciudad;
    String direccion;
    String telefono;
    /**
     * Creates new form Registrar_Sede
     */
    public Registrar_Sede() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setResizable(false);
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
        jLabel1 = new javax.swing.JLabel();
        campo_registrar_ciudad = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        campo_registrar_direccion = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        campo_registrar_telefono = new javax.swing.JTextField();
        campo_registrar_nombre = new javax.swing.JTextField();
        boton_registrar = new javax.swing.JButton();
        boton_cancelar_registro = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA FLASH");
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(51, 153, 255), null));

        jLabel1.setText("Nombre:");

        campo_registrar_ciudad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registrar_ciudadActionPerformed(evt);
            }
        });

        jLabel2.setText("Ciudad:");

        jLabel3.setText("Dirección:");

        jLabel4.setText("Telefono:");

        campo_registrar_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registrar_telefonoActionPerformed(evt);
            }
        });
        campo_registrar_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registrar_telefonoKeyTyped(evt);
            }
        });

        campo_registrar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registrar_nombreActionPerformed(evt);
            }
        });

        boton_registrar.setText("Registrar");
        boton_registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrarActionPerformed(evt);
            }
        });

        boton_cancelar_registro.setText("Cancelar");
        boton_cancelar_registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_cancelar_registroActionPerformed(evt);
            }
        });

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 204, 255));
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel8.setText("REGISTRAR SEDE");
        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel8.setName("Registrar Usuario"); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel1)))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campo_registrar_direccion, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campo_registrar_nombre)
                                .addComponent(campo_registrar_ciudad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campo_registrar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(boton_registrar, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(61, 61, 61)
                        .addComponent(boton_cancelar_registro, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_registrar_nombre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campo_registrar_ciudad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel3))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campo_registrar_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(campo_registrar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(boton_registrar)
                    .addComponent(boton_cancelar_registro))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_registrar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registrar_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registrar_nombreActionPerformed

    private void campo_registrar_ciudadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registrar_ciudadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registrar_ciudadActionPerformed
    /*
    cuando el usuario desea cancelar el registro, se vasian los campos
    */
    private void boton_cancelar_registroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_cancelar_registroActionPerformed
        // TODO add your handling code here:
        campo_registrar_nombre.setText("");
        campo_registrar_ciudad.setText("");
        campo_registrar_direccion.setText("");
        campo_registrar_telefono.setText("");        
    }//GEN-LAST:event_boton_cancelar_registroActionPerformed
    /*
    se encarga de llamar la funcion que realiza el registro en la base de datos
    */
    private void boton_registrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrarActionPerformed
        // TODO add your handling code here:
        
        Sedes reg = new Sedes();
        boolean verificar = false;
        
        /*
        se obtienen los datos que se van a registrar
        */
        nombre = campo_registrar_nombre.getText();
        ciudad = campo_registrar_ciudad.getText();
        direccion = campo_registrar_direccion.getText();
        telefono = campo_registrar_telefono.getText();
        /*
        se valida que los campos no esten vacios
        */
        verificar |= nombre.isEmpty();
        verificar |= ciudad.isEmpty();
        verificar |= direccion.isEmpty();
        verificar |= telefono.isEmpty();
        
        if(verificar){
            JOptionPane.showMessageDialog(rootPane, "Debes llenar todos los campos");
        }else{  
            //se llama a la funcion registrar en la base de datos con la informacion que se desea almacenar
            reg.registrar(nombre, ciudad, telefono, direccion);
        }
        //se reinician los campos de texto
        campo_registrar_nombre.setText("");
        campo_registrar_ciudad.setText("");
        campo_registrar_direccion.setText("");
        campo_registrar_telefono.setText("");
        
    }//GEN-LAST:event_boton_registrarActionPerformed

    private void campo_registrar_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registrar_telefonoKeyTyped
        // TODO add your handling code here:
        
         if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registrar_telefonoKeyTyped

    private void campo_registrar_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registrar_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registrar_telefonoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_cancelar_registro;
    private javax.swing.JButton boton_registrar;
    private javax.swing.JTextField campo_registrar_ciudad;
    private javax.swing.JTextField campo_registrar_direccion;
    private javax.swing.JTextField campo_registrar_nombre;
    private javax.swing.JTextField campo_registrar_telefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
