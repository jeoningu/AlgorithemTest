package com.study.baekjoon;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/*
백준에서 new LinkedList<>(); 대신 List<Integer> list = new ArrayList<>();  사용하면 시간 초과 뜸.

ArrayList는 추가, 삭제 동작에서 위치를 추가,삭제한 만큼 위치를 이동시켜주는 작업이 필요해서 성능이 안 좋음.
하지만, linkedList는 추가,삭제 동작에서 주소값만 변경해주면 되기 때문에 성능이 좋음.

참고로 조회 동작은 ArrayList가 index를 이용할 수 있어서  더 성능이 좋음
*/

public class 카드2_Q2164 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int inputN = sc.nextInt();

        // 큐에 카드 저장
        Queue<Integer> queue = new LinkedList<>();
        int number = 1;
        while(number <= inputN) {
            queue.add(number++);
        }

        // 카드가 한 장 남을 때 까지 반복
        while(queue.size() > 1 ) {
           queue.poll();
           queue.add(queue.poll());
        }

        System.out.println(queue.poll());

    }
}
