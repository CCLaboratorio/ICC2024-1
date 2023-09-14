package ui; //paquete al que pertenece la clase

//importación de otros paquetes
import java.util.Scanner;

/**
 *
 * ¿Para qué sirve la clase?
 * Propósito de la clase
 */
public class Menu {
    public static void init() {
	System.out.println("Bienvenido, la siguiente aplicación te permite"
			   +" calcular el área de diferentes figuras.\n");
    }
    public static void muestraMenu() {
	System.out.println("Seleciona entre las siguientes opciones,"
			   +"ingresa el número correspondiente:"
			   + "\n\t1. Cuadrado"
			   + "\n\t2. Triángulo"
			   + "\n\t3. Salir");
    }
    
    /**
     *
     * Método que busca la JVM para ejecutar nuestra aplicación
     */
    public static void main(String[] args) {
	// Impleméntame
	Scanner sc = new Scanner(System.in);
	double base;
	double altura;
	double area;
	int opcion;

	init();
	muestraMenu();
	System.out.print("Ingresa una opción: ");
	opcion = sc.nextInt();

	// Pedir base y altura.
	
	// Calculamos el área
	area = <condición>? <si> : <no> ;
    }  
}
