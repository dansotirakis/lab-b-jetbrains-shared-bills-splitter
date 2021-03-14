import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int out = 0;
        int[] p = new int[3];
        int c = 0;
        do {
            p[c] = in.nextInt();
            c++;
        } while (in.hasNext() && c < 3);

        for (int i = p[0]; i <= p[1]; i++) {
            if (i % p[2] == 0) {
                out++;
            }
        }
        System.out.println(out);

    }
}