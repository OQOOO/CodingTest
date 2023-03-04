import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_10870_피보나치수5 {
    static int fibo(int n) {
        if (n >= 2) {
            return fibo(n-1) + fibo(n-2);
        } else {
            if (n == 0) {
                return 0;
            } else {
                return 1;
            }
        }
    }
    public static void main(String[] args) throws IOException { //
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.print(fibo(n));
    }
}
