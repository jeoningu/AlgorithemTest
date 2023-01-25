package com.study.programers.lv1;

import java.util.*;

//https://school.programmers.co.kr/learn/courses/30/lessons/150370
// 코딩테스트 연습 - 2023 KAKAO BLIND RECRUITMENT - 개인정보 수집 유효기간
public class PersonalInformationCollectionValidityPeriod {
    public int[] solution(String today, String[] terms, String[] privacies) {
        List<Integer> answerList = new ArrayList<>();

        // terms으로 약관 별 유효기간 map을 만든다.
        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String[] termSplit = term.split(" ");
            termsMap.put(termSplit[0], Integer.parseInt(termSplit[1]));
        }

        // "개인정보 별 유효날짜"에 "약관 별 유효기간"을 더해서 "오늘날짜"가 됐으면 기간만료
        int todayVal = calculateDateVal(today);
        for (int i=0; i<privacies.length; i++) {
            String[] priSplit = privacies[i].split(" ");

            if (todayVal >=
                    termsMap.get(priSplit[1])*28 + calculateDateVal(priSplit[0])
                ) {
                answerList.add(i+1);
            }
        }

        // Integer List to Array
        return answerList.stream().mapToInt(i->i).toArray();
    }

    /**
     * 날짜문자열을 날짜값으로 계산한다.
     */
    private int calculateDateVal(String dateStr){
        String[] dateStrSplit = dateStr.split("\\.");
        int dayVal = Integer.parseInt(dateStrSplit[2]);
        int monthVal = Integer.parseInt(dateStrSplit[1])*28;
        int yearVal = Integer.parseInt(dateStrSplit[0])*28*12;
        return yearVal + monthVal + dayVal;
    }

//    public static int[] solution(String today, String[] terms, String[] privacies) {
//        // today에서 terms를 빼서 약관 별 유효날짜 map을 만든다.
//        Map<String, Integer> termsMap = new HashMap<>();
//
//        String[] todaySplit = today.split("\\.");
//
//        for (String term : terms) {
//            int termVal = 0;
//            String[] termSplit = term.split(" ");
//
//            int termMonth = Integer.parseInt(termSplit[1]);
//            int todayMonth = Integer.parseInt(todaySplit[1]);
//
//            if (todayMonth > termMonth) {
//                termVal += Integer.parseInt(todaySplit[2]);
//                termVal += (todayMonth - termMonth) * 100 ;
//                termVal += Integer.parseInt(todaySplit[0]) * 10000;
//
//            } else if (todayMonth < termMonth) {
//                termVal += Integer.parseInt(todaySplit[2]);
//                termVal += (12 + (todayMonth - termMonth)) * 100 ;
//                termVal += (Integer.parseInt(todaySplit[0]) - 1 ) * 10000;
//
//            } else { // Integer.parseInt(todaySplit[1]) = Integer.parseInt(termSplit[1])
//                termVal += Integer.parseInt(todaySplit[2]);
//                termVal += (( todayMonth - termMonth)) * 100 ;
//                termVal += (Integer.parseInt(todaySplit[0]) - 1 ) * 10000;
//
//            }
//
//            termsMap.put(termSplit[0], termVal);
//        }
//
//        // 위에서 만든 map에서 유효날짜를 꺼내서 개인정보를 비교하여 결과에 담는다.
//        List<Integer> answerList = new ArrayList<>();
//        int index=0;
//        for (String privacie : privacies) {
//            index++;
//
//            String[] privacieSplitA = privacie.split(" ");
//            String[] privacieSplitB = privacieSplitA[0].split("\\.");
//            int privacieVal = 0;
//            privacieVal += Integer.parseInt(privacieSplitB[2]);
//            privacieVal += Integer.parseInt(privacieSplitB[1])*100;
//            privacieVal += Integer.parseInt(privacieSplitB[0])*10000;
//
//            if (termsMap.get(privacieSplitA[1]) >= privacieVal) {
//                answerList.add(index);
//            }
//        }
//
//        int[] answer = new int[answerList.size()];
//        for(int i=0; i<answerList.size(); i++) {
//            answer[i] = answerList.get(i);
//        }
//        return answer;
//    }
}
