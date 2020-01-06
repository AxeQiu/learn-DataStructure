package me.learning.datastructure;

import me.learning.datastructure.sorting.*;

import java.util.Random;
import java.util.Arrays;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * Unit test for simple App.
 */
public class AppTest {

    int[] getData(long seed) {
        final int LEN = 1024;
        int[] data = new int[LEN];
        Random r = new Random(seed);
        for (int i=0; i<LEN; i++) {
            data[i] = r.nextInt();
        }
        return data;
    }

    /**
     * Test BubbleSorting
     */
    public void testBubbleSorting() {
        long seed = System.currentTimeMillis();
        int[] data1 = getData(seed);
        int[] data2 = getData(seed);

        BubbleSorting.sort(data1);
        Arrays.parallelSort(data2);

        assertTrue(Arrays.equals(data1, data2));
    }

    /**
     * Test InsertionSorting
     */
    public void testInsertionSorting() {
        long seed = System.currentTimeMillis();
        int[] data1 = getData(seed);
        int[] data2 = getData(seed);

        InsertionSorting.sort(data1);
        Arrays.parallelSort(data2);

        assertTrue(Arrays.equals(data1, data2));

    }

}
