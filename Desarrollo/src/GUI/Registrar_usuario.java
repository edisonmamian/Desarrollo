/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import logica.*;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Registrar_usuario extends javax.swing.JFrame {

    /**
     * Creates new form registrar_usuario
     */
    public Registrar_usuario() {
        //inicia componentes y la ventana se fija en la mitad
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

        jScrollBar1 = new javax.swing.JScrollBar();
        jTextField4 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campo_registro_nombre = new javax.swing.JTextField();
        campo_registro_apellido = new javax.swing.JTextField();
        campo_registro_cedula = new javax.swing.JTextField();
        campo_registro_usuario = new javax.swing.JTextField();
        campo_registro_contrasena = new javax.swing.JPasswordField();
        ComboBox_registro_rol = new javax.swing.JComboBox();
        campo_registro_direccion = new javax.swing.JTextField();
        campo_registro_telefono = new javax.swing.JTextField();
        campo_registro_email = new javax.swing.JTextField();
        boton_registrar_usuarios = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();

        jTextField4.setText("jTextField1");
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel8.setText("* Nombre:");

        jLabel9.setText("* Apellidos:");

        jLabel10.setText("* Cedula de Ciudadanía:");

        jLabel11.setText("* Usuario:");

        jLabel12.setText("* Contraseña:");

        jLabel13.setText("* Rol:");

        jLabel15.setText(" Dirección:");

        jLabel16.setText(" Teléfono:");

        jLabel17.setText(" Email:");

        campo_registro_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_nombreActionPerformed(evt);
            }
        });

        campo_registro_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_apellidoActionPerformed(evt);
            }
        });

        campo_registro_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_cedulaActionPerformed(evt);
            }
        });
        campo_registro_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_cedulaKeyTyped(evt);
            }
        });

        campo_registro_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_usuarioActionPerformed(evt);
            }
        });

        campo_registro_contrasena.setText("jPasswordField1");

        ComboBox_registro_rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Secretaria", "Contador", "Operador de Planta", "Auxiliar de Operación" }));
        ComboBox_registro_rol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBox_registro_rolActionPerformed(evt);
            }
        });

        campo_registro_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_direccionActionPerformed(evt);
            }
        });

        campo_registro_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_telefonoActionPerformed(evt);
            }
        });
        campo_registro_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_registro_telefonoKeyTyped(evt);
            }
        });

        campo_registro_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_registro_emailActionPerformed(evt);
            }
        });

        boton_registrar_usuarios.setText("Registrar");
        boton_registrar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_registrar_usuariosActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 204, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel19.setText("REGISTRAR USUARIO");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setName("Registrar Usuario"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10)
                    .addComponent(jLabel13)
                    .addComponent(jLabel12)
                    .addComponent(jLabel11)
                    .addComponent(jLabel15)
                    .addComponent(jLabel16)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campo_registro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(boton_registrar_usuarios)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_registro_apellido, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addComponent(campo_registro_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_registro_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campo_registro_contrasena)
                            .addComponent(campo_registro_usuario, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                            .addComponent(campo_registro_direccion)
                            .addComponent(campo_registro_email)
                            .addComponent(ComboBox_registro_rol, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(27, 27, 27))
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(56, 56, 56)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(campo_registro_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_registro_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addComponent(jLabel14))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(jLabel15)))
                        .addGap(9, 9, 9)
                        .addComponent(jLabel16)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel17)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(ComboBox_registro_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_registro_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_registro_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campo_registro_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(boton_registrar_usuarios)
                        .addGap(48, 48, 48))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 445, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 467, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_registro_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_nombreActionPerformed

    private void campo_registro_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_apellidoActionPerformed

    private void campo_registro_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_cedulaActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void campo_registro_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_usuarioActionPerformed

    private void campo_registro_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_direccionActionPerformed

    private void campo_registro_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_telefonoActionPerformed

    private void campo_registro_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_registro_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_registro_emailActionPerformed

    private void boton_registrar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_registrar_usuariosActionPerformed
        // TODO add your handling code here:

//Verificar campos vaicos
        if ((campo_registro_nombre.getText().trim().length() != 0) && (campo_registro_apellido.getText().trim().length() != 0) && (campo_registro_cedula.getText().trim().length() != 0) && (String.valueOf(campo_registro_contrasena.getPassword()).trim().length() != 0) && (campo_registro_usuario.getText().trim().length() != 0)) {

            /**
             * Se guarda en las variables cada uno de los campos de la ventana.
             */
            int cedula = Integer.parseInt(campo_registro_cedula.getText());
            String usuario = campo_registro_usuario.getText();
            String contrasena = String.copyValueOf(campo_registro_contrasena.getPassword());
            String nombre = campo_registro_nombre.getText();
            String apellido = campo_registro_apellido.getText();
            String rol = (String) ComboBox_registro_rol.getSelectedItem();
            String direccion = campo_registro_direccion.getText();
            String telefono = campo_registro_telefono.getText();
            String email = campo_registro_email.getText();

            /**
             * Se realiza la conexion a la base de datos Y se hace el llamado a
             * registrar usuario con los campos llenos el cual devuelve un
             * entero donde si es 1, es porque el usuario se registro
             * correctamente de lo contrario el usuario ya existia y se le
             * informa al usuario
             */
            Usuarios obj_conectarbd = new Usuarios();

            int n = obj_conectarbd.registrar_usuario(cedula, usuario, contrasena, nombre, apellido, rol, direccion, telefono, email);

            if (n == 1) {
                this.dispose();
            } else {

                campo_registro_cedula.setText("");
                campo_registro_usuario.setText("");
                campo_registro_contrasena.setText("");
                campo_registro_nombre.setText("");
                campo_registro_apellido.setText("");
                campo_registro_direccion.setText("");
                campo_registro_telefono.setText("");
                campo_registro_email.setText("");

            }
        } else {
            JOptionPane.showMessageDialog(this, "Hay campos vacios, por favor completelos");
        }


    }//GEN-LAST:event_boton_registrar_usuariosActionPerformed

    private void campo_registro_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_cedulaKeyTyped
        // TODO add your handling code here:

        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_cedulaKeyTyped

    private void campo_registro_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_registro_telefonoKeyTyped
        // TODO add your handling code here:
        
         if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_registro_telefonoKeyTyped

    private void ComboBox_registro_rolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBox_registro_rolActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBox_registro_rolActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_registro_rol;
    private javax.swing.JToggleButton boton_registrar_usuarios;
    private javax.swing.JTextField campo_registro_apellido;
    private javax.swing.JTextField campo_registro_cedula;
    private javax.swing.JPasswordField campo_registro_contrasena;
    private javax.swing.JTextField campo_registro_direccion;
    private javax.swing.JTextField campo_registro_email;
    private javax.swing.JTextField campo_registro_nombre;
    private javax.swing.JTextField campo_registro_telefono;
    private javax.swing.JTextField campo_registro_usuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
