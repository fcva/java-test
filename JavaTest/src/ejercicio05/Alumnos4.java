
package ejercicio05;

import javax.swing.JOptionPane;

/**
 *
 * @author fva
 */
public class Alumnos4 {
    
    private Alumno[] alumnos;
    
    private int contador;
    
    public Alumnos4()
    {
        this.alumnos = new Alumno[2];
        
        this.contador = 0;
    }
    
    public int size()
    {
        return this.alumnos.length;
    }
    
    public void agregarAlumnos(Alumno alumno)
    {
        this.alumnos[this.contador] = alumno;
        
        this.contador++;
    }
    
    public Alumno[] listarAlumnos()
    {
        return this.alumnos;
    }
    
    public static void main(String[] args)
    {
        Alumnos4 alumnos4 = new Alumnos4();
        
        int codigo;
        
        String nombre;
        
        for (int i = 0; i < alumnos4.size(); i++) {
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
            nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
            
            alumnos4.agregarAlumnos(new Alumno(codigo, nombre));
        }
        
        for (Alumno a: alumnos4.listarAlumnos()) 
        {
            System.out.println("Codigo: "+a.getCodigo()+" Nombre: "+a.getNombre());
        }
    }
}
