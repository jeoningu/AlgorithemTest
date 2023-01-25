package com.study.programers.lv1;

import java.util.ArrayList;
import java.util.List;

//https://school.programmers.co.kr/learn/courses/30/lessons/147355?language=java
// 코딩테스트 연습 - 연습문제 - 크기가 작은 부분 문자열
public class SmallSubstring {
    public int solution(String t, String p) {
        int answer = 0;

        long plong = Long.parseLong(p);
        int pLength = p.length();
        int number =  t.length()-pLength+1;

        for (int i =0 ; i<number; i++) {
            if (Integer.parseInt(t.substring(i,i+pLength)) <= plong) answer++;
        }

        return answer;
    }
}
