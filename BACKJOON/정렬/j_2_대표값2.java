package BACKJOON.정렬;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class j_2_대표값2 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int[] iArr = new int[5];
        for (int i = 0; i < 5; ++i) {
            String ipt = bf.readLine();
            iArr[i] = Integer.parseInt(ipt);
        }
        int total = 0;
        Arrays.sort(iArr);
        for (int i : iArr) {
            total += i;
        }
        int average = total / 5;
        System.out.println(average);
        System.out.println(iArr[2]);
    }
}
