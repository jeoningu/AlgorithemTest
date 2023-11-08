package com.study.baekjoon;

import java.util.Scanner;

public class 슬라이딩_Q12891 {
    static int aCnt = 0;
    static int cCnt = 0;
    static int gCnt = 0;
    static int tCnt = 0;
    static int rstCnt = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int s = sc.nextInt();

        String dnaStr = sc.next();

        aCnt = sc.nextInt();
        cCnt = sc.nextInt();
        gCnt = sc.nextInt();
        tCnt = sc.nextInt();

        char[] arr = new char[p];
        arr = dnaStr.toCharArray();

        int sIdx = 0;
        int eIdx = s-1;
        for (int i = sIdx; i <= eIdx; i++) {
            compareAndMinus(arr[i]);
        }
        rstCompare();

        for (int i = sIdx; i < p-s; i++) {
            compareAndPlus(arr[i]);
            compareAndMinus(arr[i+s]);
            rstCompare();
        }

        System.out.println(rstCnt);
    }

    /* dna부분문자열 조건에 만족하는지 판단*/
    private static void rstCompare() {
        if(aCnt<=0 && cCnt<=0 && gCnt<=0 & tCnt<=0){
            rstCnt++;
        }
    }

    /* DNA 부분 문자열에 포함되어야 할 'A','C','G','T' 에 해당하면 최소개수에서 차감 */
    private static void compareAndMinus(char target ) {
        if ('A' == target) aCnt--;
        else if ('C' == target) cCnt--;
        else if ('G' == target) gCnt--;
        else if ('T' == target) tCnt--;
    }

    /* DNA 부분 문자열에 포함되어야 할 'A','C','G','T' 에 해당하면 최소개수에서 다시 채움 */
    private static void compareAndPlus(char target ) {
        if ('A' == target) aCnt++;
        else if ('C' == target) cCnt++;
        else if ('G' == target) gCnt++;
        else if ('T' == target) tCnt++;
    }

}
