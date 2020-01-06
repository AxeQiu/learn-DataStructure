package me.learning.datastructure.sorting;

public class InsertionSorting {

    /**
     * scan times: O(n) - O(n^2)
     * swap times: 链表:0 - O(n)  数组: 0 - O(n^2)
     */
    public static void sort(int[] data) {
        for (int i=1; i<data.length; i++) {
            int cur = data[i];
            int j = i;
            while (j>0 && data[j-1] > cur) {
                data[j] = data[j-1];
                j--;
            }
            data[j] = cur;
        }
    }
}

