package BACKJOON.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class J_11047_동전 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer iptNK = new StringTokenizer(bf.readLine(), " ");
        int n = Integer.parseInt(iptNK.nextToken()); 
        int target = Integer.parseInt(iptNK.nextToken());
        
        int[] coinType = new int[n];
        for (int i = 0; i < n; ++i) {
            coinType[i] = Integer.parseInt(bf.readLine());
        }

        // 계산

        // 배열 역순으로 탐색
        int coinCnt = 0;
        for (int i = n - 1; i >= 0; --i) {
            int coin = coinType[i];

            // 이번 동전을 몇개 추가할지 구하기
            int c_cnt = target / coin;
            if (c_cnt > 0) {
                target -= coin * c_cnt;
                coinCnt += c_cnt;
            }

            if (target == 0) {
                break;
            }
        }
        System.out.println(coinCnt);
    }
}
