import java.io.FileWriter;
import java.io.IOException;
import java.io.BufferedWriter;

public class Task3 {
    public static void main(String[] args) {
        String filePath = "D://Test.txt";
        String additionalContent = "This is additional content that we want to add.";

        try {
            // Create a FileWriter in append mode by setting the second parameter to true.
            FileWriter fileWriter = new FileWriter(filePath, true);
            BufferedWriter writer = new BufferedWriter(fileWriter);

            // Write the additional content to the file.
            writer.write(additionalContent);
            writer.newLine(); // Add a newline for separation (optional).x

            writer.close();
            fileWriter.close();
            System.out.println("Content added to the file successfully.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}
