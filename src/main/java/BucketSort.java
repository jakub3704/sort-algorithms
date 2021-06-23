package main.java;

import java.util.ArrayList;

import java.util.Collections;
import java.util.List;

/**
 * Algorytm sortowania kube�kowego (Bucket Sort)
 *
 * Sortowanie polega na utworzeniu kube�k�w, a nast�pnie w odpowiedni spos�b
 * przypisaniu do nich liczb. Po utworzeniu i wype�nieniu kube�k�w, dowolnym
 * algorytmem sortuje si� kube�ki zawieraj�ce liczby, po czym wypisuje si�
 * liczby do tablicy.
 */
public class BucketSort implements MySort {

    @Override
    public void sort(int[] array) {
        if (array.length > 0) {
            int max = searchMaxValue(array);
            int numberOfBuckets = (int) Math.sqrt(array.length);

            /*
             * Tworzenie kube�k�w
             */
            List<List<Integer>> buckets = new ArrayList<>();
            for (int i = 0; i < numberOfBuckets; i++) {
                buckets.add(new ArrayList<>());
            }

            /*
             * Wype�nienie kube�k�w
             */
            for (int value : array) {
                /*
                 * Przyj�to podzia� liczb do kube�k�w w zale�no�ci od liczby maksymalnej w
                 * tablicy
                 */
                int bucketIndex = calculateBucketIndex(value, max, numberOfBuckets);
                buckets.get(bucketIndex).add(value);
            }
            /*
             * Sortowanie kube�k�w przy u�yciu dowolnego algorytmu sortuj�cego
             */
            for (List<Integer> bucket : buckets) {
                Collections.sort(bucket);
            }

            /*
             * Wypisywanie uporz�dkowanych liczb z kube�k�w do tablicy
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
             * Przyj�to podzia� liczb do kube�k�w w zale�no�ci od d�ugo�ci tablicy
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
     * Funkcja obliczaj�ca do jakiego kube�ka nale�y przypisa� dan� liczb�
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
