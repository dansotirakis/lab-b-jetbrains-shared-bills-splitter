import java.util.Locale;
import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class Main {

    /* Fix this method */
    public static String toUpperCase(String str) {
        return str != null ? str.toUpperCase(Locale.ENGLISH) : "";
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(in);
        String line = scanner.nextLine();
        line = "none".equalsIgnoreCase(line) ? null : line;
        out.println(toUpperCase(line));
    }
}