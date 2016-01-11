/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import logica.Usuarios;
import java.awt.Toolkit;
import java.util.ArrayList;
import javax.print.event.PrintJobEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Modificar_usuario extends javax.swing.JFrame {

    /**
     * Creates new form Modificar_usuario
     */
    ArrayList<String> datos = new ArrayList<>();

    public Modificar_usuario() {

        //Se inicia componentes y se coloca la ventana en la mitad
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
        campo_modificar_nombre = new javax.swing.JTextField();
        campo_modificar_apellido = new javax.swing.JTextField();
        campo_modificar_cedula = new javax.swing.JTextField();
        campo_modificar_usuario = new javax.swing.JTextField();
        campo_modificar_contrasena = new javax.swing.JPasswordField();
        ComboBox_modificar_rol = new javax.swing.JComboBox();
        campo_modificar_direccion = new javax.swing.JTextField();
        campo_modificar_telefono = new javax.swing.JTextField();
        campo_modificar_email = new javax.swing.JTextField();
        boton_modificar_consultar = new javax.swing.JToggleButton();
        campo_consultarmodificar_cedula = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        boton_modificar_usuarios = new javax.swing.JToggleButton();
        jLabel19 = new javax.swing.JLabel();

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

        campo_modificar_nombre.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_nombreActionPerformed(evt);
            }
        });

        campo_modificar_apellido.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_apellidoActionPerformed(evt);
            }
        });

        campo_modificar_cedula.setEditable(false);
        campo_modificar_cedula.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_cedulaActionPerformed(evt);
            }
        });

        campo_modificar_usuario.setEditable(false);
        campo_modificar_usuario.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_usuarioActionPerformed(evt);
            }
        });

        campo_modificar_contrasena.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_contrasena.setText("jPasswordField1");

        ComboBox_modificar_rol.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Gerente", "Secretaria", "Contador", "Operario de Planta", "Auxiliar de Operación" }));

        campo_modificar_direccion.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_direccionActionPerformed(evt);
            }
        });

        campo_modificar_telefono.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_telefonoActionPerformed(evt);
            }
        });
        campo_modificar_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_modificar_telefonoKeyTyped(evt);
            }
        });

        campo_modificar_email.setBackground(new java.awt.Color(236, 236, 237));
        campo_modificar_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_modificar_emailActionPerformed(evt);
            }
        });

        boton_modificar_consultar.setText("Buscar");
        boton_modificar_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_consultarActionPerformed(evt);
            }
        });

        campo_consultarmodificar_cedula.setBackground(new java.awt.Color(236, 236, 237));
        campo_consultarmodificar_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_consultarmodificar_cedulaActionPerformed(evt);
            }
        });
        campo_consultarmodificar_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                campo_consultarmodificar_cedulaKeyTyped(evt);
            }
        });

        jLabel18.setText("Cedula de Ciudadanía:");

        boton_modificar_usuarios.setText("Modificar");
        boton_modificar_usuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificar_usuariosActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 204, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel19.setText("MODIFICAR USUARIO");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setName("Registrar Usuario"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(boton_modificar_usuarios))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel11)
                                    .addComponent(jLabel16)
                                    .addComponent(jLabel17)
                                    .addComponent(jLabel18)))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addGap(68, 68, 68)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campo_modificar_nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)
                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(boton_modificar_consultar)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campo_modificar_apellido)
                                    .addComponent(campo_modificar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ComboBox_modificar_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_modificar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campo_modificar_contrasena)
                                    .addComponent(campo_modificar_usuario)
                                    .addComponent(campo_modificar_direccion)
                                    .addComponent(campo_modificar_email, javax.swing.GroupLayout.DEFAULT_SIZE, 194, Short.MAX_VALUE)))
                            .addComponent(campo_consultarmodificar_cedula))))
                .addGap(29, 29, 29))
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jLabel14)
                        .addGap(146, 146, 146))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(48, 48, 48)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_consultarmodificar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(boton_modificar_consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(campo_modificar_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_modificar_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_modificar_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_modificar_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campo_modificar_contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel12))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addComponent(jLabel16)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel17)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(ComboBox_modificar_rol, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel13))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campo_modificar_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel15))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_modificar_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(campo_modificar_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_modificar_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_nombreActionPerformed

    private void campo_modificar_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_apellidoActionPerformed

    private void campo_modificar_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_usuarioActionPerformed

    private void campo_modificar_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_direccionActionPerformed

    private void campo_modificar_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_telefonoActionPerformed

    private void campo_modificar_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_emailActionPerformed

    private void boton_modificar_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_consultarActionPerformed
        // TODO add your handling code here:

        //Se guarda el numero de la cedula en la variable.
        int cedula = Integer.parseInt(campo_consultarmodificar_cedula.getText());

        try {
            //Conexión a la base de datos
            Usuarios obj_consultar = new Usuarios();
            /**
             * Se llama al metodo consultar usuario con el numero de cedula a
             * consultar y se devuelve en el ArrayList<String> datos, cada uno
             * de los campos
             */
            datos = obj_consultar.consultar_usuario(cedula);
            int rol = 0;
            //System.out.println("boton"+user+nom+ape+rol_+dir+tel+em);
            /**
             * Para mayor facilidad al ubicar el combobox de rol, se le asigna
             * un numero entero dependiendo del rol
             */
            switch (datos.get(4)) {

                case "Administrador":
                    rol = 0;
                    break;
                case "Gerente":
                    rol = 1;
                    break;
                case "Secretaria":
                    rol = 2;
                    break;
                case "Contador":
                    rol = 3;
                    break;
                case "Operario de Planta":
                    rol = 4;
                    break;
                case "Auxiliar de Operación":
                    rol = 5;
                    break;

            }
            
            //Se llenan los campos de la interfaz con la informacion
            //del arraylist datos

            campo_consultarmodificar_cedula.setText(" ");
            campo_modificar_usuario.setText(datos.get(0));
            campo_modificar_cedula.setText(datos.get(1));
            campo_modificar_nombre.setText(datos.get(2));
            campo_modificar_apellido.setText(datos.get(3));
            ComboBox_modificar_rol.setSelectedIndex(rol);
            campo_modificar_direccion.setText(datos.get(5));
            campo_modificar_telefono.setText(datos.get(6));
            campo_modificar_email.setText(datos.get(7));
            campo_modificar_contrasena.setText(datos.get(8));
        } catch (Exception e) {
            //En caso tal que la cedula no exista se le informa al usuario
            JOptionPane.showMessageDialog(null, "La cedula no existe");
            campo_consultarmodificar_cedula.setText("");
        }


    }//GEN-LAST:event_boton_modificar_consultarActionPerformed

    private void campo_consultarmodificar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_consultarmodificar_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_consultarmodificar_cedulaActionPerformed

    private void boton_modificar_usuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificar_usuariosActionPerformed
        // TODO add your handling code here:

         if ((campo_modificar_nombre.getText().trim().length() != 0) && (campo_modificar_apellido.getText().trim().length() != 0) && (campo_modificar_cedula.getText().trim().length() != 0) && (String.valueOf(campo_modificar_contrasena.getPassword()).trim().length() != 0) && (campo_modificar_usuario.getText().trim().length() != 0)) {
        
        //Se guardan en las variables la información de los campos
        // con sus modificaciones
        int cedula = Integer.parseInt(campo_modificar_cedula.getText());
        String usuario = campo_modificar_usuario.getText();
        String contrasena = String.valueOf(campo_modificar_contrasena.getPassword());
        String nombre = campo_modificar_nombre.getText();
        String apellido = campo_modificar_apellido.getText();
        String rol_ = (String) ComboBox_modificar_rol.getSelectedItem();
        String direccion = campo_modificar_direccion.getText();
        String telefono = campo_modificar_telefono.getText();
        String email = campo_modificar_email.getText();
        
        /**
         * Se conecta a la base de datos y se llama al metodo modificar
         * con los correspondientes campos modificados
         * y se cierra la ventana al realizarse la operación.
         */

        Usuarios obj_modificar = new Usuarios();
        obj_modificar.modificar_usuario(cedula, usuario, contrasena, nombre, apellido, rol_, direccion, telefono, email);
        this.dispose();
         }
         else{
             JOptionPane.showMessageDialog(this, "Hay campos vacios");
         }
    }//GEN-LAST:event_boton_modificar_usuariosActionPerformed

    private void campo_modificar_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_modificar_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_modificar_cedulaActionPerformed

    private void campo_modificar_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_modificar_telefonoKeyTyped
        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
        
        
    }//GEN-LAST:event_campo_modificar_telefonoKeyTyped

    private void campo_consultarmodificar_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campo_consultarmodificar_cedulaKeyTyped

        // TODO add your handling code here:
        
        if (!Character.isDigit(evt.getKeyChar()) && !Character.isISOControl(evt.getKeyChar())) {
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_campo_consultarmodificar_cedulaKeyTyped

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboBox_modificar_rol;
    private javax.swing.JToggleButton boton_modificar_consultar;
    private javax.swing.JToggleButton boton_modificar_usuarios;
    private javax.swing.JTextField campo_consultarmodificar_cedula;
    private javax.swing.JTextField campo_modificar_apellido;
    private javax.swing.JTextField campo_modificar_cedula;
    private javax.swing.JPasswordField campo_modificar_contrasena;
    private javax.swing.JTextField campo_modificar_direccion;
    private javax.swing.JTextField campo_modificar_email;
    private javax.swing.JTextField campo_modificar_nombre;
    private javax.swing.JTextField campo_modificar_telefono;
    private javax.swing.JTextField campo_modificar_usuario;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    // End of variables declaration//GEN-END:variables
}
