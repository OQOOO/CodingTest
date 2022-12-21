package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*
 * [1 2 3]
 * [2 4 6]
 * [3 6 9]
 * 형태의 N * N 크기의 2차원 배열 A[][]를
 * 1차원 배열 B[] 로 바꾸어 정렬한 후 B[K]을 구하는 문제
 * 
 * 직접 배열을 만들면 매우 많은 메모리가 필요하므로 다른 방법을 통해 구해야 함
 * 
 * 
 * ex)B = {1, 2, 2, 3, 3, 4, 6, 6, 9}
 *        <1, 2, 3, 4, 5, 6, 7, 8, 9>
 * B[N] = x 라고 가정
 * N는 x값보다 작거나 같은 원소의 갯수와 같다 (그렇게 가정해도 무방하다)
 *
 * [1 2 3]
 * [2 4 6]
 * [3 6 9]
 * A 배열이 1열과 1행의 곱셈표와 같은 형태로 확장되므로
 * N = x/1 + x/2 + x/3 + ... + x/n
 * (이 계산을 수행하는 함수를 numFind라고 하자)
 * 
 * 
 * 그러므로 numFind 함수에 임의의 x값을 넣으면 임의의 N값을 도출하는데
 * 이진탐색을 통해 K와 같은 N값을 도출하는 x값을 찾아 반환하면 문제풀이가 종료된다.
 * 
 */
public class j_6_K번째수 {

    // x값을 받아 N값을 반환하는 메서드
    static long numFind(long x, long n) {
        long idx_n = 0;

        // 몫 더하기는 내부 배열의 갯수만큼 실시한다 ([i][] 제한)
        for (long i = 1; i <= n; ++i) {

            // x값을 배열 1열로 나누면 해당 배열 속 x보다 작은 값의 수를 알 수 있다.
            // 나눗셈 결과가 배열 길이를 뛰어넘을 경우 배열 길이만큼만 더한다 ([][j] 제한)
            if (x/i > n) {
                idx_n += n;
            } else {
                idx_n += x / i;
            }
        }
        return idx_n;
    }

    // 이진탐색을 통해 최적의 x값을 구하는 메서드
    static long binarySearch(long idx_k, long n) {
        // lo, hi는 내부 숫자의 범위
        long lo = 0;
        long hi = n * n;

        //upperBound 방식으로 실행
        while (lo < hi) {
            final long mid = (lo + hi) /2;

            // x값을 받아 N값을 반환해주는 메서드
            long idx_n = numFind(mid, n);

            // n값과 k값이 같을 때의 lo가 정답
            if (idx_n < idx_k) {
                lo = mid + 1;
            } else {
                hi = mid;
            }
        }
        return lo;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        long n = Integer.parseInt(bf.readLine());
        long k = Integer.parseInt(bf.readLine());

        long answer = binarySearch(k, n);
        System.out.println(answer);
    }
}
