package arr;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Queue1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int K = sc.nextInt();

        Queue<Integer> q = new LinkedList<>();
        for (int i = 1; i <= N; i++)
            q.offer(i); // 1~7을 q에 입력 1,2,3,4,5,6,7

        int[] ans = new int[N];
        for (int i = 0; i < N; i++) {
            // K-1만큼 뒤로 보낸다. K=3 맨 앞에 있는 2개를 뒤로 보냄
            // 3,4,5,6,7,1,2 그리고 3을 제거 그리고 반복
            for(int j = 1; j<K; j++)
                q.add(q.poll()); // poll은 head를 제거하고 반환
            //
            ans[i] = q.poll();
        }

        System.out.println("<" + Arrays.stream(ans)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(", ")) + ">");
    }
}