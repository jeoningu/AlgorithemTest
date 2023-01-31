package com.study;

import com.study.programers.lv1.*;

import java.util.Arrays;

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

        NNumbersSpacedByX solution = new NNumbersSpacedByX();
        long[] result = solution.solution(2, 5);
        System.out.println(Arrays.toString(result));
    }
}