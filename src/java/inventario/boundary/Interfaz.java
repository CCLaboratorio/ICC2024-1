package inventario.boundary;

import inventario.entity.Usuario;
import java.util.Scanner;
/**
 *
 *
 */
public class Interfaz {


    private final Usuario[] usuarios;
    private Menu menuPrincipal; // contiene el CRUD
    private Menu menuSecundario1; // para validar credenciales
    private Menu menuSecundario2; // para regresar a menú principal
    private Producto producto;
    private final String mensajeBienvenida;
    private final String[] mensajesError;

    /**
     * Constructor
     */
    public Interfaz() {
	// Inicializamos las variables de la interfaz;
	
    }

    /**
     * Validación de credenciales de usuario
     */
    public boolean esUsuarioValido(String nombre, String contrasenia) {
	return usuario1.getContrasenia().equals(contrasenia);
    }

    /**
     * Procesamos la opcion de acuerdo al menú especificado en la interfaz
     */
    public void procesaOpcion(int opcion) {

	/* Usamos una estructura de casos para seleccionar el manejo
	   de la opción */
	// Casos
	// 1. Crear
	      // Mostrar el resultado de la operación

	// 2. Consultar

	// ...

	// 5. Salir

	
    }

    /**
     *
     */
    public static void main(String[] args) {
	// Declaración de variables para captura de información
	Interfaz ui = new Interfaz();
	Scanner sc = new Scanner(System.in);
	int opcion;
	String nombre; // Nombre de usuario para inicio de sesión
	String contrasenia;

	inicializaInterfaz();
	
	//Mostramos el mensaje de bienvenida

	do {
	    //leer credenciales

	    //mostrar menú secundario
	    
	} while(!esUsuarioValido(nombre, contrasenia));

	do {
	    // mostrar el menú principal (toString)

	    // leer la opción

	    // procesar la opción

	    // mostrar un menú secundario
	} while (!opcion.equals(5));
    }

}
