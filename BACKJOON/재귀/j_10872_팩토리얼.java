import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_10872_팩토리얼 {
    static int ft(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return n * ft(n - 1);
        }
    }
    public static void main(String[] args) throws IOException { //
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        System.out.println(ft(n));
    }
}
