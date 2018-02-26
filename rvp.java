import java.util.Scanner;
import softcode.rvp1;
import softcode.rvp2;
import softcode.rvp3;

public class rvp {
    private static void option(Scanner scanner) {
        System.out.println("Try again ?\n" +
                           "1 for yes\n" +
                           "2 for no");
        // double try = again(scanner, "Try again ?");
        switch (scanner.nextInt()) {
          case 1:
            main(null);
          case 2:
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        rvp1 no1 = new rvp1();
        rvp2 no2 = new rvp2();
        rvp3 no3 = new rvp3();

        System.out.println("Mid Exam NSP :\n" +
            "1. Hostname\n" +
            "2. Move a file to 2 destination\n" +
            "3. Check whether file exists or not exists\n" +
            "Enter your Choice here :");

        switch (scanner.nextInt()) {
          case 1:
            no1();
            option(scanner);
            break;
          case 2:
            no2();
            option(scanner);
            break;
          case 3:
            no3();
            option(scanner);
            break;
        }
    }
}
