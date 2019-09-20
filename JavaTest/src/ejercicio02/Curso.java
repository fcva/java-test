
package ejercicio02;

import java.util.Scanner;

public class Curso {
    
    private String nombreCurso;
    
    public Curso(String curso)
    {
        nombreCurso = curso;
    }
    
    public void establecerNombreCurso(String nombre)
    {
        nombreCurso = nombre;
    }
    
    public String obtenerNombreCurso()
    {
        return nombreCurso;
    }
    
    public void mostrarDatos()
    {
        System.out.println("Curso: "+obtenerNombreCurso());
    }
    
    public void notas()
    {   
        int total = 0;
        
        int contador = 1;
        
        int nota;
        
        int promedio;
        
        Scanner input = new Scanner( System.in );
        
        while(contador <= 3)
        {
            System.out.print("Ingrese Notas: ");
            
            nota = input.nextInt();
            
            total = total + nota;
            
            contador = contador + 1;
        }
        
        promedio = total/10;
        
        System.out.printf( "\nTotal of all 10 grades is %d\n", total);
        System.out.printf( "Class average is %d\n", promedio);
    }
    
    public void calcularPromedio()
    {
        Scanner input = new Scanner( System.in );
        
        int total = 0;
        
        int contador = 1;
        
        int grado;
        
        int promedio;
        
        while (contador <= 10) {
            
            System.out.print("Ingrese grado: ");
            
            grado = input.nextInt();
            
            total = total + grado;
            
            contador = contador + 1;
        }
        
        promedio = total/10;
        
        System.out.printf( "\nTotal of all 10 grades is %d\n", total);
        System.out.printf( "Class average is %d\n", promedio);
    }
}
