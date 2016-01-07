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

/*
accede:
Superusuario
Gerente 
Secretaria
*/

import java.sql.*;
import java.util.ArrayList;
import javax.swing.*;


public class Modificar_Sede_Codigo {
    private ResultSet rs = null;
    private Statement st = null;
    Conectar_bd conect = new Conectar_bd();
    
    /*
    se encarga de realizar el cambio a una sede en la base de datos
    recibe como parametro, los nuevos datos que va a tener la sede
    */
    public void cambiar (String nombre, String ciudad, String direccion, String telefono){
        //es el comando SQL para realizar el cambio en los datos de la sede
        String comando = "UPDATE sedes SET nombre='" +nombre+"', ciudad='"+ciudad+"', direccion='"+direccion+"', telefono='"+telefono+"' WHERE nombre='" + nombre +"'";
        try{
            //se llama al metodo que conecta con la base de datos
            Connection conexion=conect.conectar();
            //se crea un statement co la coneccion
            st = conexion.createStatement();
            //se envia el comando SQL a la base de datos
            int resp = st.executeUpdate(comando);
            if(resp==1){
                JOptionPane.showMessageDialog(null,"se modifico correctamente");
            }else{
                System.out.println("error al modificar");
            }
        }catch (Exception e){
            System.out.println("Error de conexion");
        }
    }
}
