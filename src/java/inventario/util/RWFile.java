package inventario.util;

import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.io.File;
import java.io.FileNotFoundException;

public class RWFile {



    public RWFile(){}


    public List<String[]> process(String path) throws FileNotFoundException {
	
	File file = new File(path);
	Scanner sc = new Scanner(file);
	List<String[]> tokens = new ArrayList<>(); 

	System.out.println("Se comienza a procesar el archivo...");
	
	
	return tokens;
    }

    public static void main(String[] args) {
	RWFile rw = new RWFile();

	try {
	rw.process("");

	} catch (FileNotFoundException e) {
	    System.out.println("Archivo no encontrado.");
	}
    }

}
