package BACKJOON.ㅎTest;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class jTest {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");

        int arrLen = Integer.parseInt(st.nextToken());
        int qNum = Integer.parseInt(st.nextToken());
        int[] arr = new int[arrLen];
        st = new StringTokenizer(bf.readLine());
        for (int i = 0; i < arrLen; ++i) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int[] sumArr = new int[arrLen + 1];
        for (int i = 1; i < arrLen + 1; ++i) {
            sumArr[i] = sumArr[i-1] + arr[i-1];
            System.out.print(sumArr[i] + " ");
        }

        for (int i = 0; i < qNum; ++i) {
            st = new StringTokenizer(bf.readLine());
            int lo = Integer.parseInt(st.nextToken());
            int hi = Integer.parseInt(st.nextToken());
            System.out.println(">>>" + (sumArr[hi] - sumArr[lo-1]));
        }

    }
}
