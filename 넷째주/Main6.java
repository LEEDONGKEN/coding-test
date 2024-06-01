package ch5;

import java.util.Arrays;
import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 입력받기
        int N = scanner.nextInt();
        int[] dimensions = new int[N + 1];
        for (int i = 0; i < N; i++) {
            dimensions[i] = scanner.nextInt();
            dimensions[i + 1] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(dimensions));

        // 동적 프로그래밍을 위한 배열
        int[][] dp = new int[N][N];

        // 행렬 곱셈의 최소 연산 횟수 계산
        for (int len = 1; len < N; len++) {
            for (int i = 0; i < N - len; i++) {
                int j = i + len;
                dp[i][j] = Integer.MAX_VALUE;
                for (int k = i; k < j; k++) {
                    int cost = dp[i][k] + dp[k + 1][j] + dimensions[i] * dimensions[k + 1] * dimensions[j + 1];
                    if (cost < dp[i][j]) {
                        dp[i][j] = cost;
                    }
                }
            }
        }

        // 결과 출력
        System.out.println(dp[0][N - 1]);

        scanner.close();
    }

}
