package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_6_단어의개수 {
    public static void main(String[] args) throws IOException{
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();

        String[] sArr = ipt.split(" ");
        int min = 0;
        if (sArr.length > 0) {
            if (sArr[0] == "") {
                ++ min;
            }
        }

        answer = sArr.length - min;
        System.out.println(answer);
    }
}