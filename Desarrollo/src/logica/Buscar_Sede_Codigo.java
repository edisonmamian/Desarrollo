/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

/**
 *
 * @author Edison Mamian cod. 1224279
 */

import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;


public class Buscar_Sede_Codigo {
    private ResultSet rs = null;
    private Statement st = null;
    Conectar_bd conect = new Conectar_bd();
    private Connection conexion=conect.conectar();
    
    /*
    se encarga de traer los datos de la sede que se va a modificar
    */
    public ArrayList<String> consultar (String nombre) {
        
        ArrayList <String> resp = new ArrayList<>();
        try{
            //se crea un statemen con la conexion a la base de datos
           st = conexion.createStatement();
           //se realiza la consulta SQL  a la base de datos, en la tabla sedes con el nombre de la que se busca
           rs = st.executeQuery("SELECT * FROM sedes WHERE nombre = '"+ nombre +"';");
           while(rs.next()){
                nombre = rs.getString(1);
                String ciudad = rs.getString(2);
                String direccion = rs.getString(3);
                String telefono = rs.getString(4);

                resp.add(nombre);
                resp.add(ciudad);
                resp.add(direccion);
                resp.add(telefono);
           }
           
           rs.close();
           st.close();
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La sede no existe");
        }catch(Exception e){
           System.out.println("Error al buscar en la base de datos");
        }
       return resp;
    }
    /*
    se encarga de buscar todas las sedes que se han registrado en la base de datos
    */
    public ResultSet listar () {
        try{
            //se crea un statemen con la conexion a la base de datos
           st = conexion.createStatement();
           // se ejecuta el comando SQL 
           rs = st.executeQuery("SELECT * FROM sedes;");
                      
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se encontraron sedes registradas");
        }catch(Exception e){
           System.out.println("Error al buscar en la base de datos");
        }
        
        return rs;
    }
    
    /*
    se encarga de buscar una sede con el nombre
    */
    public ResultSet mostrar (String nombre) {
        try{
            //se crea un statemen con la conexion a la base de datos
           st = conexion.createStatement();
           //se realiza la consulta SQL  a la base de datos, en la tabla sedes con el nombre de la que se busca
           rs = st.executeQuery("SELECT * FROM sedes WHERE nombre = '" + nombre + "';");
                      
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La sede no existe");
        }catch(Exception e){
           System.out.println("Error al buscar en la base de datos");
        }
        
        return rs;
    }
    
    public ArrayList<String> obtener_sedes () {
             
        ArrayList <String> nom = new ArrayList<>();
               
       try{
            //se crea un statemen con la conexion a la base de datos
           st = conexion.createStatement();
           // se ejecuta el comando SQL 
           rs = st.executeQuery("SELECT * FROM sedes;");
           
            while(rs.next()){
                String nombre = rs.getString(1);
                nom.add(nombre);
                               
           }
             rs.close();
           st.close();
                      
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "No se encontraron sedes registradas");
        }catch(Exception e){
           System.out.println("Error al buscar en la base de datos");
        }
        
        
        return nom;
    }
}
