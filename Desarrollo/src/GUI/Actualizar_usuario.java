/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import logica.Usuarios;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Actualizar_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Actualizar_usuario
     */
     ArrayList<String> datos = new ArrayList<>();
    
    public Actualizar_usuario() {
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
        campo_actualizar_nombre = new javax.swing.JTextField();
        campo_actualizar_apellido = new javax.swing.JTextField();
        campo_actualizar_cedula = new javax.swing.JTextField();
        campo_actualizar_usuario = new javax.swing.JTextField();
        campo_actualizar_contrasena = new javax.swing.JPasswordField();
        campo_actualizar_direccion = new javax.swing.JTextField();
        campo_actualizar_telefono = new javax.swing.JTextField();
        campo_actualizar_email = new javax.swing.JTextField();
        jToggleButton1 = new javax.swing.JToggleButton();
        campobuscar_cedula = new javax.swing.JTextField();
        Jtext_cedula = new javax.swing.JLabel();
        boton_modificar_usuarios = new javax.swing.JToggleButton();
        campo_rol_actualizar_user = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();

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

        campo_actualizar_nombre.setEditable(false);
        campo_actualizar_nombre.setBackground(new java.awt.Color(255, 255, 255));
        campo_actualizar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_nombreActionPerformed(evt);
            }
        });

        campo_actualizar_apellido.setEditable(false);
        campo_actualizar_apellido.setBackground(new java.awt.Color(255, 255, 255));
        campo_actualizar_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_apellidoActionPerformed(evt);
            }
        });

        campo_actualizar_cedula.setEditable(false);
        campo_actualizar_cedula.setBackground(new java.awt.Color(204, 204, 204));
        campo_actualizar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_cedulaActionPerformed(evt);
            }
        });

        campo_actualizar_usuario.setEditable(false);
        campo_actualizar_usuario.setBackground(new java.awt.Color(204, 204, 204));
        campo_actualizar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_usuarioActionPerformed(evt);
            }
        });

        campo_actualizar_contrasena.setText("jPasswordField1");

        campo_actualizar_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_direccionActionPerformed(evt);
            }
        });

        campo_actualizar_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_telefonoActionPerformed(evt);
            }
        });
        campo_actualizar_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_actualizar_telefonoKeyTyped(evt);
            }
        });

        campo_actualizar_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_actualizar_emailActionPerformed(evt);
            }
        });

        jToggleButton1.setText("Buscar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        campobuscar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campobuscar_cedulaActionPerformed(evt);
            }
        });
        campobuscar_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campobuscar_cedulaKeyTyped(evt);
            }
        });

        Jtext_cedula.setText("Cedula de Ciudadanía:");

        boton_modificar_usuarios.setText("Modificar");
        boton_modificar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_usuariosActionPerformed(evt);
            }
        });

        campo_rol_actualizar_user.setEditable(false);
        campo_rol_actualizar_user.setBackground(new java.awt.Color(204, 204, 204));

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(102, 204, 255));
        jLabel18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel18.setText("ACTUALIZAR USUARIO");
        jLabel18.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel18.setName("Registrar Usuario"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_modificar_usuarios))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10)
                            .addComponent(jLabel13)
                            .addComponent(jLabel12)
                            .addComponent(jLabel11)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16)
                            .addComponent(jLabel17)
                            .addComponent(Jtext_cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_actualizar_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jToggleButton1)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_actualizar_apellido)
                                    .addComponent(campo_actualizar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_actualizar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_actualizar_contrasena)
                                    .addComponent(campo_actualizar_usuario)
                                    .addComponent(campo_actualizar_direccion)
                                    .addComponent(campo_actualizar_email, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE))
                                .addComponent(campo_rol_actualizar_user, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(campobuscar_cedula))))
                .addGap(29, 29, 29))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel14)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campobuscar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Jtext_cedula))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jToggleButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_actualizar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_actualizar_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_actualizar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_actualizar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_actualizar_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel13)
                                    .addComponent(campo_rol_actualizar_user, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_actualizar_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_actualizar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_actualizar_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(boton_modificar_usuarios)
                        .addGap(22, 22, 22))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 487, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_actualizar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_nombreActionPerformed

    private void campo_actualizar_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_apellidoActionPerformed

    private void campo_actualizar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_cedulaActionPerformed

    private void campo_actualizar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_usuarioActionPerformed

    private void campo_actualizar_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_direccionActionPerformed

    private void campo_actualizar_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_telefonoActionPerformed

    private void campo_actualizar_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_actualizar_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_actualizar_emailActionPerformed

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        int cedula = Integer.parseInt(campobuscar_cedula.getText());
        
        try{
        Usuarios obj_consultar = new Usuarios();
        datos = obj_consultar.consultar_usuario(cedula);
        int rol = 0;
        //System.out.println("boton"+user+nom+ape+rol_+dir+tel+em);

       
        campobuscar_cedula.setText(" ");
        campo_actualizar_usuario.setText(datos.get(0));
        campo_actualizar_cedula.setText(datos.get(1));
        campo_actualizar_nombre.setText(datos.get(2));
        campo_actualizar_apellido.setText(datos.get(3));
        campo_rol_actualizar_user.setText(datos.get(4));
        campo_actualizar_direccion.setText(datos.get(5));
        campo_actualizar_telefono.setText(datos.get(6));
        campo_actualizar_email.setText(datos.get(7));
        campo_actualizar_contrasena.setText(datos.get(8));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La cedula no existe");
            campobuscar_cedula.setText("");
        }
        
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void campobuscar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campobuscar_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campobuscar_cedulaActionPerformed

    private void boton_modificar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_usuariosActionPerformed
        // TODO add your handling code here:
        
         if ((campo_actualizar_nombre.getText().trim().length() != 0) && (campo_actualizar_apellido.getText().trim().length() != 0) && (campo_actualizar_cedula.getText().trim().length() != 0) && (String.valueOf(campo_actualizar_contrasena.getPassword()).trim().length() != 0) && (campo_actualizar_usuario.getText().trim().length() != 0)) {
        
        
         int cedula = Integer.parseInt(campo_actualizar_cedula.getText());
        String usuario=campo_actualizar_usuario.getText();
        String contrasena=String.valueOf(campo_actualizar_contrasena.getPassword());
        String nombre=campo_actualizar_nombre.getText();
        String apellido=campo_actualizar_apellido.getText();
        String rol_= campo_rol_actualizar_user.getText();
        String direccion= campo_actualizar_direccion.getText();
        String telefono=campo_actualizar_telefono.getText();
        String email=campo_actualizar_email.getText();
        
        Usuarios obj_modificar = new Usuarios();
        obj_modificar.modificar_usuario(cedula, usuario, contrasena, nombre, apellido, rol_, direccion, telefono, email);
        this.dispose();
    }//GEN-LAST:event_boton_modificar_usuariosActionPerformed
    }
    private void campobuscar_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campobuscar_cedulaKeyTyped
        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campobuscar_cedulaKeyTyped

    private void campo_actualizar_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_actualizar_telefonoKeyTyped
        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_actualizar_telefonoKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Jtext_cedula;
    private javax.swing.JToggleButton boton_modificar_usuarios;
    private javax.swing.JTextField campo_actualizar_apellido;
    private javax.swing.JTextField campo_actualizar_cedula;
    private javax.swing.JPasswordField campo_actualizar_contrasena;
    private javax.swing.JTextField campo_actualizar_direccion;
    private javax.swing.JTextField campo_actualizar_email;
    private javax.swing.JTextField campo_actualizar_nombre;
    private javax.swing.JTextField campo_actualizar_telefono;
    private javax.swing.JTextField campo_actualizar_usuario;
    private javax.swing.JTextField campo_rol_actualizar_user;
    private javax.swing.JTextField campobuscar_cedula;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
