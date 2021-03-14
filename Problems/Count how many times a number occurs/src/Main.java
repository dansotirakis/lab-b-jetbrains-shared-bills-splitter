import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        int n, x, count = 0, i, p = 0;
        Scanner s = new Scanner(System.in);
        n = s.nextInt();
        int[] a = new int[n];

        for(i = 0; i < n; i++){
            a[i] = s.nextInt();
        }

        x = s.nextInt();

        for(i = 0; i < n; i++){
            p+=a[i];
            if(p >= x){
                count++;
                p-=n;
            }
        }

        System.out.println(count);
    }
}