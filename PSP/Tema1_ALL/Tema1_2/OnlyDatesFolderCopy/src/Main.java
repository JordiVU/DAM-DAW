//Proyecto creado por Jordi Vázquez Uribe

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class Main {
    public static final String FOLDER = "fechas/";
    public static final String FOLDER_COPY = "Dates/";
    
        public static void copyFiles()
        {
            String r = ".*\\d{2}/\\d{2}/(\\d{2}|\\d{4}).*";
            File[] files = Paths.get(FOLDER).toFile().listFiles();

            //Leemos uno por uno los archivos de la carpeta.
            for(File f : files) {
                boolean empty = true; //Declaramos que no hay ninguna fecha en el archivo.
                if(f.isFile()) {
                    try (RegexReader buffer =
                                 new RegexReader(new FileReader(f), r)) {
                        String line;
                        while ((line = buffer.readLine()) != null) {
                            empty = false; //Si ha encontrado una fecha en el archivo.
                        }
                        // Si el archivo contiene una fecha lo copiamos.
                        if(!empty)
                        {
                            Files.copy(f.toPath(), Paths.get(FOLDER_COPY + f.getName()), StandardCopyOption.REPLACE_EXISTING);
                            System.out.println(f.getName() + " copiado.     ");
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        public static void createFolder()
        {
            try {
                // Si la carpeta no exite la creamos.
                if (!Files.exists(Paths.get(FOLDER_COPY))) {
                    Files.createDirectory(Paths.get(FOLDER_COPY));
                }
                // Si la carpeta existe borramos los ficheros que tenga.
                else
                {
                    File[] oldFiles = Paths.get(FOLDER_COPY).toFile().listFiles();
                    for(File f : oldFiles)
                    {
                        if(f.isFile())
                        {
                            f.delete();
                        }
                    }
                }
            }
            catch (IOException e)
            {
                System.out.println(e);
            }
        }

        public static void main(String[] args) {
            createFolder();
            copyFiles();
        }
    }
