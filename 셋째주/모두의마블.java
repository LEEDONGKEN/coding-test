package ch4;

// 12845번 모두의마블
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] l = new int[n];
        for (int i = 0; i < l.length; i++) {
            l[i] = sc.nextInt();
        }

        Integer[] array = Arrays.stream(l).boxed().toArray(Integer[]::new);
        Arrays.sort(array, Collections.reverseOrder());

        int[] sortedArray = Arrays.stream(array).mapToInt(Integer::intValue).toArray();
        int gold = 0;

        for (int i = 0; i < sortedArray.length-1; i++) {
            gold += sortedArray[0] + sortedArray[i+1];
        }
        System.out.println(gold);
    }
}
