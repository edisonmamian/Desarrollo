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
 * @author natha9404
 */
public class Enviar_paquete {

    String driver = "org.postgresql.Driver";
    String connectString = "jdbc:postgresql://localhost:5432/proyectoDesarrollo";
    String user = "postgres";
    String password = "NB210312DM";
    Connection con = null;
    Statement stmt = null;

    /*
    se encarga de crear la conexion con la base de datos
     */
    public Connection conectar() {

        if (con != null) {
            return con;
        }

        try {
            //se hace el llamado al driver que ayuda con la conexion
            Class.forName("org.postgresql.Driver");
            //se crea la conexion con los datos que se definieron arriba
            con = DriverManager.getConnection(connectString, user, password);

            if (con != null) {
                System.out.println("conectando a base de datos");
            }

        } catch (ClassNotFoundException | SQLException | HeadlessException exc) {
            System.out.println("Errorx:" + e­xc.getMessage());
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }

        return con;
    }

    public int insertar_envio(String nombre, String nombre2, String cedula, String cedula2,
            String direccion, String direccion2, String telefono, String telefono2,
            String sede, String tipo, String observacion, int peso, int declaracion_precio,
            int precio_neto, int precio_seguro, int precio_impuesto, int total_envio,
            String forma_pago) {

        int existe = 0;

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            stmt.executeUpdate("INSERT INTO envio VALUES (NEXTVAL('iden'),'" + nombre + "','" + cedula + "','" + direccion + "','" + telefono + "','" + nombre2 + "','" + cedula2 + "','" + direccion2 + "','" + telefono2 + "' ,'" + sede + "','" + tipo + "','" + observacion + "','" + peso + "','" + declaracion_precio + "' ,'" + precio_neto + "','" + precio_seguro + "','" + precio_impuesto + "','" + total_envio + "' ,'" + forma_pago + "')");
            existe = 1;
            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            existe = 0;
        }

        return existe;

    }

    public int secuencia() {

        int existe = 0;
        ResultSet rs = null;

        try {
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT NEXTVAL('iden')");

            while (rs.next()) {
                existe = Integer.parseInt(rs.getString(1));
                System.out.println(existe);
                JOptionPane.showMessageDialog(null, "Su PQR se ha enviado correctamente \n El numero para consultar el estado de su solicitud \n es:" + (existe + 1));

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e);
            existe = 0;

        }

        return existe + 1;

    }

    public ArrayList<String> consultar_envio(int identificador) {
        
        System.out.println(identificador);

        ArrayList<String> consulta = new ArrayList<>();

        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();

            rs = stmt.executeQuery("SELECT * FROM envio WHERE id_envio=" + identificador);
            while (rs.next()) {

                String nombre = rs.getString(2);
                String nombre2 = rs.getString(6);
                String cedula = rs.getString(3);
                String cedula2 = rs.getString(7);
                String direccion = rs.getString(4);
                String direccion2 = rs.getString(8);
                String telefono = rs.getString(5);
                String telefono2 = rs.getString(9);
                String sede = rs.getString(10);
                String tipo = rs.getString(11);
                String observacion = rs.getString(12);
                String peso = rs.getString(13);
                String declaracion_precio2 = rs.getString(14);
                String precio_neto = rs.getString(15);
                String precio_seguro = rs.getString(16);
                String precio_impuesto = rs.getString(17);
                String total_envio = rs.getString(18);
                String forma_pago = rs.getString(19);

                

                consulta.add(nombre);
                consulta.add(cedula);
                consulta.add(direccion);
                consulta.add(telefono);
                consulta.add(nombre2);
                consulta.add(cedula2);
                consulta.add(direccion2);
                consulta.add(telefono2);
                consulta.add(sede);
                consulta.add(tipo);
                consulta.add(observacion);
                consulta.add(peso);
                consulta.add(declaracion_precio2);
                consulta.add(precio_neto);
                consulta.add(precio_seguro);
                consulta.add(precio_impuesto);
                consulta.add(total_envio);
                consulta.add(forma_pago);
                

                System.out.println(consulta);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "El numero de envio a buscar no existe" + e);

        }
        return consulta;

    }

}
