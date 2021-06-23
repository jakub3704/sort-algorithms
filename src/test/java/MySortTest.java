package test.java;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.Random;

import org.junit.Test;

import main.java.BubbleSort;
import main.java.BucketSort;
import main.java.CombSort;
import main.java.HeapSort;
import main.java.InsertionSort;
import main.java.MergeSort;
import main.java.MySort;
import main.java.QuickSort;
import main.java.SelectionSort;
import main.java.ShellSort;

public class MySortTest {
    private final static int TIMEOUT = 1000 * 10;

    private void testSortingSameElements(MySort sort, int arrayLength) {
        int[] array = new int[arrayLength];
        Arrays.fill(array, 1);
        sort.sort(array);
        for (int i = 0; i < array.length; i++) {
            assertEquals(1, array[i]);
        }
    }

    private void testSortingSequencialNumbers(MySort sort, int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = i;
        }

        sort.sort(array);

        for (int i = 0; i < array.length; i++) {
            assertEquals(i, array[i]);
        }
    }

    private void testSortingReverseSequencialNumbers(MySort sort, int arrayLength) {
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[array.length - 1 - i] = i;
        }

        sort.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            assertTrue("Value (" + array[i] + ") should be smaller than (" + array[i + 1] + ")",
                    array[i] < array[i + 1]);
        }
    }

    private void testSortingRandomNumbers(MySort sort, int arrayLength) {
        Random generator = new Random();
        int[] array = new int[arrayLength];
        for (int i = 0; i < array.length; i++) {
            array[i] = generator.nextInt(arrayLength);
        }

        sort.sort(array);

        for (int i = 0; i < array.length - 1; i++) {
            assertTrue("Value (" + array[i] + ") should be smaller or equal than (" + array[i + 1] + ")",
                    array[i] <= array[i + 1]);
        }
    }

    private void testSortingEmpty(MySort sort) {
        int[] array = new int[0];
        sort.sort(array);
        assertEquals(0, array.length);
    }

    private void testSortingOneElement(MySort sort) {
        int[] array = new int[] { 7 };
        sort.sort(array);
        assertEquals(1, array.length);
        assertEquals(7, array[0]);
    }

    private void testSortingTwoElements(MySort sort) {
        int[] array = new int[] { 8, 7 };
        sort.sort(array);
        assertEquals(2, array.length);
        assertEquals(7, array[0]);
        assertEquals(8, array[1]);
    }

    private void testSorting(MySort sort, int arrayLength) {
        testSortingSameElements(sort, arrayLength);
        testSortingSequencialNumbers(sort, arrayLength);
        testSortingReverseSequencialNumbers(sort, arrayLength);
        testSortingRandomNumbers(sort, arrayLength);
        testSortingEmpty(sort);
        testSortingOneElement(sort);
        testSortingTwoElements(sort);
    }

    @Test(timeout = TIMEOUT)
    public void BubleSortTest() {
        MySort sort = new BubbleSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void CombSortTest() {
        MySort sort = new CombSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void InsertionSortTest() {
        MySort sort = new InsertionSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void SelectionSortTest() {
        MySort sort = new SelectionSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void ShellSortTest() {
        MySort sort = new ShellSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void MergeSortTest() {
        MySort sort = new MergeSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void QuickSortTest() {
        MySort sort = new QuickSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void HeapSortTest() {
        MySort sort = new HeapSort();
        testSorting(sort, 1000);
    }

    @Test(timeout = TIMEOUT)
    public void BucketSortTest() {
        MySort sort = new BucketSort();
        testSorting(sort, 1000);
    }
}
