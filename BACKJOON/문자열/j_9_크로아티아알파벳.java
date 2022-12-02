package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class j_9_크로아티아알파벳 {
    public static void main(String[] args) throws IOException{
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();
        
        ipt = ipt.replace("dz=", "@=");
        String[] sArr = ipt.split("");

        String[] croArr = 
        {"c=", "c-", "@=", "d-", "lj", "nj", "s=", "z="};

        for (int i = 0; i < sArr.length -1; ++i) {
            String comp = sArr[i] + sArr[i+1];
            for (String j : croArr) {
                if (comp.equals(j)) {
                    ++ answer;
                    break;
                }
            }
        }
        System.out.println(answer + (sArr.length - answer * 2));
    }
}
