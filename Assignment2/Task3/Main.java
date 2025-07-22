
import java.io.*;

public class Main {
    public static void main(String[] args) {
        String filePath = "C:/Users/aayus/OneDrive/Desktop/Summer25/OOPs/Assignment2/Task3/input.txt";


        int lineCount = 0, wordCount = 0, charCount = 0;

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                lineCount++;
                String[] words = line.trim().split("\\s+");
                wordCount += words.length;
                charCount += line.length();
            }

            System.out.println("Number of lines: " + lineCount);
            System.out.println("Number of words: " + wordCount);
            System.out.println("Number of characters: " + charCount);

        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}
