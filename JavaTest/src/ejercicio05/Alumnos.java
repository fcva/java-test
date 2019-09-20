
package ejercicio05;

import javax.swing.JOptionPane;

public class Alumnos {
    
    private Alumno[] alumnos;
    
    private int contador;
    
    public Alumnos()
    {
        this.alumnos = new Alumno[3];
        
        this.contador = 0;
    }
    
    public void agregarAlumno(int codigo, String nombre)
    {        
        this.alumnos[this.contador] = new Alumno(codigo, nombre);
        
        this.contador++;
        
        /*int codigo;
        
        String nombre;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo: "));
        
        nombre = JOptionPane.showInputDialog("Ingrese Nombre: ");
        
        Alumno alumno = new Alumno();
        
        alumno.setCodigo(codigo);
        
        alumno.setNombre(nombre);
        
        this.alumnos[this.contador] = alumno;
        
        this.contador++;*/
    }
    
    public Alumno[] listarAlumno()
    {
        return this.alumnos;
        
        /*for(int i=0; i<this.contador; i++)
        {
            return this.alumnos[i].getCodigo();
        }*/
    }
    
    public void listar()
    {
        for(int i=0; i<this.contador; i++)
        {
            //this.alumnos[i].getCodigo();
            System.out.println(this.alumnos[i].getCodigo()+" "+this.alumnos[i].getNombre());
        }
    }
    
    public static void main(String[] args)
    {
        
        Alumnos alumnos = new Alumnos();
        
        int codigo;
        
        String nombre;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese código: "));
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre:");
        
        alumnos.agregarAlumno(codigo, nombre);
        
        //alumnos.agregarAlumno(124, "Patricia");
        
        //alumnos.agregarAlumno(125, "Renzo");
        
        alumnos.listar();
        
        /*for(Alumno a: alumnos.listarAlumno())
        {
            System.out.println("Codigo: "+a.getCodigo());
            
            System.out.println("Nombres: "+a.getNombre());
        }*/
        
        /*Alumnos alumnos = new Alumnos();
        
        alumnos.agregarAlumno();
        
        for(Alumno a: alumnos.listarAlumno())
        {
            System.out.println("Codigo: "+a.getCodigo());
            
            System.out.println("Nombres: "+a.getNombre());
        }*/
    }
}
