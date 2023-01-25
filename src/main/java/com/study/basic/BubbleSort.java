package com.study.basic;

public class BubbleSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        /**
         * 버블 정렬
         *  - 오름차순으로 정렬한다고 했을 때, 옆에 있는 값과 비교해서 더 큰 값을 뒤로 보내서 맨 뒤부터 정렬하는 방법입니다.
         *  - 메모리를 적게 사용한다는 장점이 있지만 시간복잡도가 O(N²) 빅오의 N 제곱이기 때문에 비효율적인 정렬입니다.
         */

        int i,j,arrayLength;
        arrayLength = array.length;
        int count=0;

        for (i=0; i<arrayLength-1; i++) {
            count++;
            for (j=0; j<arrayLength-i-1; j++) {
                count++;
                if (array[j] > array[j+1]) {
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }

        System.out.println("count = " + count); // 반복문에 의해 54번 연산한다.
        // 출력
        for (i=0; i<arrayLength; i++) {
            System.out.print(array[i] + " ");
        }

    }
}
