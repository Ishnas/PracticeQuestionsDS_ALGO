import java.util.Arrays;
import java.util.Scanner;

public class Combination {
    static int n;
    static int r;
    static long[] a;
    static final long Mod = 1000000007;
    static double num = 1, den = 1;
    static  long res;

    public static void main(String[] args) {

        int T;

        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt();

        for (int i = 0; i < T; i++) {
            n = scanner.nextInt();
            a = new long[n + 2];
            Arrays.fill(a, -1);
            a[0] = 1;
            a[1] = 1;
            r = scanner.nextInt();
            long s = nCr(n, r);
            System.out.println(s);
        }
    }

    private static long nCr(int n, int r) {
        num = 1;

        if (n == 0 && r == 0)
            return 1;

        if (n > 0 && r == 0)
            return 1;

        if(r > (n-r)) {
            den = factorial(n - r);
            for (int i = n; i > r; i--) {
                num = (num * i)%Mod;
            }
        }
        else {
            den = factorial(r);
            for (int i = n; i > (n-r); i--) {
                num = (num * i)%Mod;
            }
        }
        return (long) (num / den);
    }

    static long factorial(int m) {

        if (m == 0 || m == 1)
            return a[m];

        if (a[m]>-1)
            return a[m];


            a[m] = (factorial(m - 1)%Mod * m)%Mod;
            return a[m];
    }
}

