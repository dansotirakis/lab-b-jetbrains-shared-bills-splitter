import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        getSounding(scanner.nextLine().toCharArray());
    }

    private static void getSounding(char[] in) {
        final String aeiouy = "aeiouy";
        int length = in.length;
        int pleasantSounding = 0;
        for (int c = 0; c <= length - 1; c++) {
            if ((length - 3) - c >= 0) {
                if (aeiouy.indexOf(in[c]) != -1 && aeiouy.indexOf(in[c + 1]) != -1 && aeiouy.indexOf(in[c + 2]) != -1 || aeiouy.indexOf(in[c]) == -1 && aeiouy.indexOf(in[c + 1]) == -1 && aeiouy.indexOf(in[c + 2]) == -1) {
                    pleasantSounding++;
                    c++;
                }
            }
        }
        System.out.println(pleasantSounding);
    }

}