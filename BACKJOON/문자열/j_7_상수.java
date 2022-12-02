package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

public class j_7_상수 {
    public static void main(String[] args) throws IOException {
        int answer;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String ipt = bf.readLine();
        
        String[] strArr = ipt.split("");
        ArrayList<String> reversStrList = new ArrayList<>();

        for (int i = strArr.length-1 ; i > -1; --i) {
            reversStrList.add(strArr[i]);
        }

        String reverseStr = String.join("", reversStrList);
        String[] shang = reverseStr.split(" ");
        if (Integer.parseInt(shang[0]) > Integer.parseInt(shang[1])) {
            answer = Integer.parseInt(shang[0]);
        } else {
            answer = Integer.parseInt(shang[1]);
        }
        System.out.println(answer);
    }
}
