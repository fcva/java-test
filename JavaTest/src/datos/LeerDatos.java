/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

/**
 *
 * @author fva
 */
public class LeerDatos {
    
    public static String leerString()
    {
        String cadena = null;
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Ingrese datos de tipo String:");
        
        try {
            
            cadena = entrada.readLine();
            
        } catch (IOException ex) {
            
            System.out.println(ex);
        }
        
        //System.out.println(cadena);
        
        return cadena;
    }
    
    public static int leerInt()
    {
        String cadena = leerString();
        
        System.out.print("Ingrese datos de tipo Int:");
        
        try {
        
            return Integer.parseInt(leerString());
                    
        } catch (Exception e) {
            
            System.out.println(e);
            
            return leerInt();
        }
    }
    
    public static void mostrarInformacion(String mensaje) {
        
        JOptionPane.showMessageDialog(null, mensaje, "Información", JOptionPane.INFORMATION_MESSAGE);
    }
}
