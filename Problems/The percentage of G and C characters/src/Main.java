import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] input = scanner.nextLine().toLowerCase(Locale.ROOT).toCharArray();
        double gc = 0;
        for (int i = 0; i <= (input.length - 1); i++) {
            if (input[i] == 'g' || input[i] == 'c') {
                gc++;
            }
        }
        System.out.println(gc * 100 / input.length);
    }
}