package BACKJOON.이분탐색;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class j_2805_나무자르기 {
    static long treeCut(int[] treeArr, int high) {
        long cut = 0;
        for (int tree : treeArr) {
            if (high < tree) {
                cut += tree - high;
            }
        }
        return cut;
    }
    static int binarySearch(int[]treeArr, int needLen) {
        int lo = 0;
        int hi = 1000000000;
        while (lo < hi) {
            final int mid = (lo + hi) / 2;
            final long cut = treeCut(treeArr, mid);

            if (cut < needLen) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return hi - 1;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        String[] ipt_NM = bf.readLine().split(" ");
        int treeNum = Integer.parseInt(ipt_NM[0]);
        int needLen = Integer.parseInt(ipt_NM[1]);

        StringTokenizer treeData = new StringTokenizer(bf.readLine(), " ");
        int[] treeArr = new int[treeNum];
        for (int i = 0; i < treeNum; ++i) {
            treeArr[i] = Integer.parseInt(treeData.nextToken());
        }

        int answer = binarySearch(treeArr, needLen);
        System.out.println(answer);
    }
}
