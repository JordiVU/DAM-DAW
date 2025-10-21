package Exercice6;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {

    public static void main(String Args[]) {
        try {
            if (!Files.exists(Paths.get("copy"))) {
                Files.createDirectory(Paths.get("copy"));
            }

            File[] archivos = Paths.get("copy").toFile().listFiles();
            for(File archivo : archivos)
            {
                if(archivo.isFile())
                {
                    archivo.delete();
                }
            }

            Files.copy(Paths.get("file1.txt"),
                    Paths.get("copy/file1_copy.txt"),
                    StandardCopyOption.REPLACE_EXISTING);
        }
        catch (IOException e)
        {
            System.out.println(e);
        }
    }
}