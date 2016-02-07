/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import logica.Bd_pqr;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Consulta_pqr extends javax.swing.JFrame {

    /**
     * Creates new form consulta_pqr
     */
    public Consulta_pqr() {
        initComponents();
        this.setLocationRelativeTo(null);
        setResizable(false);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
    }

    
    ArrayList<String> datos = new ArrayList<>();
    String rol_user;
    
  public void rol(String rol) {
        
        //De acuerdo al rol del usuario se habilitan los botones
        //correspondientes a la seguridad.

        rol_user = rol;
        if(rol_user.equals("Gerente")){
            
            listar_pqr.setEnabled(true);
            combo_lista.setEnabled(true);
            num_pqr.setEnabled(false);
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

        jLabel7 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        campo_pqr_nombre = new javax.swing.JTextField();
        campo_pqr_apellido = new javax.swing.JTextField();
        campo_pqr_cedula = new javax.swing.JTextField();
        campo_pqr_direccion = new javax.swing.JTextField();
        campo_pqr_telefono = new javax.swing.JTextField();
        campo_pqr_email = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        texto_pqr = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        enviar_pqr = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campo_respuesta = new javax.swing.JTextArea();
        jLabel11 = new javax.swing.JLabel();
        campo_tipo = new javax.swing.JTextField();
        campo_estado = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        num_pqr = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        campo_sede = new javax.swing.JTextField();
        combo_lista = new javax.swing.JComboBox();
        listar_pqr = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campo_fecha = new javax.swing.JTextField();

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("SISTEMA FLASH");

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel8.setText("* Nombre:");

        jLabel9.setText("* Apellidos:");

        jLabel10.setText("* Cedula de Ciudadanía:");

        jLabel15.setText("* Dirección:");

        jLabel16.setText("* Teléfono:");

        jLabel17.setText("*  Email:");

        campo_pqr_nombre.setEditable(false);
        campo_pqr_nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_nombreActionPerformed(evt);
            }
        });

        campo_pqr_apellido.setEditable(false);
        campo_pqr_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_apellidoActionPerformed(evt);
            }
        });

        campo_pqr_cedula.setEditable(false);
        campo_pqr_cedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_cedulaActionPerformed(evt);
            }
        });

        campo_pqr_direccion.setEditable(false);
        campo_pqr_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_direccionActionPerformed(evt);
            }
        });

        campo_pqr_telefono.setEditable(false);
        campo_pqr_telefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_telefonoActionPerformed(evt);
            }
        });

        campo_pqr_email.setEditable(false);
        campo_pqr_email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_pqr_emailActionPerformed(evt);
            }
        });

        jLabel1.setText("Tipo de PQR:");

        jLabel2.setText("Detalle del PQR:");

        texto_pqr.setEditable(false);
        texto_pqr.setColumns(20);
        texto_pqr.setRows(5);
        jScrollPane1.setViewportView(texto_pqr);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel3.setText("DATOS PERSONALES (* Son obligatorios)");

        jLabel4.setText("Sede:");

        enviar_pqr.setText("Enviar");
        enviar_pqr.setEnabled(false);
        enviar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                enviar_pqrActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setText("RESPUESTA:");

        campo_respuesta.setEditable(false);
        campo_respuesta.setColumns(20);
        campo_respuesta.setRows(5);
        jScrollPane2.setViewportView(campo_respuesta);

        jLabel11.setText("Estado:");

        campo_tipo.setEditable(false);

        campo_estado.setEditable(false);

        jLabel12.setText("Numero de PQR:");

        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        campo_sede.setEditable(false);
        campo_sede.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campo_sedeActionPerformed(evt);
            }
        });

        combo_lista.setEnabled(false);
        combo_lista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_listaActionPerformed(evt);
            }
        });

        listar_pqr.setText("Listar PQR");
        listar_pqr.setEnabled(false);
        listar_pqr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listar_pqrActionPerformed(evt);
            }
        });

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(102, 204, 255));
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel13.setText("CONSULTAR PQR");
        jLabel13.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel13.setName("Registrar Usuario"); // NOI18N

        jLabel5.setText("Fecha:");

        campo_fecha.setEditable(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jLabel3)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel10)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(campo_pqr_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel14)
                                                    .addGap(254, 254, 254))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel16)
                                                        .addComponent(jLabel4))
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(campo_sede)
                                                        .addComponent(campo_pqr_telefono, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE))))
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel9)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(campo_pqr_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel15)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                    .addComponent(campo_pqr_direccion))
                                                .addGroup(jPanel7Layout.createSequentialGroup()
                                                    .addComponent(jLabel17)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                    .addComponent(campo_pqr_email, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addComponent(jLabel6)
                                        .addComponent(jScrollPane2))
                                    .addComponent(enviar_pqr))
                                .addGap(4, 4, 4))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jLabel1)
                                                    .addComponent(jLabel5))
                                                .addGap(22, 22, 22)))
                                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                                        .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(27, 27, 27)
                                                        .addComponent(jLabel11))
                                                    .addComponent(num_pqr, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                            .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(combo_lista, javax.swing.GroupLayout.PREFERRED_SIZE, 273, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton1)
                                    .addComponent(listar_pqr))))
                        .addGap(19, 19, 19))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_lista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(listar_pqr))
                .addGap(8, 8, 8)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(num_pqr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(jButton1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campo_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(campo_estado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addGap(5, 5, 5)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(campo_pqr_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9)
                        .addComponent(campo_pqr_apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel8))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel14)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campo_pqr_cedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15)
                    .addComponent(campo_pqr_direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campo_pqr_telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16)
                    .addComponent(campo_pqr_email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(campo_sede, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(enviar_pqr)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 597, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 821, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 123, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void campo_pqr_nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_nombreActionPerformed

    private void campo_pqr_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_apellidoActionPerformed

    private void campo_pqr_cedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_cedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_cedulaActionPerformed

    private void campo_pqr_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_direccionActionPerformed

    private void campo_pqr_telefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_telefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_telefonoActionPerformed

    private void campo_pqr_emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_pqr_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_pqr_emailActionPerformed

    private void enviar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_enviar_pqrActionPerformed
        // TODO add your handling code here:

        
               String respuesta = campo_respuesta.getText();
               int identificador; 
     
               if(respuesta.isEmpty()){
                   
                   JOptionPane.showMessageDialog(this, "No ha dado respuesta");
                   
               }else{
        Bd_pqr objeto_bd = new Bd_pqr();
        if(combo_lista.isEnabled()==true){
         
            objeto_bd.actualizar(respuesta, Integer.parseInt((String) combo_lista.getSelectedItem()));
        }else{
            identificador = Integer.parseInt(num_pqr.getText());
       objeto_bd.actualizar(respuesta, identificador);
        }
       this.dispose();}
    }//GEN-LAST:event_enviar_pqrActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        
        
        try{
            
            /**
             * obj_consultar : objeto para acceder a la interfaz buscar_usuario
             * datos : se realiza el llamado al metodo consultar_usuario
             * el cual recibe un entero cedula, con dicha cedula realiza
             * la busqueda en la base de datos y retorna en el ArrayList<String>
             * cada uno de los datos del usuario solicitado, y se imprimen en los
             * campos.
             */
            Bd_pqr obj_consultarbd = new Bd_pqr();
        System.out.println("Conecto el objeto");
        
        if(combo_lista.isEnabled()==true){
            datos=obj_consultarbd.consultar_pqr(Integer.parseInt((String) combo_lista.getSelectedItem()));
        }else{
        datos=obj_consultarbd.consultar_pqr(Integer.parseInt(num_pqr.getText()));
        }
        //System.out.println("boton"+user+nom+ape+rol_+dir+tel+em);

        
        campo_tipo.setText(datos.get(0));
        texto_pqr.setText(datos.get(1));
        campo_pqr_nombre.setText(datos.get(2));
        campo_pqr_apellido.setText(datos.get(3));
        campo_pqr_cedula.setText(datos.get(4));
        campo_pqr_direccion.setText(datos.get(5));
        campo_pqr_telefono.setText(datos.get(6));
        campo_pqr_email.setText(datos.get(7));
        campo_sede.setText(datos.get(8));
        campo_estado.setText(datos.get(9));
        campo_respuesta.setText(datos.get(10));
        campo_fecha.setText(datos.get(11));
        
        num_pqr.setEditable(false);
        
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, "El pqr que intenta consultar no existe");
            
        }
        
        if(rol_user.equals("Gerente")){
            campo_respuesta.setEditable(true);
            enviar_pqr.setEnabled(true);
        }
        else{
            
        }
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campo_sedeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campo_sedeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campo_sedeActionPerformed

    private void listar_pqrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listar_pqrActionPerformed
        // TODO add your handling code here:
        ArrayList<String> lista_pqr = new ArrayList<>();
        
        Bd_pqr obj_pqr_listar = new Bd_pqr();
        lista_pqr = obj_pqr_listar.listar_pqr();
        System.out.println("METODO"+lista_pqr);
        
        String[] pqr_combo = new String[lista_pqr.size()];

        for (int i = 0; i < lista_pqr.size(); i++) {

            pqr_combo[i] = lista_pqr.get(i);
            System.out.println(pqr_combo[i]);

        }
        combo_lista.setModel(new javax.swing.DefaultComboBoxModel(pqr_combo));
        
    }//GEN-LAST:event_listar_pqrActionPerformed

    private void combo_listaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_listaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_listaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campo_estado;
    private javax.swing.JTextField campo_fecha;
    private javax.swing.JTextField campo_pqr_apellido;
    private javax.swing.JTextField campo_pqr_cedula;
    private javax.swing.JTextField campo_pqr_direccion;
    private javax.swing.JTextField campo_pqr_email;
    private javax.swing.JTextField campo_pqr_nombre;
    private javax.swing.JTextField campo_pqr_telefono;
    private javax.swing.JTextArea campo_respuesta;
    private javax.swing.JTextField campo_sede;
    private javax.swing.JTextField campo_tipo;
    private javax.swing.JComboBox combo_lista;
    private javax.swing.JButton enviar_pqr;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listar_pqr;
    private javax.swing.JTextField num_pqr;
    private javax.swing.JTextArea texto_pqr;
    // End of variables declaration//GEN-END:variables

    
}
