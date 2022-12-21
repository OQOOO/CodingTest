package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j_1072_게임 {
    static long percentage(long play, long win, long add) {
        long per = (100 * (win + add)) / (play + add);
        return per;
    }
    static long binarySearch(long play, long win) {
        long key = percentage(play, win, 0) + 1;
        if(key >= 100) {
            return -1;
        }
        long lo = 1;
        long hi = play;

        while (lo < hi) {
            final long mid = (lo + hi) / 2;
            final long comp = percentage(play, win, mid);

            System.out.println(lo + " " +mid + " " + hi + "   " + key  + " " + comp);

            if (key <= comp) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        
        return hi;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer ipt = new StringTokenizer(bf.readLine(), " ");
        int[] iptArr = new int[2];
        for (int i = 0; i < 2; ++i) {
            iptArr[i] = Integer.parseInt(ipt.nextToken());
        }
        long play = iptArr[0];
        long win = iptArr[1];

        long answer = binarySearch(play, win);
        System.out.println(answer);
    }
}
