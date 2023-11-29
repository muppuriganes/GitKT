import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Task4{
    public static void main(String[] args) {
        // Specify the path to the file you want to search in.
        String filePath = "D://Test.txt";
        // Specify the word you want to search for.
        String searchWord = "hello";

        int wordCount = 0;

        try {
            // Open the file for reading.
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);

            String line;
            while ((line = reader.readLine()) != null) {
                // Split the line into words using whitespace as a delimiter.
                String[] words = line.split("\\s+");
                for (String word : words) {
                    // Check if the word matches the search word (case-sensitive).
                    if (word.equals(searchWord)) {
                        wordCount++;
                    }
                }
            }

            reader.close();

            System.out.println("The word '" + searchWord + "' appears " + wordCount + " times in the file.");
        } catch (IOException e) {
            System.err.println("An error occurred: " + e.getMessage());
        }
    }
}

