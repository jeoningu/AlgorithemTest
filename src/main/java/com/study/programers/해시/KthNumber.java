package com.study.programers.해시;

import java.util.Arrays;

/*
* https://school.programmers.co.kr/learn/courses/30/lessons/42748
* 코딩테스트 연습 > 정렬 > K번째수
* */
public class KthNumber {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];

        for (int i=0; i<commands.length; i++) {
            int[] tempArr = {};
            tempArr = Arrays.copyOfRange(array, commands[i][0]-1, commands[i][1]);
            Arrays.sort(tempArr);
            answer[i] = tempArr[commands[i][2]-1];
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] array = new int[]{1, 5, 2, 6, 3, 7, 4};
        int[][] commands = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};

        KthNumber sol = new KthNumber();

        int[] solution = sol.solution(array, commands);

        for (int r : solution) {
            System.out.println(r);
        }
    }
}
