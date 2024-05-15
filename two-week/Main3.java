import java.util.Scanner;
import java.util.Stack;

public class Main3 {
    static int n,m;
    static int[][] graph;
    static boolean[] visited;
    static int cnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc. nextInt();
        graph = new int[n+1][n+1];
        visited = new boolean[n+1];
        for (int i = 0; i < m; i++) {
            int src = sc.nextInt();
            int dst = sc.nextInt();
            graph[src][dst] = 1;
            graph[dst][src] = 1;
        }

        for (int i = 1; i <= n ; i++) {
            if(!visited[i]){
                dfs(i);
                cnt++;
            }

        }
        System.out.println(cnt);
    }


    //재귀를 이용한 dfs
    static void dfs(int node){
        visited[node] = true;
        for (int i = 1; i <= n; i++) {
            if(graph[node][i] == 1 && !visited[i]){
                dfs(i);
            }
        }
    }
}
