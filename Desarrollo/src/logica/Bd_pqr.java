/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author natha
 */
public class Bd_pqr {

    String driver = "org.postgresql.Driver";
    String connectString = "jdbc:postgresql://localhost:5432/proyectoDesarrollo";
    String user = "postgres";
    String password = "NB210312DM";
    Connection con = null;
    Statement stmt = null;
    
    public Connection conectar () {
        
        if(con !=null){
            return con;
        }
        
        try { 
            //se hace el llamado al driver que ayuda con la conexion
            Class.forName("org.postgresql.Driver"); 
            //se crea la conexion con los datos que se definieron arriba
            con = DriverManager.getConnection(connectString,user,password); 
            
            if (con != null){
                System.out.println("conectando a base de datos");
            }
            
        } catch(ClassNotFoundException | SQLException | HeadlessException exc) { 
            System.out.println("Errorx:"+e­xc.getMessage());
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
            
         return con;
    }

    public int insertar_pqr(String tipo_pqr, String detalle, String nombre,
            String apellido, String cedula, String direccion, String telefono,
            String email, String sede, String fecha) {

        int existe = 0;

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            stmt.executeUpdate("INSERT INTO pqr VALUES (NEXTVAL('identificador'),'" + tipo_pqr + "','" + detalle + "','" + nombre + "','" + apellido + "','" + cedula + "','" + direccion + "','" + telefono + "','" + email + "' ,'" + sede + "','En Proceso',' ','" + fecha + "')");
            existe = 1;
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            System.out.println(e);
            existe = 0;
        }

        return existe;

    }

    public ArrayList<String> consultar_pqr(int identificador) {

        ArrayList<String> consulta = new ArrayList<>();
        
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT * FROM pqr WHERE id_pqr=" + identificador);
            while (rs.next()) {

                String tipo_pqr = rs.getString(2);
                String detalle = rs.getString(3);
                String nombre = rs.getString(4);
                String apellido = rs.getString(5);
                String cedula = rs.getString(6);
                String direccion = rs.getString(7);
                String telefono = rs.getString(8);
                String email = rs.getString(9);
                String sede = rs.getString(10);
                String estado = rs.getString(11);
                String respuesta = rs.getString(12);
                String fecha = rs.getString(13);
                             
               

                consulta.add(tipo_pqr);
                consulta.add(detalle);
                consulta.add(nombre);
                consulta.add(apellido);
                consulta.add(cedula);
                consulta.add(direccion);
                consulta.add(telefono);
                consulta.add(email);
                consulta.add(sede);
                consulta.add(estado);
                consulta.add(respuesta);
                consulta.add(fecha);
                        

                System.out.println(tipo_pqr + detalle + nombre + apellido + cedula + direccion + telefono + email + sede + estado +respuesta);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El numero de pqr a buscar no existe"+e);

        }
        return consulta;

    }

    public int secuencia() {

        int existe = 0;
        ResultSet rs = null;

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT NEXTVAL('identificador')");

            while (rs.next()) {
                existe = Integer.parseInt(rs.getString(1));
                System.out.println(existe);
                JOptionPane.showMessageDialog(null, "Su PQR se ha enviado correctamente \n El numero para consultar el estado de su solicitud \n es:" + (existe+1));

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            existe = 0;

        }

        return existe;

    }

    public void actualizar(String respuesta, int identificador) {
       
        String query = "";
        String estado = "Resuelto";
        int resultado = 0;
        query = "update pqr set estado ='" + estado + "', respuesta = '"
                 + respuesta + "' where id_pqr =" + identificador + ";";

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            System.out.println(estado+" "+respuesta+" "+identificador);            

            int n = stmt.executeUpdate(query);
           
            
// String sql = "UPDATE usuarios SET usuario = ?, contrasena = ?, nombre = ?, apellido = ?, rol = ?, direccion = ?, telefono = ?, email = ? WHERE cedula = ?";
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "PQR Enviada correctamente");
            } else {

            }
            
            con.close();

        } catch (SQLException e) {
            System.out.println(e); 

        }
        
    }

    public ArrayList<String> listar_pqr() {
       
        int existe = 0;
        ResultSet rs = null;
        ArrayList<String> list_pqr = new ArrayList<>();

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT id_pqr FROM pqr;");

            while (rs.next()) {
                list_pqr.add(rs.getString(1));
                System.out.println(rs.getString(1));
                
            }

            stmt.close();
            con.close();
            System.out.println(list_pqr);

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            existe = 0;

        }        
        
        return list_pqr;
       
    }

}
