package inventario.util;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;


public class RWFile {



    public RWFile(){}


    public List<String[]> process(String ruta) {
	File archivo = new File(ruta);
	Scanner sc = new Scanner(archivo);
	List<String[]> elementos = new ArrayList<>(); 

	System.out.println("Se comienza a procesar el archivo...");
	
	
	return elementos;
    }

    public static void main(String[] args) {
	RWFile rw = new RWFile();

	rw.process("");
    }

}
