package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Arrays;
import java.util.HashSet;

public class j_5_단어공부 { //
    public static void main(String[] args) throws IOException{
        String answer = "";
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();

        ipt = ipt.toUpperCase();
        String[] sArr = ipt.split("");
        HashSet<String> sSet = new HashSet<>(Arrays.asList(sArr));
      
        int maxCount = 0;
        for (String i : sSet) {
            int count = 0;
            for (String j : sArr) {
                if (i.equals(j)) {
                    ++ count;
                }
            }
            if (maxCount < count) {
                answer = i;
                maxCount = count;
            } else if (maxCount == count) {
                answer = "?";
            }
        }
        System.out.println(answer);
    }
}
