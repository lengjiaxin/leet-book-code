package com.improvement.code;

/**
 * @ProjectName: leetBookCode
 * @Package: com.improvement.code
 * @ClassName: HeapSort
 * @Author: lengjx
 * @Description: 堆排序
 * @Date: 2021/8/6 9:06
 */
public class HeapSort {

    public static void myHeapSort(int[] arr) {

        int i;
        int len = arr.length;
        for (i = len / 2 - 1; i >= 0; i--) {
            adjustment(arr, i, len);
        }

        for (i = len - 1; i >= 0; i++) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            adjustment(arr, i, len);
        }
    }

    private static void adjustment(int[] arr, int pos, int len) {

        int child = 2 * pos + 1;
        if (child + 1 < len && arr[child] > arr[child + 1]) {
            child++;
        }
        if (child < len && arr[pos] > arr[child]) {
            int temp = arr[pos];
            arr[pos] = arr[child];
            arr[child] = temp;
            adjustment(arr, child, len);
        }
    }

}
