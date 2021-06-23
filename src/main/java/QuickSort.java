package main.java;

/**
 * Algorytm Sortowania szybkiego (Quick Sort)
 *
 * Sortowanie polega na wybraniu z tablicy elementu rozdzielaj¹cego, nastêpnie
 * podzieleniu tablicy na dwa fragmenty, Do pierwszego fragmentu przenoszone s¹
 * elementy mniejsze od elementu dziel¹cego a do drugiego wiêksze. Nastêpnie
 * rekurencyjnie sortuje siê podzielone tablice, a¿ do momentu w którym po
 * podziale tablica zawiera 1 element.
 *
 */
public class QuickSort implements MySort {

    @Override
    public void sort(int[] array) {
        quickSortPivotStart(array, 0, array.length - 1);
    }

    /*
     * Sortowanie przez wybór elementu dziel¹cego na pocz¹tku tablicy
     */
    public void quickSortPivotStart(int array[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partitionPivotStart(array, startIndex, endIndex);

            quickSortPivotStart(array, startIndex, partitionIndex - 1);
            quickSortPivotStart(array, partitionIndex + 1, endIndex);
        }
    }

    private int partitionPivotStart(int array[], int pivotIndex, int endIndex) {
        int pivot = array[pivotIndex];
        int i = endIndex + 1;
        for (int j = endIndex; j > pivotIndex; j--) {
            if (array[j] >= pivot) {
                i--;
                swap(array, i, j);
            }
        }
        swap(array, i - 1, pivotIndex);
        return i - 1;
    }

    /*
     * Sortowanie przez wybór elementu dziel¹cego na koñcu tablicy
     */
    public void quickSortPivotEnd(int array[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int partitionIndex = partitionPivotEnd(array, startIndex, endIndex);

            quickSortPivotEnd(array, startIndex, partitionIndex - 1);
            quickSortPivotEnd(array, partitionIndex + 1, endIndex);
        }
    }

    private int partitionPivotEnd(int array[], int startIndex, int pivotIndex) {
        int pivot = array[pivotIndex];
        int i = startIndex - 1;
        for (int j = startIndex; j < pivotIndex; j++) {
            if (array[j] <= pivot) {
                i++;
                swap(array, i, j);
            }
        }
        swap(array, i + 1, pivotIndex);
        return i + 1;
    }

    /*
     * Sortowanie przez wybór elementu dziel¹cego w œrodku tablicy
     */
    public void quickSortPivotMiddle(int array[], int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int i = startIndex;
            int j = endIndex;
            partitionPivotMiddle(array, startIndex, endIndex, i, j);

            if (j > startIndex) {
                quickSortPivotMiddle(array, startIndex, j);
            }
            if (i < endIndex) {
                quickSortPivotMiddle(array, i, endIndex);
            }
        }
    }

    private void partitionPivotMiddle(int array[], int startIndex, int endIndex, int i, int j) {
        int pivotIndex = startIndex + (endIndex - startIndex) / 2;
        int pivot = array[pivotIndex];
        do {
            while (i < endIndex && pivot > array[i]) {
                i++;
            }

            while (j > startIndex && pivot < array[j]) {
                j--;
            }

            if (i <= j) {
                swap(array, i, j);
                i++;
                j--;
            }
        } while (i <= j);
    }

    private void swap(int[] array, int indexA, int indexB) {
        int swap = array[indexA];
        array[indexA] = array[indexB];
        array[indexB] = swap;
    }
}
