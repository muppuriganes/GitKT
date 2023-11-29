import java.io.*;

public class IO5 {
    public static void main(String[] args) {
        String inputFile = "C://Users//Harshavi//OneDrive//Desktop//lol.txt";
        String outputFile = "C://Users//Harshavi//OneDrive//Desktop//lol2.txt";

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile))) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line);
                writer.newLine(); // Add a newline character after each line
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

