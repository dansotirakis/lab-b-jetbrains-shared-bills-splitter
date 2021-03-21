import java.util.Locale;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(sc.nextLine().substring(0, 1).toLowerCase(Locale.ROOT).equals("j"));
    }
}