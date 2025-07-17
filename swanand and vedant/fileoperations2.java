package FILEOPERATIONS;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class fileoperations2 {
    public static void main(String[] args) {
        try {
            File f = new File("/home/spos/Desktop/FILEOPERATIONS/src/FILEOPERATIONS/test1.txt");
            PrintWriter p= new PrintWriter(new FileWriter(f));
            p.println("Line 1");
            p.println("Line 2");
            p.close();
            System.out.println("Written Succesfully!");
            
        } catch (Exception e) {
            System.out.println("Error creating file.");
            e.printStackTrace();
        }
    }
}