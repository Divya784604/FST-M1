package Activities;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Activity14 {
    public static void main(String[] args) {
        try {
            File file = new File("example.txt");
            boolean fStatus = file.createNewFile();

            if (fStatus) {
                System.out.println("File created successfully: " + file.getName());
            } else {
                System.out.println("File already exists.");
            }
            FileWriter writer = new FileWriter(file);
            writer.write("This is some sample text written to the file.\n");
            writer.write("File I/O operations using Java's File and FileWriter classes.");
            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
