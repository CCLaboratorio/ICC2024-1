package teoria;

import teoria.version3.Producto;

/**
 * Esta clase tiene como objetivo ser de uso 
 * para las pruebas generales de objetos vistos y
 * desarrolados en la teoría.
 */
public class Main {
    
    /**
     * Método que busca la JVM para ejecutar la app
     */
    public static void main(String[] args) {
	Producto p1 = new Producto();

	p1.setNombre("chocolate abuelita");
	p1.setTipo('b');

	System.out.println("El nombre del producto p1 es: " + p1.getNombre());
	System.out.println("El tipo del producto p1 es :" + p1.getTipo());
    }
}
