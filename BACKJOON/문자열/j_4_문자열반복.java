package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_4_문자열반복 {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();

        int caseNum = Integer.parseInt(ipt);

        for (int i = 0; i < caseNum; ++i) {
            String answer = "";
            String caseIpt = bf.readLine();

            String[] caseArr = caseIpt.split(" ");
            int repeat = Integer.parseInt(caseArr[0]);
            String[] sArr = caseArr[1].split("");
            for (String s : sArr) {
                for (int j = 0; j < repeat; ++j) {
                    answer += s;
                }
            }
            System.out.println(answer);
        }
    }
}