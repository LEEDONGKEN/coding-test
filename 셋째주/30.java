package ch4;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
//백준 10610번 30
public class Main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String inputNum = sc.nextLine();

        long sum = 0;
        //문자를 숫자로 변환하여 더하기
        for (int i = 0; i < inputNum.length(); i++) {
            sum += inputNum.charAt(i) - '0';  // 문자를 숫자로 변환하여 더하기
        }

        //문자열을 문자 배열로 변환하여 내림차순 정렬
        Character[] digits = new Character[inputNum.length()];
        for (int i = 0; i < inputNum.length(); i++) {
            digits[i] = inputNum.charAt(i);
        }
        Arrays.sort(digits, Collections.reverseOrder());

        //정렬된 문자 배열을 다시 문자열로 변환
        StringBuilder sortedNumberStr = new StringBuilder(digits.length);
        for (Character digit : digits) {
            sortedNumberStr.append(digit);
        }

        // 30의 배수 조건 확인: 마지막 자리가 0이고, 자리수의 합이 3의 배수
        if (sortedNumberStr.charAt(sortedNumberStr.length() - 1) == '0' && sum % 3 == 0) {
            System.out.println(sortedNumberStr.toString());  // 조건을 만족하면 결과 출력
        } else {
            System.out.println(-1);  // 조건을 만족하지 않으면 -1 출력
        }
    }
}
