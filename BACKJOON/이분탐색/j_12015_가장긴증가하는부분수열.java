package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.ArrayList;
import java.util.Arrays;

public class j_12015_가장긴증가하는부분수열 {

    // 리스트 속에서 key값보다 한단계 큰 값의 인덱스를 반환한다
    static int binarySearch(ArrayList<Integer> list, int key) {
        int lo = 0;
        int hi = list.size()-1;
        while (lo < hi) {
            final int mid = (lo + hi) / 2;
            if(key <= list.get(mid)) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi;
    }

    // 임시 배열 크기 반환
    static int lisLength(int[] arr) {
        ArrayList<Integer> LIS = new ArrayList<>(Arrays.asList(arr[0]));

        int idx = 0; 
        for (int i = 1; i < arr.length; ++i) {
            if(LIS.get(LIS.size()-1) < arr[i]) {
                LIS.add(arr[i]);
                
            } else if (LIS.get(LIS.size()-1) > arr[i]){
                idx = binarySearch(LIS, arr[i]); // 이진탐색
                LIS.set(idx, arr[i]);
            }
        }
        return LIS.size();
    }
    public static void main(String[] args) throws IOException { 
        // 입력
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int aLen = Integer.parseInt(bf.readLine());
        StringTokenizer ipt = new StringTokenizer(bf.readLine(), " ");
        int[] iArr = new int[aLen];
        for (int i = 0; i < aLen; ++i) {
            iArr[i] = Integer.parseInt(ipt.nextToken());
        }

        // 계산
        int answer = lisLength(iArr);
        System.out.println(answer);
    }
}
