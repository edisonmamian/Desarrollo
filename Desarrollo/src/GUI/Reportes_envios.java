/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import logica.Consulta_reportes;

/**
 *
 * @author natha9404
 */
public class Reportes_envios extends javax.swing.JFrame {

    /**
     * Creates new form Reportes_envios
     */
    public Reportes_envios() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE); 
        setResizable(false);
        
    }
    
   

    
    public void ano(){
        
        combo_mes.setEnabled(false);
        
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
        jLabel19 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        combo_ano = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        combo_mes = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        volver_principal = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(157, 215, 255), 3));

        jLabel19.setBackground(new java.awt.Color(153, 204, 255));
        jLabel19.setFont(new java.awt.Font("Serif", 1, 20)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(102, 204, 255));
        jLabel19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/recursos/FlashLogo.png"))); // NOI18N
        jLabel19.setText("REPORTES ENVIOS");
        jLabel19.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel19.setName("Usuarios"); // NOI18N

        jLabel1.setText("Datos a Consultar");

        jLabel2.setText("Año:");

        combo_ano.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2016", "2015", "2014", "2013" }));

        jLabel3.setText("Mes:");

        combo_mes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre" }));

        jButton1.setText("Consultar Reporte");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Sede Destino", "Numero de Envios", "Pagos Trjta Debito", "Pagos Trjeta Credito", "Pagos En Efectivo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        volver_principal.setText("Volver a ventana principal");
        volver_principal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                volver_principalActionPerformed(evt);
            }
        });

        jButton2.setText("Graficar");
        jButton2.setEnabled(false);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel7Layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(18, 18, 18)
                                        .addComponent(combo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel3)
                                        .addGap(29, 29, 29)
                                        .addComponent(combo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jButton1)
                                        .addGap(29, 29, 29)
                                        .addComponent(jButton2))))
                            .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGap(246, 246, 246)
                                .addComponent(volver_principal)))
                        .addGap(0, 69, Short.MAX_VALUE))
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1)))
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(combo_ano, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(combo_mes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(26, 26, 26)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(60, 60, 60)
                .addComponent(volver_principal))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 745, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 303, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        jButton2.setEnabled(true);
        String ano = combo_ano.getSelectedItem().toString();
        int mes_inicio = 1;
        int mes_final = 12;
        

        String fecha1,fecha2 = "";
        int dia_inicio=1;
        int dia_fin= 0;

        if(combo_mes.isEnabled()==true) {
            mes_inicio = combo_mes.getSelectedIndex()+1;

            if(mes_inicio==2){
                dia_fin=28;
            }
            else if (mes_inicio%2==0){

                dia_fin = 31;
            }
            else{

                dia_fin = 30;
            }

            fecha1 = "'"+ano+"-"+mes_inicio+"-"+dia_inicio+"'";
            fecha2 = "'"+ano+"-"+mes_inicio+"-"+dia_fin+"'";

        }

        else{
            dia_fin = 31;
            fecha1 = "'"+ano+"-"+mes_inicio+"-"+dia_inicio+"'";
            fecha2 = "'"+ano+"-"+mes_final+"-"+dia_fin+"'";

        }

        System.out.println("mes"+mes_inicio);
        Consulta_reportes obj_consultar = new Consulta_reportes();
        ArrayList<String> sedes = new ArrayList<>();
        sedes = obj_consultar.consultar_envio(fecha1,fecha2);
        ArrayList<Integer> num_envios = new ArrayList<>();
        ArrayList<Integer> num_debito = new ArrayList<>();
        ArrayList<Integer> num_credito = new ArrayList<>();
        ArrayList<Integer> num_efectivo = new ArrayList<>();
        

        
        Object [] fila1=new Object[5];

        DefaultTableModel modelo=(DefaultTableModel) jTable1.getModel();
       
        try{
        for(int i = 0; i<sedes.size(); i++){
            
            num_envios = obj_consultar.consultar_num_envio(fecha1,fecha2,sedes.get(i));
            
            num_debito = obj_consultar.consultar_num_debito(fecha1,fecha2,sedes.get(i));
            
            num_credito = obj_consultar.consultar_num_credito(fecha1,fecha2,sedes.get(i));
            
            num_efectivo = obj_consultar.consultar_num_efectivo(fecha1,fecha2,sedes.get(i));
            
            fila1[0]=sedes.get(i);
            System.out.println("GUI.Reportes_envios.jButton1ActionPerformed()");
            
            
            System.out.println(num_envios);
            System.out.println(num_debito);
            System.out.println(num_credito);
            System.out.println(num_efectivo);
            fila1[1] = num_envios.toString();
            System.out.println("tamano"+fila1.length);
            fila1[2] = num_debito.toString();
            fila1[3] = num_credito.toString();
            fila1[4] = num_efectivo.toString();
            
            System.out.println(sedes.get(i));
            modelo.addRow(fila1);
        }
        
        
      
        jTable1.setModel(modelo);
        }catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void volver_principalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_volver_principalActionPerformed
        // TODO add your handling code here:
        // se devuelve a la ventana anterior
        //obj_ventana_principal.rol(rol_user);
        this.dispose();
    }//GEN-LAST:event_volver_principalActionPerformed

    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> combo_ano;
    public javax.swing.JComboBox<String> combo_mes;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton volver_principal;
    // End of variables declaration//GEN-END:variables
}
