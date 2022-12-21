package BACKJOON.그리디알고리즘;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

import java.util.Arrays;

public class j_1931_회의실배정 {

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int meetNum = Integer.parseInt(bf.readLine()); // -
        int[][] meetArr = new int[meetNum][2]; // -

        for (int i = 0; i < meetNum; ++i) {
            StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
            meetArr[i][0] = Integer.parseInt(st.nextToken());
            meetArr[i][1] = Integer.parseInt(st.nextToken());
        }

        // 계산
        Arrays.sort(meetArr, (o1, o2) -> {
            if (o1[1] == o2[1]) {
                return Integer.compare(o1[0], o2[0]);
            } else {
                return Integer.compare(o1[1], o2[1]);
            }
        });

        int answer = 0;
        int st = 0;
        for (int i = 0; i < meetNum; ++i) {
            if (st <= meetArr[i][0]) {
                ++ answer;
                st = meetArr[i][1];
            }
        }
        System.out.println(answer);
    }
}
