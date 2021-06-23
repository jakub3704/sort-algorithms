package main.java;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/**
 * Algorytm sortowania kube³kowego (Bucket Sort)
 *
 * Sortowanie polega na utworzeniu kube³ków, a nastêpnie w odpowiedni sposób
 * przypisaniu do nich liczb. Po utworzeniu i wype³nieniu kube³ków, dowolnym
 * algorytmem sortuje siê kube³ki zawieraj¹ce liczby, po czym wypisuje siê
 * liczby do tablicy.
 */
public class BucketSort implements MySort {

    @Override
    public void sort(int[] array) {
        if (array.length > 0) {
            int max = searchMaxValue(array);
            int numberOfBuckets = (int) Math.sqrt(array.length);

            /*
             * Tworzenie kube³ków
             */
            List<List<Integer>> buckets = new ArrayList<>();
            for (int i = 0; i < numberOfBuckets; i++) {
                buckets.add(new ArrayList<>());
            }

            /*
             * Wype³nienie kube³ków
             */
            for (int value : array) {
                /*
                 * Przyjêto podzia³ liczb do kube³ków w zale¿noœci od liczby maksymalnej w
                 * tablicy
                 */
                int bucketIndex = calculateBucketIndex(value, max, numberOfBuckets);
                buckets.get(bucketIndex).add(value);
            }
            /*
             * Sortowanie kube³ków przy u¿yciu dowolnego algorytmu sortuj¹cego
             */
            for (List<Integer> bucket : buckets) {
                Collections.sort(bucket);
            }

            /*
             * Wypisywanie uporz¹dkowanych liczb z kube³ków do tablicy
             */
            int index = 0;
            for (List<Integer> bucket : buckets) {
                if (!bucket.isEmpty()) {
                    for (int value : bucket) {
                        array[index++] = value;
                    }
                }
            }
        }
    }

    public void sort(float[] array) {
        List<List<Float>> buckets = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            buckets.add(new ArrayList<>());
        }

        for (float value : array) {
            /*
             * Przyjêto podzia³ liczb do kube³ków w zale¿noœci od d³ugoœci tablicy
             */
            int bucketIndex = (int) (value * array.length);
            buckets.get(bucketIndex).add(value);
        }

        for (List<Float> bucket : buckets) {
            Collections.sort(bucket);
        }

        int index = 0;
        for (List<Float> bucket : buckets) {
            if (!bucket.isEmpty()) {
                for (float value : bucket) {
                    array[index++] = value;
                }
            }
        }
    }

    /**
     * Funkcja obliczaj¹ca do jakiego kube³ka nale¿y przypisaæ dan¹ liczbê
     */
    private int calculateBucketIndex(int value, int max, int numberOfBuckets) {
        return (int) ((double) value / max * (numberOfBuckets - 1));
    }

    private int searchMaxValue(int[] arr) {
        int max = arr[0];
        for (int value : arr) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }
}
