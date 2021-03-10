import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] p = new int[3];
        for (int c = 0; c <= 2; c++) {
            p[c] = scanner.nextInt();
        }
        System.out.println(isSorted(p));
    }

    static boolean isSorted(int[] array) {
        if (array[0] > array[1] && array[1] > array[2]) {
            return Boolean.TRUE;
        } else if (array[0] < array[1] && array[1] < array[2]) {
            return Boolean.TRUE;
        } else if (array[0] == array[1] || array[1] == array[2]){
            return Boolean.TRUE;
        }
        return Boolean.FALSE;
    }
}