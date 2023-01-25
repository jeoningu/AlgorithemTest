package com.study.programers.lv1;

import java.util.Arrays;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12944
 * 코딩테스트 연습 - 연습문제 - 평균 구하기
*/

public class MeanSaving {
    public double solution(int[] arr) {
        return Arrays.stream(arr).average().orElse(0);
    }
//    public double solution(int[] arr) {
//        double answer = 0;
//
//        for (int i=0; i<arr.length; i++) {
//            answer+=arr[i];
//        }
//        answer/=arr.length;
//
//        return answer;
//    }
}
