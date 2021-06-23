package main.java;

/**
 * Algorytm sortowania przez scalanie (Merge Sort)
 * 
 * Sortowanie przez zastosowanie metody dziel i zwyciê¿aj. Najpierw
 * rekurencyjnie tworzymy podzia³ tablicy, nastêpnie zaczynaj¹c od najmniejszych
 * elementów tablice scalamy ju¿ w odpowiedniej kolejnoœci.
 *
 */
public class MergeSort implements MySort {
    @Override
    public void sort(int[] array) {
        sortRange(array, 0, (array.length - 1));
    }

    private void sortRange(int[] array, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int middleIndex = startIndex + (endIndex - startIndex) / 2;

            /* rekurencyjne dzielenie tablicy na dwie czêœci */
            sortRange(array, startIndex, middleIndex);
            sortRange(array, middleIndex + 1, endIndex);

            /*
             * scalanie podzielonych tablic, z jednoczesnym sortowaniem (scalona tablica
             * jest posortowan¹ wersj¹ podtablic)
             */
            merge(array, startIndex, middleIndex, endIndex);
        }
    }

    /* scalanie tablic z jednoczesnym sortowaniem */
    private void merge(int[] array, int startIndex, int middleIndex, int endIndex) {
        int leftSubArrayLength = middleIndex - startIndex + 1;
        int rightSubArrayLength = endIndex - middleIndex;

        int[] leftArray = new int[leftSubArrayLength];
        int[] rightArray = new int[rightSubArrayLength];

        for (int i = 0; i < leftSubArrayLength; i++) {
            leftArray[i] = array[startIndex + i];
        }
        for (int j = 0; j < rightSubArrayLength; j++) {
            rightArray[j] = array[middleIndex + 1 + j];
        }

        int leftIndex = 0;
        int rightIndex = 0;
        int mainIndex = startIndex;

        while (leftIndex < leftSubArrayLength && rightIndex < rightSubArrayLength) {
            if (leftArray[leftIndex] <= rightArray[rightIndex]) {
                array[mainIndex] = leftArray[leftIndex];
                leftIndex++;
            } else {
                array[mainIndex] = rightArray[rightIndex];
                rightIndex++;
            }
            mainIndex++;
        }

        while (leftIndex < leftSubArrayLength) {
            array[mainIndex] = leftArray[leftIndex];
            leftIndex++;
            mainIndex++;
        }
        while (rightIndex < rightSubArrayLength) {
            array[mainIndex] = rightArray[rightIndex];
            rightIndex++;
            mainIndex++;
        }
    }

}
