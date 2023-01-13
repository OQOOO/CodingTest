package BACKJOON.동적계획법1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j_1932_정수삼각형 {
    public static void main(String[] args) throws IOException { 
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(bf.readLine());

        int[][] arr = new int[n+1][n+1];
        for (int i = 0; i < n; ++i) {
            StringTokenizer st = new StringTokenizer(bf.readLine());
            for (int j = 0; j <= i; ++j) {
                arr[i][j] = Integer.parseInt(st.nextToken());
            }
        }

        //
        int[][] dp = new int[n+1][n+1];
        for (int i = n-1; i >= 0; --i) {
            for (int j = 0; j < n; ++j) {
                dp[i][j] = Math.max(dp[i+1][j], dp[i+1][j+1]) + arr[i][j];
            }
        }
        System.out.print(dp[0][0]);
    }
}
