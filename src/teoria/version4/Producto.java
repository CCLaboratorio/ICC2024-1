package teoria.version4;

/**
 * Creación de la entidad producto, 
 * surge del problema de llevar un inventario 
 * en un almacén ya se incluyen constructores.
 */
public class Producto {

    private String nombre;
    private float precio;
    private char tipo;

    /**
     *
     */
    public Producto() {
	nombre = "chocolatoso";
	precio = 10.50;
	tipo = 'b';
    }

    // Incluye el constructor que recibe parámetros
    
   /**
     * Método para modificar el nombre.
     */
    public void setNombre(String n) {
	nombre = n;
    }

    /**
     * Método para acceder al nombre;
     */
    public String getNombre() {
	return nombre;
    }

    // Coméntame...
    public void setTipo(char t) {
	tipo = t;
    }

    // Coméntame...
    public char getTipo() {
	return tipo;
    }

}
