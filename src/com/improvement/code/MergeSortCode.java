package com.improvement.code;

/**
 * @ProjectName: leetBookCode
 * @Package: com.improvement.code
 * @ClassName: MergeSortCode
 * @Author: lengjx
 * @Description: 归并排序
 * @Date: 2021/7/30 14:36
 */
public class MergeSortCode {

    /**
     *
     * @param a    排序对象
     * @param low  排序开始下标
     * @param high 排序结束下标
     * @return
     */
    private static int[] sort(int[] a, int low, int high) {
        int mid = (low + high) / 2;
        if (low < high) {
            sort(a, low, mid);
            sort(a, mid + 1, high);
            merge(a, low, mid, high);
        }
        return a;
    }


    private static void merge(int[] a, int low, int mid, int high) {
        int[] temp = new int[high - low + 1];
        int i = low;
        int j = mid + 1;
        int k = 0;
        while (i <= mid && j <= high) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= mid) {
            temp[k++] = a[i++];
        }

        while (j <= high) {
            temp[k++] = a[j++];
        }

        for (int x = 0; x < temp.length; x++) {
            a[x + low] = temp[x];
        }

    }

    public static void main(String[] args) {
        int[] a = {1, 2, 54, 48, 5, 8, 7, 9};
        int[] sort = sort(a, 0, a.length - 1);
        for (int num : sort) {
            System.out.println(num);
        }
    }
}
