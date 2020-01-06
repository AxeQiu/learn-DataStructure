package me.learning.datastructure.sorting;

public class BubbleSorting {

    /**
     * scan times: O(n) - O(n^2)
     * swap times: 0 - O(n^2)
     */
    public static void sort(int[] data) {
        for (int i=0; i<data.length-1; i++) {
            boolean isSwap = false;
            for (int j=0; j<data.length-i-1; j++) {
                if (data[j] > data[j+1]) {
                    int temp = data[j+1];
                    data[j+1] = data[j];
                    data[j] = temp;
                    isSwap = true;
                }
            }
            if (!isSwap) break; //如未发生交换则代表数组有序
        }
    }
}
