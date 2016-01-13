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
 * @author Edison Mamian cod. 1224279
 */

public class Sedes {
    private Connection conexion = null;
    private ResultSet rs = null;
    private Statement st = null;
    /*
    se encarga de crear la conexion con la base de datos
    */     
    public Connection conectar () {
        
        if(conexion !=null){
            return conexion;
        }
        // son los comandos para acceder a la base de datos
        String cadena = "jdbc:postgresql://localhost:5432/proyectodesarrollo";
        //es el usuario de la base de datos
        String user ="edisonmamian"; 
        //es la contraseña de la base de datos
        String pass = "01269121"; 
        try { 
            //se hace el llamado al driver que ayuda con la conexion
            Class.forName("org.postgresql.Driver"); 
            //se crea la conexion con los datos que se definieron arriba
            conexion = DriverManager.getConnection(cadena,user,pass); 
            
            if (conexion != null){
                System.out.println("conectando a base de datos");
            }
            
        } catch(ClassNotFoundException | SQLException | HeadlessException exc) { 
            System.out.println("Errorx:"+e­xc.getMessage());
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos");
        }
            
         return conexion;
    }
    
    public ArrayList<String> consultar (String nombre) {
        
        ArrayList <String> resp = new ArrayList<>();
        try{
           Sedes con = new Sedes ();
           
           conexion = con.conectar();
           
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
            Sedes con = new Sedes ();
           
           conexion = con.conectar();
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
            Sedes con = new Sedes ();
           
           conexion = con.conectar();
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
           Sedes con = new Sedes ();
           
           conexion = con.conectar();
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
    
    public void cambiar (String nombre, String ciudad, String direccion, String telefono){
        //es el comando SQL para realizar el cambio en los datos de la sede
        String comando = "UPDATE sedes SET nombre='" +nombre+"', ciudad='"+ciudad+"', direccion='"+direccion+"', telefono='"+telefono+"' WHERE nombre='" + nombre +"'";
        try{
            Sedes con = new Sedes ();
           
           conexion = con.conectar();
                        
            //se crea un statement co la coneccion
            st = conexion.createStatement();
            //se envia el comando SQL a la base de datos
            int resp = st.executeUpdate(comando);
            if(resp==1){
                JOptionPane.showMessageDialog(null,"se modifico correctamente");
            }else{
                System.out.println("error al modificar");
            }
        }catch (SQLException | HeadlessException e){
            System.out.println("Error de conexion");
        }
    }
    
    public void registrar (String nombre, String ciudad, String telefono, String direccion){
        try{    
            Sedes con = new Sedes ();
           
           conexion = con.conectar();
            //se crea un statement con la conexion
            st = conexion.createStatement();
            //se ejecuta el comando SQL para ingresar una sede nueva a la base de datos
            int resp = st.executeUpdate("INSERT INTO sedes VALUES ('"+nombre+"','"+ ciudad +"','"+direccion +"','"+telefono+"')");
            
            if (resp == 1){
                System.out.println("se agrego el registro correctamente");
                JOptionPane.showMessageDialog(null, "Se agrego correctamente");
            }else{
                System.out.println("Error al agregar registro");
            }
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, "La sede ya existe");
        }catch(Exception e){
            System.out.println("Error de conexion");
        }
    }
       
}
