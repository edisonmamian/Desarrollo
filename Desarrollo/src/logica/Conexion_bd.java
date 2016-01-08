/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author natha
 */
public class Conexion_bd {

    String driver = "org.postgresql.Driver";
    String connectString = "jdbc:postgresql://localhost:5432/proyectoDesarrollo";
    String user = "postgres";
    String password = "NB210312DM";
    ArrayList<String> consulta = new ArrayList<>();

    public int registrar_usuario(int cedula, String usuario, String contrasena,
            String nombre, String apellido, String rol, String direccion,
            String telefono, String email) {

       int existe=0;
        
        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            Statement stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO usuarios VALUES ('" + cedula + "','" + usuario + "','" + contrasena + "','" + nombre + "','" + apellido + "','" + rol + "','" + direccion + "','" + telefono + "','" + email + "')");
            existe = 1;
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");
            existe=0;

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado");
        }
        
        return existe;
    }

    public void modificar_usuario(int cedula, String usuario, String contrasena,
            String nombre, String apellido, String rol, String direccion,
            String telefono, String email) {

        String query = "";
        int resultado = 0;
        query = "update usuarios set usuario ='" + usuario + "', contrasena ='" + contrasena + "', nombre ='" + nombre + "', apellidos ="
                + "'" + apellido + "' where cedula =" + cedula + ";";

        try {
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);

            System.out.println(usuario + contrasena + nombre + apellido + rol + direccion + telefono + email);

            Statement stmt = con.createStatement();

            int n = stmt.executeUpdate(query);

            
            
// String sql = "UPDATE usuarios SET usuario = ?, contrasena = ?, nombre = ?, apellido = ?, rol = ?, direccion = ?, telefono = ?, email = ? WHERE cedula = ?";
            if (n > 0) {
                JOptionPane.showMessageDialog(null, "Modificación correcta");
            } else {

            }

            
            con.close();

        } catch (SQLException e) {
            System.out.println(e); 

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado");
        }

    }

    public ArrayList<String> consultar_usuario(int cedula) {

        try {
            ResultSet rs = null;
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            Statement stmt = con.createStatement();

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
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario ya existe");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado");
        }
        return consulta;

    }
    
    public ArrayList<String> comprobar_inicio_sesion(String usuario, String contrasena){
        
        ArrayList<String> iguales = new ArrayList<>();
      
        
        try {
            ResultSet rs = null;
            Class.forName(driver);
            Connection con = DriverManager.getConnection(connectString, user, password);
            Statement stmt = con.createStatement();

            
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
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El usuario no existe");

        } catch (ClassNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Error inesperado");
        } catch (Error e){
            JOptionPane.showMessageDialog(null, "El usuario no existe");
        }
        
        
        return iguales;
    }

}
