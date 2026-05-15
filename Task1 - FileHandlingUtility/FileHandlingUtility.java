Task 1 files
import java.io.*;

public class FileHandlingUtility {
    public static void main(String[] args) {
        try {

            FileWriter writer = new FileWriter("sample.txt");
            writer.write("Hello, this is CODTECH Internship Task 1.\n");
            writer.write("Learning File Handling in Java.");
            writer.close();

            System.out.println("Data written successfully.\n");

            BufferedReader reader = new BufferedReader(new FileReader("sample.txt"));

            String line;

            System.out.println("Reading File:\n");

            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }

            reader.close();

        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
