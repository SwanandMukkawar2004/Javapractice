package FILEOPERATIONS;

import java.io.File;
public class FILEOPERATIONS {
    public static void main(String[] args) {
        try {
            File f = new File("/home/spos/Desktop/FILEOPERATIONS/src/FILEOPERATIONS/test5.txt");
            if (f.createNewFile()) {
                System.out.println("File created: " + f.getAbsolutePath());
            } else {
                System.out.println("File already exists");
            }
        } catch (Exception e) {
            System.out.println("Error creating file.");
        }
    }
}
