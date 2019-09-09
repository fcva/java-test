/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author fva
 */
public class LeerDatos {
    
    public static String leeString()
    {
        String cadena = "";
        
        BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Ingrese datos de tipo String:");
        
        try {
            
            cadena = entrada.readLine();
            
        } catch (IOException ex) {
            
            System.out.println(ex);
        }
        
        System.out.println("Datos ingresado: "+cadena);
        
        return cadena;
    }
}
