package BACKJOON.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class j_3_커트라인 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt1 = bf.readLine();

        String[] nkArr = ipt1.split(" ");
        int n = Integer.parseInt(nkArr[0]);
        int k = Integer.parseInt(nkArr[1]);

        String ipt2 = bf.readLine();
        String[] sArr = ipt2.split(" ");
        int[] iArr = new int[n];
        for (int i = 0; i < n; ++i) {
            iArr[i] = Integer.parseInt(sArr[i]);
        }
        Arrays.sort(iArr);

        for (int i = 0; i < k; ++i) {
            answer = iArr[iArr.length-1 -i];
        }
        System.out.println(answer);
    }
}
