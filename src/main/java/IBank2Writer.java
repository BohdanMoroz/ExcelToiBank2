import java.io.IOException;
import java.io.PrintWriter;

public class IBank2Writer {
    private String text;
    private PrintWriter writer;
    private String fileName = "./src/main/resources/test.txt";
    private String encoding = "UTF-8";

    public IBank2Writer(String text) throws IOException{
        this.text = text;
        writer = new PrintWriter( fileName, encoding);
    }

    public void saveDoc() {
        writer.println(text);
        writer.close();
    }
}
