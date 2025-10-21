import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class RegexReader extends BufferedReader {
    protected String regex;

    public RegexReader(FileReader reader, String regex) {
        super(reader);
        this.regex = regex;
    }

    public String readLine() throws IOException {
        String line;
        for(line = super.readLine(); line != null && !line.matches(this.regex); line = super.readLine()) {
        }

        return line;
    }
}