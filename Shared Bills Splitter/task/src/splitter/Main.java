package splitter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
        int[] a = {3, 0, 3, 9, 2, 1};
        int r = 7;
        for (int i = 0; i < a.length; i = i + 1) {
            r += a[i] * a[i];
        }
        System.out.print(r + " ");
        r = 13;
        r += a[a[0]];
        r -= a[a[a.length - 1]];
        System.out.print(r + " ");
        r = 0;
        for (int i = 0; i < a.length; i = i + 1) {
            if (a[i] < a.length) {
                r += a[i];
            }
        }
        System.out.print(r + " ");


    }
}