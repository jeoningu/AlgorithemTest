package com.study.programers.lv1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12931
 * 코딩테스트 연습 > 연습문제 > 자릿수 더하기
 */
public class DigitAddition {
    public int solution(int n) {
        int answer = 0;

        while(n>0) {
            answer += n % 10;
            n /= 10;
        }

        return answer;
    }

//    public int solution(int n) {
//        int answer = 0;
//
//        String s = String.valueOf(n);
//        for (int i=0; i<s.length(); i++) {
//            answer += Character.getNumericValue(s.charAt(i));
//        }
//
//        return answer;
//    }

}
