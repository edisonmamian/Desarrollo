/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package logica;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

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
public class Registrar_Sede_Codigo {
    private ResultSet rs = null;
    private Statement st = null;
    Conectar_bd conect = new Conectar_bd();
    private Connection conexion;
    /*
    se encarga de registrar sedes nuevas en la base de datos
    */
    public void registrar (String nombre, String ciudad, String telefono, String direccion){
        try{
            //se llama al metodo conectar con la base de datos
            conexion=conect.conectar();
            //se crea un statement con la conexion
            st = conexion.createStatement();
            //se ejecuta el comando SQL para ingresar una sede nueva a la base de datos
            int resp = st.executeUpdate("INSERT INTO sedes VALUES ('"+nombre+"','"+ ciudad +"','"+direccion +"','"+telefono+"')");
            
            if (resp == 1){
                System.out.println("se agrego el registro correctamente");
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
