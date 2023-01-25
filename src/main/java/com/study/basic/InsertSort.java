package com.study.basic;

public class InsertSort {

    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        /**
         * 삽입 정렬
         *  - 앞 요소부터 자기 앞에 있는 요소들 범위 내에서 자기 바로 앞 요소와 비교하여 교체하면서 정렬해나가는 방법입니다. 대상 요소를 알맞은 위치에 삽입하는 모양이여서 삽입 정렬입니다.
         *  - 메모리를 적게 사용한다는 장점이 있지만 시간복잡도가 O(N²) 빅오의 N 제곱이기 때문에 비효율적인 정렬입니다.
         *  - 거의 정렬이 된 상태라면 효율적이다. 시간복잡도가 O(N) 이다.
         */
        int i,j,temp;
        int arrLength = array.length;
        int count =0;
        for (i=1; i<arrLength; i++) {
            count++;
            for (j=i; j>0; j--) {
                count++;
                if (array[j] < array[j-1]) {
                    temp = array[j];
                    array[j] = array[j-1];
                    array[j-1] = temp;
                }
            }
        }

        System.out.println("count = " + count); // 반복문에 의해 54번 연산한다.
        // 출력
        for (i=0; i<arrLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
