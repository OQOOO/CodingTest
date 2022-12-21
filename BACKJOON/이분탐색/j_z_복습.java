package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;
import java.util.ArrayList;

public class j_z_복습 {
    static int binarySearch_upper(ArrayList<Integer> list, int key) {
        int idx_lo = 0;
        int idx_hi = list.size()-1;

        while (idx_lo < idx_hi) {
            final int idx_mid = (idx_lo + idx_hi) / 2;
            if (key <= list.get(idx_mid)) {
                idx_hi = idx_mid;
            } else {
                idx_lo = idx_mid + 1;
            }
        }
        return idx_hi;
    }

    static int LIS_length(int[] arr) {
        ArrayList<Integer> LIS = new ArrayList<>(Arrays.asList(arr[0]));

        int idx = 0;
        for (int i = 1; i < arr.length; ++i) {
            final int lLast = LIS.get(LIS.size()-1);
            if (lLast < arr[i]) {
                LIS.add(arr[i]);
            } else if (lLast > arr[i]) {
                idx = binarySearch_upper(LIS, arr[i]);
                LIS.set(idx, arr[i]);
            }
        }
        return LIS.size();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));


        int aLen = Integer.parseInt(bf.readLine());

        StringTokenizer iptData = new StringTokenizer(bf.readLine(), " ");
        int[] aArr = new int[aLen];
        for (int i = 0; i < aLen; ++i) {
            aArr[i] = Integer.parseInt(iptData.nextToken());
        }

        int answer = LIS_length(aArr);
        System.out.println(answer);    
    }
}
