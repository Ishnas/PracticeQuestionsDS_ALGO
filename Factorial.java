import java.util.Arrays;
import java.util.Scanner;

public class Factorial {
    static int n;
    static long[] a;
    static  final long Mod = 1000000007;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        n = scanner.nextInt();

        a = new long[n+2];
        Arrays.fill(a, -1);

        a[0] = 1;
        a[1] = 1;

       long res = facto(n);
        System.out.println(res);


    }

    private static long facto(int n) {

        if(n==0)
            return a[n];

        if(n==1)
            return a[n];

        if (a[n]>-1)
            return a[n];


            a[n] = ((facto(n - 1)%Mod) * n)%Mod;

            return a[n];

    }
}
