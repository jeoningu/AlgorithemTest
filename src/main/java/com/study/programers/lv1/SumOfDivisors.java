package com.study.programers.lv1;

/**
 * https://school.programmers.co.kr/learn/courses/30/lessons/12928
 * 코딩테스트 연습 - 연습문제 - 약수의 합
 */
public class SumOfDivisors {
    public int solution(int n) {
        int answer = 0;

        for (int i=1; i<=n/2; i++) {
            if (n%i == 0) {
                answer += i;
            }
        }

        return answer+n;
    }
}
