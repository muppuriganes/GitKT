import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

public class Task1 {
    public static void main(String[] args) {
        String sourceFolder = "D://SourceFile";
        String destinationFolder = "D://DestinationFile";

        // Create File objects for folders
        File sourceDir = new File(sourceFolder);
        File destinationDir = new File(destinationFolder);

        // Check if the source folder exists
        if (!sourceDir.exists() || !sourceDir.isDirectory()) {
            System.out.println("Source folder does not exist or is not a directory.");
            return;
        }

        // Create the destination folder if it doesn't exist
        if (!destinationDir.exists()) {
            destinationDir.mkdirs();
        }

        // List all files in the source folder
        File[] files = sourceDir.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    // Copy the file to the destination folder
                    File destinationFile = new File(destinationDir, file.getName());
                    try {
                        Files.copy(file.toPath(), destinationFile.toPath());
                        System.out.println("Copied " + file.getName() + " to " + destinationFile.getAbsolutePath());
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

        System.out.println("Copy process complete.");
    }
}
