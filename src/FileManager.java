import java.io.*;
import java.util.ArrayList;

public class FileManager {

    public static void saveData(ArrayList<String> data, String fileName) {

        try (FileWriter writer = new FileWriter("../data/" + fileName)) {

            for (String item : data) {
                writer.write(item + "\n");
            }

            System.out.println("Data saved successfully.");

        } catch (IOException e) {
            System.out.println("Error while saving data: " + e.getMessage());
        }
    }

    public static ArrayList<String> loadData(String fileName) {

        ArrayList<String> data = new ArrayList<>();

        try (BufferedReader reader =
                     new BufferedReader(new FileReader("../data/" + fileName))) {

            String line;

            while ((line = reader.readLine()) != null) {
                data.add(line);
            }

        } catch (IOException e) {
            System.out.println("No previous data found.");
        }

        return data;
    }
}