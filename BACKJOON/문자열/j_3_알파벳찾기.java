package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_3_알파벳찾기 {
    public static void main(String[] args) throws IOException{
        String answer = "";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();
        String[] sArr = ipt.split("");

        String alpha = "abcdefghijklmnopqrstuvwxyz";
        String[] alphaArr = alpha.split("");

        for (String alp : alphaArr) {
            int temp = -1;
            for (int j = 0; j < sArr.length; ++j) {
                if (alp.equals(sArr[j])) {
                    temp = j;
                    break;
                }
            }
            answer += Integer.toString(temp) + " ";
        }
        System.out.println(answer);
    }
}
