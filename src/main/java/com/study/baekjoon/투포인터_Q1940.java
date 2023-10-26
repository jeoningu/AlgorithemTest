package com.study.baekjoon;

import java.util.Arrays;
import java.util.Scanner;

public class 투포인터_Q1940 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int arr[] = new int[N];
        for (int i=0; i<N; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int startIdx = 0, endIdx = N-1, cnt = 0, idxCnt=2, sum = arr[startIdx] + arr[endIdx];
        while (idxCnt<=N) {
            idxCnt++;
            if (sum == M) {
                cnt++;

                startIdx++;
                sum = arr[startIdx] + arr[endIdx];
            } else if ( sum < M) {
                startIdx++;
                sum = arr[startIdx] + arr[endIdx];

            } else {
                endIdx--;
                sum = arr[startIdx] + arr[endIdx];

            }
        }
        System.out.println(cnt);
    }
}
