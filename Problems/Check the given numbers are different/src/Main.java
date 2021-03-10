import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> p = new ArrayList<>();
        int c = 0;

        do {
            p.add(in.nextInt());
            c++;
        } while (c < 3);

        System.out.println(p.stream().distinct().count() == 3);
    }

}