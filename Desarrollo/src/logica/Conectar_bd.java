/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;

import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Edison Mamian cod. 1224279
 */

public class Conectar_bd {
    private Connection conexion = null;
    /*
    se encarga de crear la conexion con la base de datos
    */     
    public Connection conectar () {
        
        if(conexion !=null){
            return conexion;
        }
        // son los comandos para acceder a la base de datos
        String cadena = "jdbc:postgresql://localhost:5432/proyectoDesarrollo";
        //es el usuario de la base de datos
        String user ="postgres"; 
        //es la contraseña de la base de datos
        String pass = "NB210312DM"; 
        try { 
            //se hace el llamado al driver que ayuda con la conexion
            Class.forName("org.postgresql.Driver"); 
            //se crea la conexion con los datos que se definieron arriba
            conexion = DriverManager.getConnection(cadena,user,pass); 
            
            if (conexion != null){
                System.out.println("conectando a base de datos");
            }
            
        } catch(ClassNotFoundException | SQLException | HeadlessException exc) { 
            System.out.println("Errorx:"+e­xc.getMessage()); }
        
         return conexion;
    }
       
}
