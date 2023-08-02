package org.example;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] arr = {3, 10, 15, 29, 56, 82, 77, 24, 13, 8};
        int search = 77;

        // 이진 검색을 하기 위해 오름차순으로 정렬
        Arrays.sort(arr);

        int left = 0;
        int right = arr.length - 1;
        int result = -1;

        while (left <= right) {
            int center = (left + right) / 2;
            if (arr[center] == search) {
                result = arr[center];
                break;
            }
            if (arr[center] < search) {
                left = center + 1;
            } else {
                right = center - 1;
            }
        }

        System.out.println(result);
    }
}
