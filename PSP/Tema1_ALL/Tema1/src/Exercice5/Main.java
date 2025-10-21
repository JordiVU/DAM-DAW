package Exercice5;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String Args[]) {

        String r = ".*\\d{2}/\\d{2}/(\\d{2}|\\d{4}).*";

        for(int i = 0; i < files.length; i++) {
            try (RegexReader buffer =
                         new RegexReader(new FileReader(files), r)) {
                String line;
                while ((line = buffer.readLine()) != null) {
                    System.out.println(line);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}