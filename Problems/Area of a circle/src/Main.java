import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int area = scanner.nextInt();
        double areaSquad = Math.pow(area, 2);
        double s = Math.PI * areaSquad;
        System.out.println(s);
    }
}