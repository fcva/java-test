
package ejercicio06;

import javax.swing.JOptionPane;

/**
 * @author fcva
 */
public class AlumnoController {
   
    public Alumno[] alumno;
    
    private int numAlumnos;
    
    public AlumnoController()
    {
        alumno = new Alumno[2];
        
        numAlumnos = 0;
    }
    
    public void ingresarAlumnos()
    {
        int cod;
        
        String nom;
        
        int i=0;
        
        do{
            
            cod = datos.LeerDatos.leerInt();
            
            nom = datos.LeerDatos.leerString();
            
            Alumno a = new Alumno();
            
            a.setCodigo(cod);
            
            a.setNombres(nom);
            
            alumno[numAlumnos] = a;
            
            numAlumnos++;
            
        }while(i < 2);
    }
    
    public void mostrarAlumnos()
    {
        String listarDatos = "";
        
        for(int i=0; i<numAlumnos; i++)
        {
            listarDatos = listarDatos + alumno[i].getCodigo()+" "+alumno[i].getNombres()+"\n";
        }
        
        System.out.println(listarDatos);
    }
    
    public void agregarAlumnos(Alumno alumno)
    {
        this.alumno[numAlumnos] = alumno;
        
        numAlumnos++;
    }
    
    public Alumno[] mostrar()
    {
        return this.alumno;
    }
    
    public static void main(String[] args)
    {
        /*AlumnoController ac = new AlumnoController();
        
        ac.ingresarAlumnos();
        
        ac.mostrarAlumnos();*/
        
        /*int codigo;
        
        String nombre;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo: "));
        
        nombre = JOptionPane.showInputDialog("Ingrese nombre: ");
        
        System.out.println("Código: "+codigo);
        
        System.out.println("Mombre: "+nombre);*/
        
        //AlumnoController ac = new AlumnoController();
        
        //ac.agregarAlumnos(new Alumno(0, nombres));
        
        Alumno a = new Alumno();
        
        int codigo;
        
        String nombres;
        
        codigo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese codigo: "));
        
        a.setCodigo(codigo);
        
        nombres = JOptionPane.showInputDialog("Ingrese Nombres: ");
        
        a.setNombres(nombres);
        
        System.out.println("Código: "+codigo);
        
        System.out.println("Nombres: "+nombres);
    }
}
