
package ejercicio04;

public class Test {
    
    public static void main(String[] args)
    {
        Ecuacion ecuacion = new Ecuacion(1, 4, -4);
        
        
        System.out.println(ecuacion.calcularDiscriminante());
        
        ecuacion.calcularSoluciones();
        
        System.out.println("Raiz uno: "+ecuacion.solucionUno());
        
        System.out.println("Raiz dos: "+ecuacion.solucionDos());
    }
}
