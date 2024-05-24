package ch4;

import java.util.Scanner;

public class Main5 {
    //백준 2875번 대회 or 인턴
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int K = sc.nextInt();

        int teamCount = 0;

        while(N >= 2 && M >= 1 && (N+M)-K >= 3){
            teamCount++;
            N -=2;
            M--;
        }
        System.out.println(teamCount);
    }
}
