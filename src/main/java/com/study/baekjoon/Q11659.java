package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

// 백준 11659 - 구간 합 구하기
/*
최약의 경우 10만 * 10만 = 100억만개의 연산이 필요함. 따라서 단순 for문으로는 성능 문제 발생
 -> 미리 합 배열을 만들어서 구간 합을 구한다.
 - 합 배열을 만들 때는 전 idx의 합과 현재 인덱스의 합을 구하여 계산한다.
 - 합배열을 이용한 구간 합을 구하려면 sumArray[endIdx] - sumArray[startIdx-1]로 계산을 해야 한다.
  계산하기 편하도록 합배열의 인덱스를 N개의 수보다 1 더 크게 잡는다.
  예를 들어 첫번째 값부터 세번째의 구간 합을 구하려면 sumArray[3] - sumArray[-1]로 계산을 해야 합니다.
  하지만 -1 인덱스는 오류이다.
  따라서 인덱스 0번째에 0을 넣어두고 인덱스 1부터 합 계산한 값을 넣어준다.

  tip) 구간 합 배열에 넣어줄 값이 큰 경우 long형을 사용하면 좋다.
 */
public class Q11659 {
    public static void main(String[] args) throws IOException {

/*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();

        int[] sumArray = new int[N+1];
        sumArray[0] = 0;
        for (int i = 1; i <= N; i++) {
            sumArray[i] = sumArray[i - 1] + sc.nextInt();
        }

        for (int j = 0; j < M; j++) {
            int startIdx = sc.nextInt();
            int endIdx = sc.nextInt();
            System.out.println(sumArray[endIdx] - sumArray[startIdx-1]);
        }
*/

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer stringTokenizer = new StringTokenizer(bufferedReader.readLine());

        int suNo = Integer.parseInt(stringTokenizer.nextToken());
        int quizNo = Integer.parseInt(stringTokenizer.nextToken());

        long sumArray[] = new long[suNo + 1];
        sumArray[0] = 0;
        stringTokenizer = new StringTokenizer(bufferedReader.readLine());
        for (int i = 1; i < suNo + 1; i++) {
            sumArray[i] = sumArray[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        for (int j = 0; j < quizNo; j++) {
            stringTokenizer = new StringTokenizer(bufferedReader.readLine());
            int startIdx = Integer.parseInt(stringTokenizer.nextToken());
            int endIdx = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(sumArray[endIdx] - sumArray[startIdx-1]);
        }
    }
}
