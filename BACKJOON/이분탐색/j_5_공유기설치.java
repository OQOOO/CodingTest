package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class j_5_공유기설치 {
    static int installCounter(int[] homeArr, int install_Len) {
        int insCnt = 1;
        int before = homeArr[0];
        for (int i = 1; i < homeArr.length; ++i) {
            int now = homeArr[i];

            int between = now - before;
            if (install_Len <= between) {
                ++ insCnt;
                before = now;
            }
        }
        return insCnt;
    }
    static int binarySearch_upper(int[] arr, int routerNum) {
        int lo = 0;
        int hi = arr[arr.length - 1];
        while (lo < hi) {
            final int mid = (lo + hi) / 2;

            int installCount = installCounter(arr, mid);

            if (installCount < routerNum) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi - 1;
    }
    public static void main(String[] args) throws IOException { 
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] ipt = bf.readLine().split(" ");
        int homeNum = Integer.parseInt(ipt[0]);
        int routerNum = Integer.parseInt(ipt[1]);

        int[] homeArr = new int[homeNum];
        for (int i = 0; i < homeNum; ++i) {
            homeArr[i] = Integer.parseInt(bf.readLine());
        } 
        Arrays.sort(homeArr);

        // 계산
        int answer = binarySearch_upper(homeArr, routerNum);

        System.out.println(answer);
    }
}
