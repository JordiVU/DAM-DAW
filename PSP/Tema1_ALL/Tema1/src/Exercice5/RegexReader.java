package Exercice5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class RegexReader extends BufferedReader {
    protected String regex;

    public RegexReader(FileReader reader, String regex)
    {
        super(reader);
        this.regex = regex;
    }
    @Override
    public String readLine() throws IOException {
        String line = super.readLine();

        while (line != null && !line.matches(regex))
        {
            line = super.readLine();
        }
        return line;
    }
}


