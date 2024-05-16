package ch3;

//백준 1697번 문제
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main4 {
    static int n,k;
    static int[] visited;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        k = sc.nextInt();
        visited = new int[100001];

        Queue<Integer> q = new LinkedList<>();
        q.add(n);
        //구별하기 위해 1로 시작한다. 방문했으면 1 그리고 초를 나타낸다
        visited[n] = 1;


        while (!q.isEmpty()){
            //System.out.println("visited 배열 : " + Arrays.toString(visited));
           // System.out.print("q:");

            //printQueue(q);
            //큐에서 한개씩 꺼내온다
            int now = q.poll();
            //System.out.println("now: " + now);
            // now == k이면 숨박꼭질 성공으로 break
            if(now == k) break;
            int[] next = {now - 1, now+1,  2*now};
            //System.out.println(Arrays.toString(next));
            for (int i = 0; i < 3; i++) {
                if(!isRange(next[i])) continue;
                if(visited[next[i]] == 0){
                    //visited 배열은 시간이 얼마나 걸렸는지 표시된다.
                    visited[next[i]] = visited[now] + 1;
                    q.add(next[i]);
                }
            }
        }
        //처음 1초로 시작해서 -1초를 해줘야 한다.
        System.out.println(visited[k] -1);

    }

    static boolean isRange(int x){
        return x>=0 && x <= 100000;
    }
    public static void printQueue(Queue<Integer> queue) {
        for (Integer element : queue) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
