package softcode;
import java.io.*;
import java.util.Scanner;
import java.nio.file.*;

public class rvp3 {
 public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    System.out.println("Filename: ");
    String input = scanner.next();
            Path p = Paths.get(input);
            boolean exists = Files.exists(p);
            boolean notExists = Files.notExists(p);

            if (exists) {
                System.out.println("File is already Exists");
            } else if (notExists) {
                System.out.println("File is not Exists");
            } else {
                System.out.println("File's status is unknown!");
            }
 }
}