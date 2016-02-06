/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logica;
import com.itextpdf.text.BaseColor;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.FileNotFoundException;
import javax.swing.JOptionPane;

/**
 *
 * @author natha9404
 */
public class Generar_pdf {
    
 
public void ConvertirPDF(String nombre, String nombre2, String cedula, String cedula2,
String direccion, String direccion2, String telefono, String telefono2,
String sede, String tipo, String observacion, int peso, int declaracion_precio,
int precio_neto, int precio_seguro, int precio_impuesto, int total_envio,
String forma_pago) throws FileNotFoundException
    {
        String nombre_pdf = "/Documentos/Factura.pdf";
        System.out.println(nombre_pdf);
        try
        {
            //Creamos documento indicando el tamaño y margenes
            Document documento=new Document(PageSize.LETTER,20,20,20,20);
            
            //Creamos el PDF y lo instanceamos para poder escribir sobre el
            PdfWriter.getInstance(documento, new FileOutputStream(nombre)).setInitialLeading(20);
            
            //Abrimos el documento
            documento.open();
            System.out.println("Documento Abierto");
            
            //Anexamos el texto a un objeto Pharagraph
            Paragraph parametro=new Paragraph("Factura Envio de Paquete",FontFactory.getFont(FontFactory.TIMES_ROMAN,14,Font.BOLD, BaseColor.BLACK));
            parametro.setAlignment(1);    
            Paragraph parametro2 = new Paragraph("Datos Remitente",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD, BaseColor.BLACK));
            Paragraph parametro3 = new Paragraph("Nombre: "+nombre+"        Telefono: "+telefono,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro4 = new Paragraph("Cedula: "+cedula+"        Dirección: "+direccion,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro5 = new Paragraph("Datos Destinatario",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD, BaseColor.BLACK));
            Paragraph parametro6 = new Paragraph("Nombre: "+nombre2+"        Telefono: "+telefono2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro7 = new Paragraph("Cedula: "+cedula2+"        Dirección: "+direccion2,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));

            Paragraph parametro8 = new Paragraph("Datos Envio",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD, BaseColor.BLACK));
            Paragraph parametro9 = new Paragraph("Tipo de Envio: "+tipo+"        Observación: "+observacion,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro10 = new Paragraph("Peso: "+peso+"        Declaración precio Envio: "+declaracion_precio,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro11 = new Paragraph("Datos Pago",FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.BOLD, BaseColor.BLACK));
            Paragraph parametro12 = new Paragraph("Precio de Envio Neto: "+precio_neto,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro13 = new Paragraph("Precio Seguro:  "+precio_seguro,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro14 = new Paragraph("Excedente Impuesto:  "+precio_impuesto,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro15 = new Paragraph("Total Envio:  "+total_envio,FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            Paragraph parametro16 = new Paragraph("Forma de Pago:  "+forma_pago, FontFactory.getFont(FontFactory.TIMES_ROMAN,12,Font.NORMAL, BaseColor.BLACK));
            
//Escribimos sobre el
            documento.add(parametro);
            documento.add(parametro2);
            documento.add(parametro3);
            documento.add(parametro4);
            documento.add(parametro5);
            documento.add(parametro6);
            documento.add(parametro7);
            documento.add(parametro8);
            documento.add(parametro9);
            documento.add(parametro10);
            documento.add(parametro11);
            documento.add(parametro12);
            documento.add(parametro13);
            documento.add(parametro14);
            documento.add(parametro15);
            documento.add(parametro16);
            
            
            //Cerrar documento
            documento.close();
            
            //Mensaje de Exito
            JOptionPane.showMessageDialog(null,"PDF Creado con exito.");
            
            
           
            
        }
        catch(DocumentException de)
        {
            System.out.println("Error...");
        }
       
    }
    
    
    
    
    
}
