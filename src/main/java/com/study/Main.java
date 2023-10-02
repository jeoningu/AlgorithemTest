package com.study;

import com.study.programers.lv1.*;
import com.study.programers.해시.PhoneNumbers;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        SmallSubstring solution = new SmallSubstring();
//        int result = solution.solution("3141592", "271");
//        System.out.println("result = " + result);

//        PersonalInformationCollectionValidityPeriod solution = new PersonalInformationCollectionValidityPeriod();
//        int[] result = solution.solution("2022.05.19",
//                new String[]{"A 6", "B 12", "C 3"},
//                new String[]{"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"});
//        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));

//        SumOfDivisors solution = new SumOfDivisors();
//        int result = solution.solution(12);
//        System.out.println("result = " + result);

//        EvenAndOddNumbers solution = new EvenAndOddNumbers();
//        String result = solution.solution(3);
//        System.out.println("result = " + result);

//        MeanSaving solution = new MeanSaving();
//        double result = solution.solution(new int[]{1,2,3,4});
//        System.out.println("result = " + result);

//        DigitAddition solution = new DigitAddition();
//        int result = solution.solution(987);
//        System.out.println("result = " + result);

//        TurningNaturalNumbersIntoArrays solution = new TurningNaturalNumbersIntoArrays();
//        int[] result = solution.solution(12345);
//        System.out.println("result = " + result);


//        NumberOfPAndYInAString solution = new NumberOfPAndYInAString();
//        boolean result = solution.solution("pPoooyY");
//        System.out.println("result = " + result);

//        IntegerSquareRootDistinction solution = new IntegerSquareRootDistinction();
//        long result = solution.solution(121);
//        System.out.println("result = " + result);

//        NNumbersSpacedByX solution = new NNumbersSpacedByX();
//        long[] result = solution.solution(2, 5);
//        System.out.println(Arrays.toString(result));

//        PhoneNumbers solution = new PhoneNumbers();
//        String[] phone_book = new String[]{"12","123","1235","567","88","119", "97674223", "1195524421","456","789"};
//        boolean result = solution.solution(phone_book);
//        System.out.println(result);

//        int[][] data = {{1, 0, 5},{2,2,2},{3,3,1},{4,4,1},{5,10,2}};
////import java.util.Arrays;
////
////        class Solution {
////            public int[] solution(int[][] data) {
//                int[] answer = new int[data.length];
//
//                int [][] copyData = Arrays.copyOfRange(data, 1, data.length);
//
//                Arrays.sort(copyData, (o1, o2)-> {
//                    return o1[2]!=o2[2] ? o1[2]-o2[2] : o1[0]-o2[0];
//                });
//                System.out.println(Arrays.deepToString(copyData));
//
//                answer[0] = 1;
//                for(int i=0; i<copyData.length; i++) {
//                    answer[i+1] = copyData[i][0];
//                }
//                System.out.println(Arrays.toString(answer));
//
////                return answer;
////            }

//        int[][] data = {{1, 0, 5},{2,2,2},{3,3,1},{4,4,1},{5,10,2}};

        //int[][] data = {{1, 0, 3},{2,1,3},{3,3,2},{4,9,1},{5,10,2}};

        int[][] data = {{1, 2, 10},{2,5,8},{3,6,9},{4,20,6},{5,25,5}};

        int[] answer = new int[data.length]; // 결과
        int index = 0; // data index
        int answerIndex = 0;
        int currentTime = 0; // 현재 시간
        int endPrintTime = 0; // 프린트 끝나는 시간
        boolean isOperationing = false; // 작업중인지
        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));

        while (index < data.length) {

            // 프린트 끝나는 시간이 됐으면 isOperationing를 false로
            if (endPrintTime <= currentTime) {
                isOperationing = false;
            }

            // 현재 시간에 요청된게 있는지
            if (currentTime >= data[index][1] || !queue.isEmpty()) {

                // 작업중인게 없으면 시작
                if (!isOperationing) {

                    // 인쇄 끝난 시각과 새로 요청된 문서의 요청시각이 같은 경우 먼저 추가한 후
                    if (currentTime >= data[index][1]) {
                        queue.add(data[index]);
                    }

                    int[] poll = queue.poll();
                    int[] temp = poll == null ? data[index] : poll;
                    answer[answerIndex++] = temp[0];
                    endPrintTime = currentTime + temp[2];
                    isOperationing = true;

                } else {
                // 작업중인게 있으면 대기열로
                    if (currentTime >= data[index][1]) {
                        queue.add(data[index]);
                    }
                }

                if (currentTime >= data[index][1]) {
                    if ((index+1) == data.length && !queue.isEmpty()) {

                    } else {
                        index++;
                    }
                }

            }
            // 시간 증가
            currentTime++;
        }
        System.out.println(Arrays.toString(answer));

//        for (int time=0; time<data.length; i++) {
//            time ++;
//            if (data[i]) {
//                time
//            }
//
//
//        }

//        int[][] data = {{1, 0, 5},{2,2,2},{3,3,1},{4,4,1},{5,10,2}};
//        int[] answer = new int[data.length];
        // 작업을 처리하기 위한 우선순위 큐를 생성합니다.
        // 페이지 수가 작은 순서대로 처리하기 위해 Comparator를 사용합니다.
//        PriorityQueue<int[]> queue = new PriorityQueue<>(Comparator.comparingInt(a -> a[2]));
//
//        // 데이터를 우선순위 큐에 추가합니다.
//        for (int[] document : data) {
//            queue.offer(document);
//        }
//        System.out.print(queue);
//
//        // 프린터 작업을 처리합니다.
//        int currentTime = 0; // 현재 시각을 기록합니다.
//        int index = 0; // 완료된 문서의 인덱스를 기록합니다.
//        while (!queue.isEmpty()) {
//            int[] document = queue.poll(); // 가장 페이지 수가 작은 문서를 가져옵니다.
//            int documentNumber = document[0];
//            int requestTime = document[1];
//            int pages = document[2];
//
//            // 현재 시각보다 인쇄 요청 시각이 더 늦을 경우, 현재 시각을 인쇄 요청 시각으로 업데이트합니다.
//            if (requestTime > currentTime) {
//                currentTime = requestTime;
//            }
//
//            // 인쇄 시간을 계산합니다.
//            int printTime = currentTime + pages;
//
//            // 정답 배열에 완료된 문서의 번호를 저장합니다.
//            answer[index++] = documentNumber;
//
//            // 다음 인쇄할 문서를 선택하기 위해 현재 시각을 업데이트합니다.
//            currentTime = printTime;
//        }
//
//        System.out.println(Arrays.toString(answer));
    }

}