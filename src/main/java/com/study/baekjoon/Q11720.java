package com.study.baekjoon;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Q11720 {

    public static void main(String[] args) throws IOException {
    /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int input = Integer.parseInt(br.readLine());

        int rst = 0;
        for (int i = 0; i < input; i++) {
            int read = br.read()-48;
            rst+=read;
        }
        System.out.println(rst);

        br.close();
    */

        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();

        String sNum = sc.next();
        char[] charArray = sNum.toCharArray();

        int rst = 0;
        for (int i = 0; i < charArray.length; i++) {
            rst += charArray[i] - '0';
        }
        System.out.println(rst);
    }

}
