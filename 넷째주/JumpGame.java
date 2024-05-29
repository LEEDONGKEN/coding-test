package ch5;

import java.util.Scanner;
//백준 1890번
public class JumpGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[][] board = new int[N][N];
        long[][] dp = new long[N][N];

        // 게임판 입력
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = sc.nextInt();
            }
        }

        // dp 배열 초기화
        dp[0][0] = 1;

        // 동적 계획법 적용
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if (i == N - 1 && j == N - 1) continue; // 마지막 칸은 건너뜀
                if (dp[i][j] > 0) { // 현재 칸에 도달 가능한 경우
                    int jump = board[i][j];
                    if (i + jump < N) {
                        dp[i + jump][j] += dp[i][j];
                    }
                    if (j + jump < N) {
                        dp[i][j + jump] += dp[i][j];
                    }
                }
            }
        }

        // 가장 오른쪽 아래 칸으로의 경로 개수 출력
        System.out.println(dp[N - 1][N - 1]);
    }
}

