package BACKJOON.스택;

import java.util.ArrayList;
import java.util.Arrays;

public class j_test {
    public static void main(String[] args) {
        ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,2,15));

        int i = test.get(test.size() -1);
        System.out.println(i);
    }
}
