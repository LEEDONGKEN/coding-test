package ch4;

import java.util.Arrays;
import java.util.Scanner;
//백준 1931 회의실 배정
public class Main2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int result = 0;
        int count = sc.nextInt();
        int[][] meeting = new int[count][2];
        for (int i = 0; i < count; i++) {
            meeting[i][0] = sc.nextInt();
            meeting[i][1] = sc.nextInt();
        }
        //람다식 표현법 끝나는 시간으로 오름차순한다.
        Arrays.sort(meeting, (o1, o2) -> {
            if(o1[1] == o2[1]){
                return Integer.compare(o1[0],o2[0]);
            } else {
                return Integer.compare(o1[1],o2[1]);
            }
        });

        int endTime = meeting[0][1]; //가장 빨리 끝나는 시간
        result++;

        for (int i = 1 ; i < count; i++) {
            if(meeting[i][0] >= endTime){
                endTime = meeting[i][1];
                result++;
            } else{
                continue;
            }
        }
        System.out.println(result);
    }
}
