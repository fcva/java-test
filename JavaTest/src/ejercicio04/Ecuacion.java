
package ejercicio04;

public class Ecuacion {
    
    private double a;
    
    private double b;
    
    private double c;
    
    public Ecuacion(double a, double b, double c)
    {
        this.a = a;
        
        this.b = b;
        
        this.c = c;
    }
    
    public double obtenerA()
    {
        return this.a;
    }
    
    public double obtenerB()
    {
        return this.b;
    }
    
    public double obtenerC()
    {
        return this.c;
    }
    
    public double calcularDiscriminante()
    {
        float discriminante;
        
        discriminante = (float) ((Math.pow(this.b, 2)) - (4*this.a*this.c));
        
        return discriminante;
    }
    
    public void calcularSoluciones()
    {
        if (this.calcularDiscriminante() > 0) {
            
            System.out.println("hay dos soluciones distintas");
            
        } else if (this.calcularDiscriminante() == 0) {
            
            System.out.println("hay dos soluciones iguales");
            
        }else if(this.calcularDiscriminante() < 0){
            
            System.out.println("Soluciones complejas");
        }
    }
    
    public double solucionUno()
    {
        float raiz;
        
        raiz = (float) (((-this.b) - (Math.sqrt(this.calcularDiscriminante())))/2*this.a);
        
        return raiz;
    }
    
    public double solucionDos()
    {
        float raiz;
        
        raiz = (float) (((-this.b) + (Math.sqrt(this.calcularDiscriminante())) )/2*this.a);
        
        return raiz;
    }
}
