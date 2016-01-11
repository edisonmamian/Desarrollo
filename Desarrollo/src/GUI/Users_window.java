/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

/**
 *
 * @author natha
 */
public class Users_window extends javax.swing.JFrame {

    /**
     * Creates new form Users_window
     */
    String rol_user;

    public Users_window() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setResizable(false);
    }

    public void rol(String rol) {
        
        //De acuerdo al rol del usuario se habilitan los botones
        //correspondientes a la seguridad.

        rol_user = rol;
        if (rol_user.equals("admin") || rol_user.equals("Gerente")) {

        }
        else{
            
            boton_adduser.setEnabled(false);
            
        }
        
        if (rol_user.equals("admin") || rol_user.equals("Gerente") || rol_user.equals("Contador")) {

        }
        else{
            
            boton_modificarusuario.setEnabled(false);
            
        }
        
        if (rol_user.equals("admin") || rol_user.equals("Gerente") || rol_user.equals("Contador") || rol_user.equals("Secretaria")) {

        }
        else{
            
            boton_buscarusuario.setEnabled(false);
            
        }
        
        
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
        boton_adduser = new javax.swing.JButton();
        boton_modificarusuario = new javax.swing.JButton();
        boton_actualizarusuario = new javax.swing.JButton();
        boton_buscarusuario = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        volver_principal = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        boton_adduser.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/add_user.png"))); // NOI18N
        boton_adduser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_adduserActionPerformed(evt);
            }
        });

        boton_modificarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/modificar_usuario.png"))); // NOI18N
        boton_modificarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_modificarusuarioActionPerformed(evt);
            }
        });

        boton_actualizarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/actualizar_usuario.png"))); // NOI18N
        boton_actualizarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_actualizarusuarioActionPerformed(evt);
            }
        });

        boton_buscarusuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/buscar_usuario.png"))); // NOI18N
        boton_buscarusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_buscarusuarioActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Usuario");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Modificar Usuario");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Actualizar Usuario");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Buscar Usuario");

        volver_principal.setText("Volver a ventana principal");
        volver_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principalActionPerformed(evt);
            }
        });

        jLabel19.setBackground(new java.awt.Color(153, 204, 255));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 204, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel19.setText("GESTION USUARIOS");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setName("Usuarios"); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(48, 48, 48)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(boton_actualizarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(boton_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 94, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_modificarusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscarusuario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(48, 48, 48))
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(volver_principal)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(boton_adduser, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_modificarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boton_actualizarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(boton_buscarusuario, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(volver_principal)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 369, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 398, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_adduserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_adduserActionPerformed
        // TODO add your handling code here:

        //Abre la ventana registrar usuarios
        Registrar_usuario obj_registrar_user = new Registrar_usuario();
        obj_registrar_user.setVisible(true);


    }//GEN-LAST:event_boton_adduserActionPerformed

    private void boton_modificarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_modificarusuarioActionPerformed
        // TODO add your handling code here:
        //Abre la ventana modificar usuario
        Modificar_usuario obj_mod_user = new Modificar_usuario();
        obj_mod_user.setVisible(true);

    }//GEN-LAST:event_boton_modificarusuarioActionPerformed

    private void boton_actualizarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_actualizarusuarioActionPerformed
        // TODO add your handling code here:
 
        //abre al ventana actualizar usuario
        Actualizar_usuario obj_actua_user = new Actualizar_usuario();
        obj_actua_user.setVisible(true);


    }//GEN-LAST:event_boton_actualizarusuarioActionPerformed

    private void boton_buscarusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_buscarusuarioActionPerformed
        // TODO add your handling code here:
        //abre la ventana para consultar usuarios
        Consultar_usuario obj_buscar_user = new Consultar_usuario();
        obj_buscar_user.setVisible(true);

    }//GEN-LAST:event_boton_buscarusuarioActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        First_window obj_ventana_principal = new First_window();
        obj_ventana_principal.setVisible(true);
        obj_ventana_principal.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_volver_principalActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_actualizarusuario;
    private javax.swing.JButton boton_adduser;
    private javax.swing.JButton boton_buscarusuario;
    private javax.swing.JButton boton_modificarusuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton volver_principal;
    // End of variables declaration//GEN-END:variables
}
