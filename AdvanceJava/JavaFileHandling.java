package JavaNotes.AdvanceJava;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFileHandling {
    public static void main(String[] args) {

        // Code to create a new file
        File myFile = new File("mwi_file.txt");
        try {
            myFile.createNewFile();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Code to write in a file
        try {
            FileWriter fileWriter = new FileWriter("mwi_file.txt");
            fileWriter.write("\"Code is not just a language, it's a superpower that can change the world. So keep coding and let your creativity and innovation bring forth a brighter future.\nKeep learning, Keep coding!");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Code to read from file
        try {
            Scanner sc = new Scanner(myFile);
            while(sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        // Code to delete file
        if(myFile.delete()){
            System.out.println("I have deleted: " + myFile.getName());
        }
        else{
            System.out.println("Some problem occurred while deleting the file");
        }
    }
}
