import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> p = new ArrayList<>();
        double r;
        int c = 0;
        int i = 0;

        do {
            p.add(in.nextInt());
            c++;
        } while (in.hasNext() && c <= 2);

        r = p.get(0);

        do {
            if (p.get(0).equals(p.get(2))) {
                i = 0;
                break;
            }
            r += r * p.get(1) / 100;
            i++;
        } while (r < p.get(2));

        System.out.println(i);
    }
}