import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        // Specify the file paths
        String json_FilePath = "D://json.txt";
        String xml_FilePath = "D://files.xml";

        try {
            // Read and print the content of the JSON file
            System.out.println("JSON File Contents:");
            printFileContent(json_FilePath);

            // Read and print the content of the XML file
            System.out.println("XML File Contents:");
            printFileContent(xml_FilePath);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void printFileContent(String filePath) throws IOException {
        File file = new File(filePath);
        if (file.exists()) {
            try (Scanner scanner = new Scanner(file)) {
                while (scanner.hasNextLine()) {
                    System.out.println(scanner.nextLine());
                }

            }
            
        } else {
            System.out.println("File not found: " + filePath);
        }
        
    }
}
