package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_2_숫자의합 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String nNumber = bf.readLine();
        String ipt = bf.readLine();

        String[] sArr = ipt.split("");

        for (int i = 0; i < Integer.parseInt(nNumber); ++i) {
            answer += Integer.parseInt(sArr[i]);
        }
        System.out.println(answer);
    }
}