import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_25501_재귀의귀재 {
    static int cnt = 0;

    static int recursion(String s, int l, int r){
        ++ cnt;
        if(l >= r) {
            return 1;
        } else if(s.charAt(l) != s.charAt(r)) {
            return 0;
        } else {
            return recursion(s, l+1, r-1);
        }
    }
    static int isPalindrome(String s){
        cnt = 0;
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        for (int i = 0; i < n; ++i) {
            String s = bf.readLine();
            System.out.println(isPalindrome(s) + " " + cnt);
        }
    }
}
