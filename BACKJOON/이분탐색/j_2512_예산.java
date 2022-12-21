package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class j_2512_예산 {
    static int findTotal(int[] arr, int mid) {
        int result = 0;
        for (int i : arr) {
            if (i <= mid) {
                result += i;
            } else {
                result += mid;
            }
        }
        return result;
    }

    static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = key;

        int s = 0;
        for (int i : arr) {
            s += i;
        }
        if (s < key) {
            return arr[arr.length-1];
        }

        while (lo <= hi) {
            final int mid = (lo + hi) / 2;
            final int midTotal = findTotal(arr, mid);
            if (key < midTotal) {
                hi = mid - 1;
            } else if (key > midTotal){
                lo = mid + 1;
            } else {
                return mid;
            }
        }
        return hi;
    }
    public static void main(String[] args) throws IOException { 
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int localNum = Integer.parseInt(bf.readLine());

        StringTokenizer ipt = new StringTokenizer(bf.readLine(), " ");
        int[] localArr = new int[localNum];
        for (int i = 0; i < localNum; ++i) {
            localArr[i] = Integer.parseInt(ipt.nextToken());
        }

        int total = Integer.parseInt(bf.readLine());

        Arrays.sort(localArr);
        int answer = binarySearch(localArr, total);
        System.out.println(answer);
    }
}
