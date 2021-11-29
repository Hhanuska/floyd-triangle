import java.io.FileWriter;
import java.io.IOException;

public class FileHandler {
    public static void writeToFile(String text, String fileName) throws IOException {
        FileWriter writer = new FileWriter(fileName);
        writer.write(text);
        writer.close();
    }
}
