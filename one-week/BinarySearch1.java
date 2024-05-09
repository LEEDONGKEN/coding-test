package arr;

import java.util.Arrays;
import java.util.Scanner;
//백준 나무자르기 2805

public class BinarySearch1 {

    static boolean isPossible(int[] heights, int cutH, int M){
        long sum = 0;
        for(int h:heights)
            if(h>cutH) sum += h - cutH;
        return sum >= M;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] h = new int[N];
        for (int i = 0; i < N; i++) {
            h[i] = sc.nextInt();
        }

        Arrays.sort(h);

        int l = 0, r = h[h.length-1], ans = -1;
        while (l <= r){
            int m = (l+r) / 2;
            if(isPossible(h,m,M)){
                ans = m;
                l = m+1;
            }
            else r = m-1;
        }

        System.out.println(ans);
    }
}
