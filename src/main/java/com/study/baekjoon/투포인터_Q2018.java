package com.study.baekjoon;

import java.util.Scanner;

/*
    투 포인터 알고리즘

     - 수열에서 두개의 포인터(인덱스)를 이동해 가면서 원하는 값을 찾아 내는 알고리즘이다.
     - 두 포인터의 구간 합이 원하는 값보다 작다면 endIdx를 늘려주고 반대라면 startIdx를 늘려준다.
     - 인덱스를 늘려주면서 구간 합도 계산한다.
 */
public class 투포인터_Q2018 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int sum = 1;
        int cnt = 1; // 자기 자신도 카운트에 포함해서 1로 초기화
        int startIdx = 1;
        int endIdx = 1;
        double half = n*1.0/2;
        while (startIdx<half) { // 연속된 수이기 때문에 반까지만 탐색
            if(sum == n) {
                cnt++;

                endIdx++;
                sum += endIdx;

            } else if (sum > n) {
                sum -= startIdx;
                startIdx++;

            } else  {
                endIdx++;
                sum += endIdx;
            }
        }

        System.out.println(cnt);
    }
}
