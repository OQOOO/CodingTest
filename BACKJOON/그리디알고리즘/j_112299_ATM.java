package BACKJOON.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j_112299_ATM {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int pNum = Integer.parseInt(bf.readLine());
        StringTokenizer iptData = new StringTokenizer(bf.readLine(), " ");
        int[] pArr = new int[pNum];
        for (int i = 0; i < pNum; ++i) {
            pArr[i] = Integer.parseInt(iptData.nextToken());
        }

        // 계산

        Arrays.sort(pArr);
        int total = 0;
        int temp = 0;
        for (int i : pArr) {
            temp += i;
            total += temp;
        }
        System.out.println(total);
    }
}
