
package ejercicio02;

import java.util.Scanner;

public class Curso2 {
    
    private String nombre;
    
    private int notas;
    
    public void establecerNombre(String nombre)
    {
        this.nombre = nombre;
    }
    
    public String obtenerNombre()
    {
        return this.nombre;
    }
    
    public void notas()
    {
        int total = 0;
        
        int contador = 0;
        
        int promedio;
        
        Scanner entrada = new Scanner(System.in);
        
        while (contador < 3) {
            
            System.out.print("Ingrese Notas: ");
            
            this.notas = entrada.nextInt();
            
            total = total + this.notas;
            
            contador = contador + 1;
        }
        
        promedio = total/3;
        
        System.out.printf( "\n Suma total de las notas: %d\n", total);
        System.out.printf( " Promedio: %d\n", promedio);
    }
    
    public static void main(String[] args)
    {
        Curso2 curso2 = new Curso2();
        
        curso2.establecerNombre("Programacion");
        
        System.out.println("Curso:"+curso2.obtenerNombre());
        
        curso2.notas();
    }
}
