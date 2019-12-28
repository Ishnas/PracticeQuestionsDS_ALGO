import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci {
    static int n;
    static long[] a;
    static int T;

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i=0;i<T;i++) {
            n = scanner.nextInt();
            a = new long[n+2];
            Arrays.fill(a, -1);
            a[0] = 0;
            a[1] = 1;
            long res = fib(n);
            System.out.println(res);
        }
    }

    public static long fib(int n){

        if(n==0 || n==1)
            return a[n]%1000000007;

        if(a[n]>-1)
            return a[n]%1000000007;
        else {
            a[n] = fib(n-1) + fib(n-2);
            return a[n]%1000000007;
        }

    }
}
