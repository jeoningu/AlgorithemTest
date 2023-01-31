package com.study.programers.lv1;

/**
 * 코딩테스트 연습 - 연습문제 - 정수 제곱근 판별
 * https://school.programmers.co.kr/learn/courses/30/lessons/12934
 */
public class IntegerSquareRootDistinction {
    public long solution(long n) {
        double sqrt = Math.sqrt(n); // 루트

        // 정수 인지 판별
        long sqrtToLong = (long) sqrt;
        if ( sqrtToLong > sqrt || sqrtToLong < sqrt){
            return -1;
        }

        return (long)Math.pow(sqrt+1, 2); //제곱

//        try{
//            double sqrt = Math.sqrt(n);
//            if ( (int) sqrt > sqrt || (int) sqrt < sqrt){
//                return -1;
//            }
//            String s = String.valueOf((int) sqrt);
//            long l = Long.parseLong(s);
//            return (long) Math.pow(l+1, 2);
//        }catch(Exception e) {
//            e.printStackTrace();
//            return -1;
//        }
    }
}
