package inventario.boundary;

/**
 * COMÉNTAME ...
 * ¿Para qué sirve la clase?
 * Propósito de la clase
 */
public class Menu {

    private String[] opciones;
    private String instrucciones;
    private String strMenu;

    /**
     * Se presupone que las opciones son de tipo entero
     */
    public Menu(String[] opciones) {

	this.opciones = opciones;
	this.instrucciones = "....";
	
	// Dadas las opciones crear la visualización en cadena
	// del menú y guardarla en strMenu
	// usamos un ciclo sobre la longitud de opciones

    }

    /**
     * Las opciones de este menú se personalizan.
     * En las instrucciones se incluye el valor para cada opción.
     */
    public Menu(String[] opciones, String instrucciones) {
	this.opciones = opciones;
	this.instrucciones = instrucciones;

	// ciclo para crear la visualización del menú.
    }

    @Override
    public String toString() {
	return instrucciones + "\n" + strMenu;
    }
}
