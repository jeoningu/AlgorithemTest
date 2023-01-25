package com.study.basic;

public class SelectionSort {
    public static void main(String[] args) {

        int[] array = {1,10,5,8,7,6,4,3,2,9};

        /**
         * 선택 정렬
         *  - 오름차순으로 정렬한다고 했을 때, 가장 작은 값의 인덱스를 선택해서 맨 앞에서부터 교체해서 앞에서부터 정렬하는 방법입니다.
         *  - 메모리를 적게 사용한다는 장점이 있지만 시간복잡도가 O(N²) 빅오의 N 제곱이기 때문에 비효율적인 정렬입니다.
         */
        /**
         * 계산 방법
         * 1. 개념적으로 계산
         *  인덱스 0~9 중 가장 작은 수  => 10개 n
         *  인덱스 1~9 중 가장 작은 수  => 9개  n-1
         *  ...
         *  인덱스 8~9 중 가장 작은 수  => 2개
         *  (위와 같이 앞에서부터 정렬했을 때 맨 마지막 인덱스에 대해서 정렬하지 않아도 맨 마지막 전 인덱스까지 정렬되면 전체가 정렬된다.)
         *
         *   ====> n n-1 ... 2개 이므로 1까지 포함한다고 생각하여 계산하면 n(n+1)/2
         *   1은 포함하지 않으니 최종적으로 n(n+1)/2 -1
         *   O(N²)
         *
         * 2. 코드를 보고 직접 계산
         * 첫번째 반목분 횟수 0~8 => 9개 즉, n-1
         * 두번째 반복문 횟수
         *  1~9 => 9개 즉, n-1
         *  2~9 => 8개 즉, n-2
         *  ...
         *  9~9 => 1개
         *
         *  ===> 첫번째 반복문 횟수와 두번째 반복문 횟수를 더하면
         *  (n-1) + (n-1)n/2 = n(n+1)/2 -1
         *  O(N²)
         *
         *
         */
        int i,j,min,index,temp, arrayLength;
        arrayLength = array.length;
        int count =0;
        for(i=0; i<arrayLength-1; i++) {
            index = i;
            count++;
            for(j=i+1; j<arrayLength; j++) {
                count++;
                if (array[index] > array[j]) {
                    index = j;
                }
            }

            temp = array[i];
            array[i] = array[index];
            array[index] = temp;
        }

        System.out.println("count = " + count); // 반복문에 의해 54번 연산한다.
        // 출력
        for (i=0; i<arrayLength; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
