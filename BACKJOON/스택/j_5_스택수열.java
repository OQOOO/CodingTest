package BACKJOON.스택;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;

/*
cnt ++ 하나씩 stack에 넣기
stack에서 더하거나 빼서 현재값과 같으면 다음으로
    현재값고 같은 cnt면 뽑기
    현재값이 stack보다 낮을경우 나올때까지 계속 뽑기
        만약 계속 뽑았는데 현재값 없을경오 break, print(NO)

    더하거나 배는 연산마다 +, - 출력
    cnt가 100000 초과시 no
 */

public class j_5_스택수열 {
    public static void main(String[] args) throws IOException {
        StringBuilder answer = new StringBuilder();
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int iptNum = Integer.parseInt(bf.readLine());

        ArrayList<Integer> stack = new ArrayList<>();
        int cnt = 1;
        // 입력부
        for (int i = 0; i < iptNum; ++i) {
            int comp = Integer.parseInt(bf.readLine());

            // 계산 수행
            while (true) {

                // stack 끝값이 입력과 같을경우 stack에서 뺀 후 반복문 종료
                if (stack.size() > 0) {
                    if (comp == stack.get(stack.size() -1)) {
                        stack.remove(stack.size() -1);
                        answer.append("-\n");
                        break;
                    }
                }
                // 입력이 cnt보다 크거나 같을 때 stack에 더하기
                if (comp >= cnt) {
                    stack.add(cnt);
                    answer.append("+\n");
                    ++ cnt;
                } else if (stack.size() > 0) { //스택 유무 검사

                    stack.remove(stack.size()-1);
                    answer.append("-\n");

                    // 뺀 결과 stack의 가장 큰 값이 comp보다 커질경우(값이 없을경우) 종료
                    if (stack.get(stack.size() -1) > comp) {
                        System.out.println("NO");
                        return;
                    }
                } else {
                    System.out.println("NO");
                    return;
                }
            }
        }
        System.out.println(answer);
    }
}
