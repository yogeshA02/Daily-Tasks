// import java.io.*;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;


public class FileCRUD {

    // Method to create a new file using the createNewFile() method
    public static void createFile(String fileName) 
    {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) 
            {
                System.out.println("File created: " + file.getName());
            } 
            else 
            {
                System.out.println("File already exists.");
            }
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to read from a file 
    public static void readFile(String fileName) 
    {
        try {
            File file = new File(fileName);
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            System.out.println("Contents of " + fileName + ":");

            while ((line = br.readLine()) != null) 
            {
                System.out.println(line);
            }
            br.close();

        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to write to a file
    public static void writeFile(String fileName, String content) 
    {
        try 
        {
            FileWriter fw = new FileWriter(fileName, true); // true for append mode
            BufferedWriter bw = new BufferedWriter(fw);
            bw.write(content);
            bw.newLine();
            bw.close();
            System.out.println("Content added to " + fileName);
        } 
        catch (IOException e) 
        {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // Method to delete a file
    public static void deleteFile(String fileName) 
    {
        File file = new File(fileName);
        if (file.delete()) 
        {
            System.out.println("File deleted: " + file.getName());
        } 
        else 
        {
            System.out.println("Failed to delete the file.");
        }
    }

    public static void main(String[] args) 
    {
        String fileName = "test.txt";

        // Create file
        createFile(fileName);

        // Write to file
        writeFile(fileName, "Hello, World!");

        // Read from file
        readFile(fileName);

        // Update file
        writeFile(fileName, "This is an updated content.");

        // Read from file after update
        readFile(fileName);

        // Delete file
        deleteFile(fileName);
    }
}
