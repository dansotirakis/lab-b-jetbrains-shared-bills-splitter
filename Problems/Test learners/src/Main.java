import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        extracted(scanner.nextInt());
    }

    private static void extracted(int scanner) {
        if (scanner == 1) {
            System.out.println("Yes!");
        } else if (scanner > 1 && scanner < 5) {
            System.out.println("No!");
        } else {
            System.out.println("Unknown number");
        }
    }
}