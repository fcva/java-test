
package ejercicio05;

import javax.swing.JOptionPane;

/**
 * @author fcva
 */
public class Alumnos3 {
    
    private Alumno[] alumnos;
    
    private int contador;
    
    public Alumnos3()
    {
        this.alumnos = new Alumno[2];
        
        this.contador = 0;
    }
    
    public int size()
    {
        return this.alumnos.length;
    }
    
    public void agregarAlumnos()
    {
        int codigo;
        
        String nombre;
        
        while(this.contador < this.alumnos.length)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
            nombre = JOptionPane.showInputDialog("Ingrese nombre: ");

            Alumno alumno = new Alumno(codigo, nombre);
            
            this.alumnos[this.contador] = alumno;
            
            this.contador++;
        }
    }
    
    public void listarAlumno()
    {
        for (int i = 0; i < this.alumnos.length; i++) {
            
            System.out.println("Codigo: "+this.alumnos[i].getCodigo()+" Nombre: "+this.alumnos[i].getNombre());
        }
    }
    
    public static void main(String[] args)
    {
        Alumnos3 alumnos3 = new Alumnos3();
        
        alumnos3.agregarAlumnos();
        
        alumnos3.listarAlumno();
        
        //System.out.println("Size: "+alumnos3.size());
    }
}
