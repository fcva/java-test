
package ejercicio06;

public class Alumno {
    
    private int codigo;
    
    private String nombres;
    
    public Alumno()
    {
        
    }
    
    public Alumno(int codigo, String nombres)
    {
        this.codigo = codigo;
        
        this.nombres = nombres;
    }

    /**
     * @return the codigo
     */
    public int getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the nombres
     */
    public String getNombres() {
        return nombres;
    }

    /**
     * @param nombres the nombres to set
     */
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
}
