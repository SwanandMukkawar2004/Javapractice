package FILEOPERATIONS;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class fileoperations3 {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("/home/spos/Desktop/FILEOPERATIONS/src/FILEOPERATIONS/test5.txt"))) {
            String line;
            System.out.println("Contents:");
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (Exception e) {
            System.out.println("Error");
        }
    }
}
