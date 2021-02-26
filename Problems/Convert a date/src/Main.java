import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String date = in.nextLine();
        String[] dateExplained = date.split("-");
        String newDate = dateExplained[1] + "/" + dateExplained[2] + "/" + dateExplained[0];
        System.out.println(newDate);
    }
}