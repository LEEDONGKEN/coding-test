import java.util.Arrays;
import java.util.Scanner;
//백준 11399번
public class Main1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] P = new int[N];
        int totalTime = 0;

        for (int i = 0; i < P.length; i++) {
            P[i] = sc.nextInt();
        }

        Arrays.sort(P);

        int add = 0; // 변수 한개가 더 필요하다.
        for (int i = 0; i < P.length; i++) {
            add += P[i];
            totalTime += add;
        }
        System.out.println(totalTime);
    }
}
