
package ejercicio05;

import javax.swing.JOptionPane;

/**
 * @author fcva
 */
public class Alumnos2 {
    
    private Alumno[] alumnos;
    
    private int contador;
    
    public Alumnos2()
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
        
        /*while(this.contador < this.alumnos.length)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
            nombre = JOptionPane.showInputDialog("Ingrese nombre: ");

            Alumno alumno = new Alumno();

            alumno.setCodigo(codigo);

            alumno.setNombre(nombre);

            this.alumnos[this.contador] = alumno;

            this.contador++;
        }*/
        
        /*for(int i=0; i<this.alumnos.length; i++)
        {
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
            nombre = JOptionPane.showInputDialog("Ingrese nombre: ");

            Alumno alumno = new Alumno();

            alumno.setCodigo(codigo);

            alumno.setNombre(nombre);

            this.alumnos[this.contador] = alumno;
            
            this.contador++;
        }*/
        
        do{
            
            codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
            nombre = JOptionPane.showInputDialog("Ingrese nombre: ");

            Alumno alumno = new Alumno();

            alumno.setCodigo(codigo);

            alumno.setNombre(nombre);

            this.alumnos[this.contador] = alumno;
            
            this.contador++;
            
        }while(this.contador < this.alumnos.length);
    }
    
    public void listarAlumno()
    {
        for (int i = 0; i < this.alumnos.length; i++) {
            
            System.out.println("Codigo: "+this.alumnos[i].getCodigo()+" Nombre: "+this.alumnos[i].getNombre());
        }
    }
    
    public static void main(String[] args)
    {
        Alumnos2 alumnos2 = new Alumnos2();
        
        //alumnos2.agregarAlumnos();
        
        //alumnos2.listarAlumno();
        
        System.out.println("Size: "+alumnos2.size());
    }
    
}
