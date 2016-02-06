/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.awt.HeadlessException;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class Usuarios {

    String driver = "org.postgresql.Driver";
    String connectString = "jdbc:postgresql://localhost:5432/proyectoDesarrollo";
    String user = "postgres";
    String password = "NB210312DM";
    Connection conexion = null;
    Statement stmt = null;
    
    ArrayList<String> consulta = new ArrayList<>();
    
    public Connection conectar () {
        
        if(conexion !=null){
            return conexion;
        }
        
        try { 
            //se hace el llamado al driver que ayuda con la conexion
            Class.forName("org.postgresql.Driver"); 
            //se crea la conexion con los datos que se definieron arriba
            conexion = DriverManager.getConnection(connectString,user,password); 
            
            if (conexion != null){
                System.out.println("conectando a base de datos");
            }
            
        } catch(ClassNotFoundException | SQLException | HeadlessException exc) { 
            System.out.println("Errorx:"+e­xc.getMessage());
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
            
         return conexion;
    }

    public int registrar_usuario(int cedula, String usuario, String contrasena,
            String nombre, String apellido, String rol, String direccion,
            String telefono, String email) {

       int existe=0;
        
        try {
            Usuarios conex = new Usuarios ();
            conexion = conex.conectar();
            stmt = conexion.createStatement();

            stmt.executeUpdate("INSERT INTO usuarios VALUES ('" + cedula + "','" + usuario + "','" + contrasena + "','" + nombre + "','" + apellido + "','" + rol + "','" + direccion + "','" + telefono + "','" + email + "')");
            existe = 1;
            stmt.close();
            conexion.close();

        } catch (SQLException e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
            existe=0;

        }
        
        return existe;
    }

    public void modificar_usuario(int cedula, String usuario, String contrasena,
            String nombre, String apellido, String rol, String direccion,
            String telefono, String email) {

        String query;
        int resultado = 0;

        query = "update usuarios set usuario ='" + usuario + "', contrasena ='" + contrasena + "', nombre ='" + nombre + "', apellidos ="
                + "'" + apellido + "', rol ='" + rol + "', telefono ='" + telefono + "', direccion ='" + direccion + "', email ='" + email + "' where cedula =" + cedula + ";";
       
        try {
            Usuarios conex = new Usuarios ();
            conexion = conex.conectar();
            stmt = conexion.createStatement();

            System.out.println(usuario + contrasena + nombre + apellido + rol + direccion + telefono + email);
            System.out.println("Query"+query);
            int n = stmt.executeUpdate(query);   
            System.out.println(n);
            
// String sql = "UPDATE usuarios SET usuario = ?, contrasena = ?, nombre = ?, apellido = ?, rol = ?, direccion = ?, telefono = ?, email = ? WHERE cedula = ?";
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Modificación correcta");
            } else {
                System.out.println("error al modificar");
            }            
            
        } catch (SQLException e) {
            System.out.println(e); 
        }
    }

    public ArrayList<String> consultar_usuario(int cedula) {

        try {
            ResultSet rs;
            Usuarios conex = new Usuarios ();
            conexion = conex.conectar();
            stmt = conexion.createStatement();
            
            rs = stmt.executeQuery("SELECT * FROM usuarios WHERE cedula=" + cedula);
            while (rs.next()) {

                String usuario = rs.getString(2);
                String contrasena = rs.getString(3);
                String nombre = rs.getString(4);
                String apellido = rs.getString(5);
                String rol = rs.getString(6);
                String direccion = rs.getString(7);
                String telefono = rs.getString(8);
                String email = rs.getString(9);

                consulta.add(usuario);
                consulta.add(Integer.toString(cedula));
                consulta.add(nombre);
                consulta.add(apellido);
                consulta.add(rol);
                consulta.add(direccion);
                consulta.add(telefono);
                consulta.add(email);
                consulta.add(contrasena);

                System.out.println(usuario + contrasena + nombre + apellido + rol + direccion + telefono + email);

            }

            stmt.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");

        }
        return consulta;
    }
    
    public ArrayList<String> comprobar_inicio_sesion(String usuario, String contrasena){
        
        ArrayList<String> iguales = new ArrayList<>();
      
        
        try {
            ResultSet rs;
            Usuarios conex = new Usuarios ();
            conexion = conex.conectar();
            stmt = conexion.createStatement();
            
            rs = stmt.executeQuery("SELECT usuario,contrasena,rol FROM usuarios WHERE usuario='"+usuario+"';");
            while (rs.next()) {

                String usuar = rs.getString(1);
                String contra = rs.getString(2);
                String rol = rs.getString(3);
                
                iguales.add(usuar);
                iguales.add(contra);
                iguales.add(rol);

                System.out.println(usuar + contra + rol);

            }

            stmt.close();
            conexion.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");
            System.out.println("error " + e);

        }        
        
        return iguales;
    }

}
