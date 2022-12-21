package BACKJOON.ㅎTest;

public class jTest {
    static void print(int i) {
        System.out.println(i);
    }

    static int binarySearch(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo <= hi) {
            final int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid - 1;
            } else if (key > arr[mid]) {
                lo = mid + 1;
            } else {
                System.out.println("find");
                return arr[mid];
            }
        }
        return 0;
    }
    static int upperBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            final int mid = (lo + hi) / 2;
            if (key <= arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return arr[hi];
    }
    static int lowerBound(int[] arr, int key) {
        int lo = 0;
        int hi = arr.length - 1;
        while (lo < hi) {
            final int mid = (lo + hi) / 2;
            if (key < arr[mid]) {
                hi = mid;
            } else {
                lo = mid + 1;
            }
        }
        return lo;
    }

    public static void main(String[] args) {
        int[] arr = {0,1,2,3, 7,8,9};

        int target = 6;
        
        int answer = lowerBound(arr, target);

        System.out.println(answer);

    }
}
