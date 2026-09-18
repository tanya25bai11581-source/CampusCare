import java.io.FileWriter;
import java.io.IOException;

public class DataExporter {

    public static void export(String message, String fileName) {

        try {
            FileWriter writer =
                    new FileWriter("../data/" + fileName, true);

            writer.write(message + "\n");
            writer.close();

            System.out.println("Data saved to file successfully.");

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}