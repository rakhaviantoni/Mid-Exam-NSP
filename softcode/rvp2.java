package softcode;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class rvp2 {
 public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Source File: ");
    String source = scanner.next();
    System.out.println("Destination File 1: ");
    String destination1 = scanner.next();
    System.out.println("Destination File 2: ");
    String destination2 = scanner.next();
    try {
        Files.move(Paths.get(source), Paths.get(destination1));
        // Open source file for input
        InputStream input = new FileInputStream(destination1);
        // Output file for output
        OutputStream output = new FileOutputStream(destination2);
        int data = input.read();
        while (data != -1) {
         // Write byte of data to our file
         output.write(data);
         // Read next byte
         data = input.read();
        }
        // Close both streams
        input.close();
        output.close();
        // Files.move(Paths.get(input), Paths.get(destination2));
    } catch (IOException ioe) {
     System.err.println("I/O error - " + ioe);
    }
 }
}