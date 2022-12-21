package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Arrays;

/*
 * 입력값을 모두 합친 후 n값으로 나눈 값이 가능한 최대 길이
 * 
 * 
 * long 이여야 했던 이유는??
 */
public class j_3_렌선자르기 {
    public static void main(String[] args) throws IOException { //
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String[] ipt = bf.readLine().split(" ");
        int have = Integer.parseInt(ipt[0]);
        int need = Integer.parseInt(ipt[1]);

        // 이분탐색 변수
        long st = 1;
        long ed = 0;
        long mid = 0;

        // 값 입력, 최대길이, 중간값 탐색
        int[] cableArr = new int[have];
        for (int i = 0; i < have; ++i) {
            cableArr[i] = Integer.parseInt(bf.readLine());
            ed += cableArr[i];
        }
        ed /= need;

        // 이분탐색
        while (st <= ed) {
            long cableNum = 0;
            mid = (st + ed) / 2;

            for (int i : cableArr) {
                cableNum += i / mid;
            }

            if (cableNum >= need) {
                st = mid + 1;
                
            } else if (cableNum < need) {
                ed = mid - 1;
            }
        }
        System.out.println(ed);
    }
}
