import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        int[] i = new int[size];
        ArrayList<Integer> d = new ArrayList<>();

        int c = 0;

        while (c < size){
            i[c] = in.nextInt();
            if (i[c] % 6 == 0) {
                d.add(i[c]);
            }
            c++;
        }

        System.out.println(d.stream().mapToInt(integer -> integer).sum());

    }
}