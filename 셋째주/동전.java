package ch4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

//백준 11047번 동전 0
public class Main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc. nextInt();
        int[] coins = new int[N];
        for (int i = 0; i < coins.length; i++) {
            coins[i] = sc.nextInt();
        }
        Integer[] array = Arrays.stream(coins).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());

        int[] sortedCoins= Arrays.stream(array).mapToInt(Integer::intValue).toArray();

        int minCoinCnt = 0;

        for (int coin : sortedCoins) {
            minCoinCnt += (K/coin);
            K %= coin;
        }
        System.out.println(minCoinCnt);
    }
}
