package BACKJOON.문자열;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class j_10_그룹단어체커 {
    public static void main(String[] args) throws IOException {
        int answer = 0;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        
        String firstIpt = bf.readLine();
        int num = Integer.parseInt(firstIpt);
        answer = num;
        for (int qu = 0; qu < num; ++ qu) {
            
            // 문자열 받기
            String ipt = bf.readLine();
            String[] sArr = ipt.split("");

            // 이어지는 중복단어 하나로 합치기
            String nString = "";
            String before = "#";
            for (String i : sArr) {
                if (before.equals(i)) {
  
                } else {
                    nString += i;
                    before = i;
                }
            }

            // 그룹 단어 체크
            String[] nsArr = nString.split("");
            for (String i : nsArr) {
                int cnt = 0;

                // 글자가 두번 중복되면 그룹단어 x
                for (String j : nsArr) {
                    if (i.equals(j)) {
                        ++cnt;
                        if (cnt == 2) {
                            break;
                        }
                    }
                }
                if (cnt == 2) {
                    -- answer;
                    break;
                }
            }
        }
        System.out.println(answer);
    }
}
