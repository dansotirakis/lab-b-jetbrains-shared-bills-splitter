import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int in = scanner.nextInt();
        if (in < 1) {
            System.out.println("no army");
        } else if (in <= 19) {
            System.out.println("pack");
        } else if (in <= 249) {
            System.out.println("throng");
        } else if (in <= 999) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}