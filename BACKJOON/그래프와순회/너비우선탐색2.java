import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class 너비우선탐색2 {
    static int nodeNum, edgeNum, startNode;
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
    static int[] visitedArr;

    public static void main(String[] args) throws IOException { 
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(bf.readLine(), " ");
        nodeNum = Integer.parseInt(st.nextToken());
        edgeNum = Integer.parseInt(st.nextToken());
        startNode = Integer.parseInt(st.nextToken());
        visitedArr = new int[nodeNum + 1];
        for (int i = 0; i <= nodeNum; ++i) {
            graph.add(new ArrayList<>());
        }
        for (int i = 0; i < edgeNum; ++i) {
            st = new StringTokenizer(bf.readLine(), " ");
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph.get(a).add(b);
            graph.get(b).add(a);
        }
        bfs(startNode);
        for (int i = 1; i <= nodeNum; ++i) {
            System.out.println(visitedArr[i]);
        }
    }
    static void bfs(int startNode) {
        Queue<Integer> nextNode = new LinkedList<Integer>();
        visitedArr[startNode] = 1;
        nextNode.add(startNode);
        int cnt = 1;
        while (!nextNode.isEmpty()) {
            int node = nextNode.poll();

            Collections.sort(graph.get(node), Collections.reverseOrder());
            for (int i : graph.get(node)) {
                if(visitedArr[i] == 0) {
                    visitedArr[i] = ++cnt;
                    nextNode.add(i);
                }
            }
        }
        return;
    }
}
