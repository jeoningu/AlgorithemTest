package com.study.programers.lv1;

import java.util.ArrayList;
import java.util.List;

/**
 * 코딩테스트 연습 - 연습문제 - x만큼 간격이 있는 n개의 숫자
 * https://school.programmers.co.kr/learn/courses/30/lessons/12954
 */
public class NNumbersSpacedByX {
    public long[] solution(int x, int n) {
        List<Long> list = new ArrayList<>();

        for (int i =1; i<=n; i++) {
            list.add((long)x*i);
        }

        return list.stream().mapToLong(l->l).toArray();
    }

}
