package FILEOPERATIONS;
import java.io.*;
public class fileoperations4 {
    public static void main(String[] args) {
        File source = new File("/home/spos/Desktop/FILEOPERATIONS/src/FILEOPERATIONS/test1.txt");
        File dest = new File("/home/spos/Desktop/FILEOPERATIONS/src/FILEOPERATIONS/test5.txt");
        try (
            BufferedReader br = new BufferedReader(new FileReader(source));
            PrintWriter pw = new PrintWriter(dest)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                pw.println(line);
            }
            System.out.println("File copied successfully.");
        } catch (Exception e) {
            System.out.println("Error copying..");
        }
    }
}
