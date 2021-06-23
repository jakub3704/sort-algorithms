package main.java;

/**
 * Algorytm Sortowania przez kopcowanie (Heap Sort)
 *
 * Sortowanie sk�ada si� z dw�ch faz, w pierwszej fazie tworzony jest kopiec w
 * taki spos�b aby na g�rze kopca znajdowa� si� element najwi�kszy. W drugiej
 * fazie kopiec jest w�a�ciwie sortowany przez wyci�ganie element�w oraz
 * zreorganizowanie kopca.
 */
public class HeapSort implements MySort {
    @Override
    public void sort(int array[]) {
        /*
         * "Zamieniamy" tablice na kopiec. Najwi�kszy element b�dzie znajdowa� si� na
         * pocz�tku kopca
         */
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        /*
         * Wyci�gamy pojedyncze elementy z kopca zaczynaj�c od najwi�kszego, poprzez
         * zamian� elementu pierwszego z ostatnim, a nast�pnie zreorganizowanie kopca, z
         * pomini�ciem elementu wyci�gni�tego (ostatniego).
         */
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    /**
     * Funkcja tworz�ca kopiec oraz porz�dkuj�ca go w taki spos�b aby na pocz�tku
     * kopca znalaz�a si� warto�� najwi�ksza.
     *
     */
    void heapify(int array[], int length, int i) {
        int rootIndex = i;
        int leftBranchIndex = 2 * i + 1;
        int rightBranchIndex = 2 * i + 2;

        if (leftBranchIndex < length && array[leftBranchIndex] > array[rootIndex])
            rootIndex = leftBranchIndex;

        if (rightBranchIndex < length && array[rightBranchIndex] > array[rootIndex])
            rootIndex = rightBranchIndex;

        if (rootIndex != i) {
            int swap = array[i];
            array[i] = array[rootIndex];
            array[rootIndex] = swap;

            heapify(array, length, rootIndex);
        }
    }
}
