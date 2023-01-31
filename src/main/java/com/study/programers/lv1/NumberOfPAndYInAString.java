package com.study.programers.lv1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12916
 * 코딩테스트 연습-연습문제-문자열 내 p와 y의 개수
 */
public class NumberOfPAndYInAString {
    public boolean solution(String s) {
        boolean answer = true;
        s = s.toLowerCase();
        int pCnt=0,yCnt=0;

        for (int i=0; i<s.length(); i++) {
            if (s.charAt(i)=='p') pCnt++;
            else if (s.charAt(i)=='y') yCnt++;
        }

        return (pCnt==0 && yCnt==0) || pCnt == yCnt;
    }
}
