package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;

public class j_1_수_찾기 { //

    static int[] makeIntArr(String[] strArr) {
        int[] intArr = new int[strArr.length];
        for (int i = 0; i < strArr.length; ++i) {
            intArr[i] = Integer.parseInt(strArr[i]);
        }
        return intArr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        // 입력부
        int aNum = Integer.parseInt(bf.readLine());
        String[] s_aArr = bf.readLine().split(" ");
        int[] aArr = makeIntArr(s_aArr);
        Arrays.sort(aArr);

        //int xNum = Integer.parseInt(bf.readLine()); // 실행할 때 주석 해제
        String[] s_xArr = bf.readLine().split(" ");
        int[] xArr = makeIntArr(s_xArr);

        // 계산부
        for (int x : xArr) {
            int st = 0;
            int ed = aNum - 1;
            while (true) {
                int mid = (st + ed) / 2;

                if (aArr[mid] > x) {
                    ed = mid -1;
                }

                if (aArr[mid] < x) {
                    st = mid + 1;
                }

                if (aArr[mid] == x) {
                    System.out.println(1);
                    break;
                }

                if (st > ed) {
                    System.out.println(0);
                    break;
                }

            }
        }   
         
    }
}
