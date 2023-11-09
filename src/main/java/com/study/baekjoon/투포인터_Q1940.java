package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class 투포인터_Q1940 {
    public static void main(String[] args) throws IOException {
/*        Scanner sc = new Scanner(System.in);
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
        System.out.println(cnt);*/

        // ===============
        // 공개 코드
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = new int[N];

        StringTokenizer sc = new StringTokenizer(br.readLine());
        for(int i=0; i<N; i++) {
            arr[i] = Integer.parseInt(sc.nextToken());
        }

        Arrays.sort(arr);
        int count = 0;
        int i = 0; //arr[0] // min
        int j = N-1; // arr[N-1] //max
        while(i<j) {
            if (arr[i]+arr[j] < M) i++;
            else if (arr[i]+arr[j] > M) j--;
            else {
                count++;
                i++; j--;
            }
        }
        System.out.println(count);

    }
}
