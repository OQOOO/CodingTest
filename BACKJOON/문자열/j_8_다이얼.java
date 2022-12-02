package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_8_다이얼 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();
        String[] sArr = ipt.split("");

        String[][] dial = {
            {"A", "B", "C"},//      2
            {"D", "E", "F"},//      3
            {"G", "H", "I"},//      4
            {"J", "K", "L"},//      5
            {"M", "N", "O"},//      6
            {"P", "Q", "R", "S"},// 7
            {"T", "U", "V"},//      8
            {"W", "X", "Y", "Z"}//  9
        };

        for (String comp : sArr) {

            // dial 배열 내부 탐색
            for (int i = 0; i < dial.length; ++i) {
                int killSwitch = 0;
                for (String j : dial[i]) { // 탈출 2
                    if (comp.equals(j)) {
                        answer += i + 3;
                        killSwitch = 1;
                        break;
                    }
                }
                // 탈출 1
                if (killSwitch == 1) {
                    break;
                }
            }
        }
        System.out.println(answer);
    }   
}
