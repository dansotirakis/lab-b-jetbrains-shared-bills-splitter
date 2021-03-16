import java.util.Scanner;

class FixingNullPointerException {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = scanner.nextLine();
        string = "null".equals(string) ? null : string;
        /* Do not change code above */

        System.out.println(print(string));
    }

    private static String print(String string) {
        if (string != null) {
            return string.toLowerCase();
        } else {
            return "NPE!";
        }
    }
}