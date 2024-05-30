package ch5;

import java.util.Arrays;
import java.util.Scanner;

//백준15486
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] T = new int[N + 2];
        int[] P = new int[N + 2];

        int[] dp = new int[N + 2];
        for (int i = 1; i <= N; i++) {
            T[i] = sc.nextInt();
            P[i] = sc.nextInt();
        }
        System.out.println("T: " + Arrays.toString(T));
        System.out.println("P: " + Arrays.toString(P));
        System.out.println(Arrays.toString(dp));

        for (int i = 1; i <= N+1; i++) {
            dp[i] = Math.max(dp[i-1], dp[i]);
            if(i+T[i] > N+1) continue;
            System.out.println(i+T[i]);
            System.out.println(N+1);
            dp[i+T[i]] = Math.max(dp[i+T[i]], P[i] + dp[i]);
            System.out.println("dp" + i + ":"+  Arrays.toString(dp));
        }
        System.out.println(Arrays.toString(dp));


        System.out.println(dp[N+1]);
    }
}
