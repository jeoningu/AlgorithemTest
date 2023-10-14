package com.study.baekjoon;

import java.io.IOException;
import java.util.Scanner;

public class Q1546 {

    public static void main(String[] args) {
/*
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int[] suArray = new int[N];
        for (int i = 0; i < N; i++) {
            suArray[i] = sc.nextInt();
        }

        double rst = (Arrays.stream(suArray).sum() / Arrays.stream(suArray).max().getAsInt() * 100.0) / N;
        System.out.println(rst);
        */

        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int max = 0;
        int sum = 0;
        for (int i = 0; i < N; i++) {
            int temp = sc.nextInt();
            if (max < temp) {
                max = temp;
            }
            sum += temp;
        }

        System.out.println(sum * 100.0 / max  / N);



    }
}
