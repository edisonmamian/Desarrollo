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
public class Consulta_reportes {
    
    
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
                //System.out.println("conectando a base de datos");
            }
            
        } catch(ClassNotFoundException | SQLException | HeadlessException exc) { 
            System.out.println("Errorx:"+e­xc.getMessage());
            JOptionPane.showMessageDialog(null, "error al conectar a la base de datos");
        }
            
         return con;
    }
    
    
    public int consultar_pqr(String fecha_inicio, String fecha_fin,String tipo, String sede) {
        int num=0;
        
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_pqr) FROM pqr WHERE fecha>="+fecha_inicio+" AND fecha<="+fecha_fin+" AND tipo_pqr="+tipo+" AND sede="+sede;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               num = Integer.parseInt(rs.getString(1));
                        

                System.out.println(num);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        return num;
        
        
    }

    public int consultar_pqr_pro(String fecha1, String fecha2, String tipo, String sede) {
        int num=0;
        
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_pqr) FROM pqr WHERE fecha>="+fecha1+" AND fecha<="+fecha2+" AND tipo_pqr="+tipo+" AND estado='En Proceso'"+" AND sede="+sede;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               num = Integer.parseInt(rs.getString(1));
                        

                System.out.println("En Proceso"+num);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        return num;
    }

    public ArrayList<String> consultar_envio(String fecha1, String fecha2) {
        ArrayList<String> sedes = new ArrayList<>();
        
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT DISTINCT sede FROM envio WHERE fecha>="+fecha1+" AND fecha<="+fecha2;

            rs = stmt.executeQuery(query);
            while (rs.next()) {
                
               int i = 1; 
               sedes.add(rs.getString(i));
               i +=1;         

                System.out.println(sedes);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        return sedes;
    }
    
    public ArrayList<Integer> consultar_num_envio(String fecha1,String fecha2, String sedes){
        ArrayList<Integer> num_envios = new ArrayList<>();
        
        
        String sede = "'"+sedes+"'";
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_envio) FROM envio WHERE fecha>="+fecha1+" AND fecha<="+fecha2+" AND sede="+sede;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               int i = 1; 
               num_envios.add(Integer.parseInt(rs.getString(i)));
               i +=1;         

                System.out.println(num_envios);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        
        return num_envios;
    }

    public ArrayList<Integer> consultar_num_debito(String fecha1, String fecha2, String sedes) {
        
        ArrayList<Integer> num_debito = new ArrayList<>();
        String tipo = "'"+"Tarjeta Debito"+ "'";
        String sede = "'"+sedes+"'";
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_envio) FROM envio WHERE fecha>="+fecha1+" AND fecha<="+fecha2+" AND sede="+sede+ "AND forma_pago="+tipo;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               int i = 1; 
               num_debito.add(Integer.parseInt(rs.getString(i)));
               i +=1;         

                System.out.println(num_debito);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        
        return num_debito;

    }

    public ArrayList<Integer> consultar_num_credito(String fecha1, String fecha2, String sedes) {
        
        ArrayList<Integer> num_credito = new ArrayList<>();
        String tipo = "'"+"Tarjeta Credito"+ "'";
        String sede = "'"+sedes+"'";
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_envio) FROM envio WHERE fecha>="+fecha1+" AND fecha<="+fecha2+" AND sede="+sede+ "AND forma_pago="+tipo;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               int i = 1; 
               num_credito.add(Integer.parseInt(rs.getString(i)));
               i +=1;         

                System.out.println(num_credito);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        
        return num_credito;
    }

    public ArrayList<Integer> consultar_num_efectivo(String fecha1, String fecha2, String sedes) {
        
        ArrayList<Integer> num_efectivo = new ArrayList<>();
        String tipo = "'"+"Efectivo"+ "'";
        String sede = "'"+sedes+"'";
        try {
            ResultSet rs = null;
            Bd_pqr pq = new Bd_pqr();
            con = pq.conectar();
            stmt = con.createStatement();
            
            String query = "SELECT COUNT(id_envio) FROM envio WHERE fecha>="+fecha1+" AND fecha<="+fecha2+" AND sede="+sede+ "AND forma_pago="+tipo;

            rs = stmt.executeQuery(query);
            while (rs.next()) {

               int i = 1; 
               num_efectivo.add(Integer.parseInt(rs.getString(i)));
               i +=1;         

                System.out.println(num_efectivo);

            }

            stmt.close();
            con.close();

        } catch (SQLException e) {
            System.out.println(e);

        }
        
        return num_efectivo;
    }
    
}
