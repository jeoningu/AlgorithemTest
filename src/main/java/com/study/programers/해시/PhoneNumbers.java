package com.study.programers.해시;

import java.util.Arrays;
import java.util.HashMap;

//https://school.programmers.co.kr/learn/courses/30/lessons/42577?language=java#
//코딩테스트 연습 > 해시 > 전화번호 목록
public class PhoneNumbers {
    public boolean solution(String[] phone_book) {
        // hash 이용
        HashMap<String, Integer> map = new HashMap<>();

        // HashMap에 담는다.
        for (int i=0; i<phone_book.length; i++) {
            map.put(phone_book[i], i );
        }

        // 비교
        for(String str : phone_book){
            for (int i=1; i<str.length(); i++) {
                // containsValue 보다 conatainsKey가 훨씬 빠르다.
                if (map.containsKey(str.substring(0,i))) return false;
            }
        }

        return true;



// 정렬후 for문에서 startsWith으로 접두어 검색하는 방법
//        boolean answer = true;
//
//        Arrays.sort(phone_book);
//
//        for (int i=0; i<phone_book.length-1; i++) {
//            if (phone_book[i+1].startsWith(phone_book[i])) {
//                return false;
//            }
//        }
//
//        return answer;
    }
}
