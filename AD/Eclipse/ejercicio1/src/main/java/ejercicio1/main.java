package ejercicio1;

import java.io.File;

public class main {
    public static void main(String[] args) {
    	
        if (args.length == 0) {
            System.out.println("Por favor, introduce la ruta de una carpeta como argumento.");
            return;
        }

        String ruta = args[0];
        File carpeta = new File(ruta);

        if (!carpeta.exists() || !carpeta.isDirectory()) {
            System.out.println("La ruta proporcionada no es válida o no es una carpeta.");
            return;
        }

        File[] archivos = carpeta.listFiles();
        if (archivos != null) {
            for (File archivo : archivos) {
                if (archivo.isFile()) {
                    System.out.println("Archivo: " + archivo.getName());
                } else if (archivo.isDirectory()) {
                    System.out.println("Carpeta: " + archivo.getName());
                }
            }
        }
    }
}
