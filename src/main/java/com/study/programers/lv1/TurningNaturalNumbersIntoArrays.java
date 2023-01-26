package com.study.programers.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12932
 * 코딩테스트 연습 > 연습문제 > 자연수 뒤집어 배열로 만들기
 */
public class TurningNaturalNumbersIntoArrays {
    public int[] solution(long n) {
        String s = String.valueOf(n);
        StringBuilder sb = new StringBuilder(s);
        sb = sb.reverse();
        String[] ss = sb.toString().split("");

        int[] answer = new int[ss.length];
        for (int i=0; i<ss.length; i++) {
            answer[i] = Integer.parseInt(ss[i]);
        }
        return answer;
    }

//    public int[] solution(long n) {
//        return new StringBuilder().append(n).reverse().chars().map(Character::getNumericValue).toArray();
//    }

//    public int[] solution(long n) {
//        int[] answer = {};
//
//        List<Long> list = new ArrayList<>();
//
//        while (n>0) {
//            list.add(n%10);
//            n/=10;
//        }
//
//        return list.stream().mapToInt(i-> Math.toIntExact(i)).toArray();
//    }
}
