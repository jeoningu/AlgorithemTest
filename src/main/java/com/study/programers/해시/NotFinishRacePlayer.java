package com.study.programers.해시;

import java.util.Arrays;
import java.util.HashMap;

/*
https://school.programmers.co.kr/learn/courses/30/lessons/42576
코딩테스트 연습 > 해시 > 완주하지 못한 선수
 */
public class NotFinishRacePlayer {
    public String solution(String[] participant, String[] completion) {

        /* Hash 활용 */
        String answer = "";
        // HashMap을 만든다. (participant)
        HashMap<String, Integer> map = new HashMap<>();
        for (String str : participant) {
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // HashMap에서 뺀다. (completion)
        for (String str : completion) {
            if (map.containsKey(str)) {
                map.put(str, map.get(str) - 1);
            }
        }

        // value가 0이 아닌 마지막 주자를 찾는다.
        for (String key : map.keySet()) {
            if (map.get(key) != 0) {
                answer = key;
            }
        }

        return answer;


        /* Sort/Loop 활용 */
        /*
        // 정렬
        Arrays.sort(participant);
        Arrays.sort(completion);

        // 같은 인덱스면 같은 값이어야 한다. 다른 값 나올 때까지 찾는다.
        int i = 0;
        for (; i < completion.length; i++) {
            if (!participant[i].equals(completion[i])) {
                break;
            }
        }

        // 여기까지 왔으면 마지막 주자가 완주하지 못한 선수
        return participant[i];
        */
    }

    public static void main(String[] args) {
        String[] participant = new String[]{"marina", "josipa", "nikola", "vinko", "filipa"};
        String[] completion = new String[]{"josipa", "filipa", "marina", "nikola"};

        NotFinishRacePlayer sol = new NotFinishRacePlayer();
        System.out.println(sol.solution(participant, completion));
    }
}
