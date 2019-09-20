/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio06;

import java.util.Scanner;

/**
 *
 * @author fva
 */
public class Test {
    
    public static void main(String[] args)
    {
        
        Alumno a = new Alumno();
        
        //a.setCodigo(100);
        
        //a.setCodigo(101);
        
        Scanner entrada = new Scanner(System.in);
        
        Alumno[] alumno = new Alumno[2];
        
        int codigo = 0;
        
        String nombres = "";
        
        int i;
        
        for(i=0; i<alumno.length; i++)
        {
            System.out.println("Ingrese codigo: ");
            
            codigo = entrada.nextInt();
            
            //alumno[i].setCodigo(codigo);
            
            System.out.println("Ingrese nombres: ");
            
            nombres = entrada.nextLine();
            
            //alumno[i].setNombres(nombres);
            
            //System.out.println(alumno[i].getNombres());
            
            entrada.nextLine();
            
            alumno[i] = new Alumno(codigo, nombres);
            
            //System.out.println(alumno[i].getCodigo());
            
            //System.out.println(alumno[i].getNombres());
        }
        
        for(i=0; i<alumno.length; i++)
        {   
            System.out.println("Datos de los alumnos: "+i);
            
            //System.out.println("Codigo: "+alumno[i].getCodigo()+" Nombres: "+alumno[i].getNombres());
        
            System.out.println("Nombres: "+alumno[i].getNombres());
        }
        
        
        /*Scanner entrada = new Scanner(System.in);
        
        Alumno alumno = new Alumno();
        
        System.out.println("Ingrese Datos: ");
        
        int codigo;
        
        String nombres;
        
        codigo = entrada.nextInt();
        
        nombres = entrada.nextLine();
        
        
        alumno.setCodigo(codigo);
        
        alumno.setNombres(nombres);
        
        System.out.println("Nombre: "+alumno.getCodigo());
        
        System.out.println("Nombre: "+alumno.getNombres());*/
    }
}
