package arr;

import java.util.Arrays;
import java.util.Scanner;

public class Lan {

    //판정함수
    static int calculateCount(int[] lengths, long cutLength){
        int cnt = 0;
        for(int l:lengths)
            cnt += l / cutLength;
        return cnt;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();
        int N = sc.nextInt();

        int[] l = new int[K];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }
        Arrays.sort(l);


        long s = 1, r = l[l.length-1], ans = -1;
        while(s<=r){
            long m = (s+r) / 2;
            if(calculateCount(l,m) >= N){
                ans = m;
                s = m+1;
            }
            else r = m-1;
        }
        System.out.println(ans);
    }
}
