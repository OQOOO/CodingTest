package BACKJOON.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_9461_파도반수열 {
    public static void main(String[] args) throws IOException { 
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int iptNum = Integer.parseInt(bf.readLine());

        // n = (n-1) + (n-5)
        long[] dp = new long[100];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 1;
        dp[3] = 2;
        dp[4] = 2;
        for (int i = 5; i < 100; ++i) {
            dp[i] = dp[i-1] + dp[i-5];
        }
        
        for (int i = 0; i < iptNum; ++i) {
            System.out.println(dp[Integer.parseInt(bf.readLine())-1]);
        }
    }
}
