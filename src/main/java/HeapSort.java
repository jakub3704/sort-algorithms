package main.java;

/**
 * Algorytm Sortowania przez kopcowanie (Heap Sort)
 *
 * Sortowanie sk³ada siê z dwóch faz, w pierwszej fazie tworzony jest kopiec w
 * taki sposób aby na górze kopca znajdowa³ siê element najwiêkszy. W drugiej
 * fazie kopiec jest w³aœciwie sortowany przez wyci¹ganie elementów oraz
 * zreorganizowanie kopca.
 */
public class HeapSort implements MySort {
    @Override
    public void sort(int array[]) {
        /*
         * "Zamieniamy" tablice na kopiec. Najwiêkszy element bêdzie znajdowaæ siê na
         * pocz¹tku kopca
         */
        for (int i = array.length / 2 - 1; i >= 0; i--) {
            heapify(array, array.length, i);
        }
        /*
         * Wyci¹gamy pojedyncze elementy z kopca zaczynaj¹c od najwiêkszego, poprzez
         * zamianê elementu pierwszego z ostatnim, a nastêpnie zreorganizowanie kopca, z
         * pominiêciem elementu wyci¹gniêtego (ostatniego).
         */
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heapify(array, i, 0);
        }
    }

    /**
     * Funkcja tworz¹ca kopiec oraz porz¹dkuj¹ca go w taki sposób aby na pocz¹tku
     * kopca znalaz³a siê wartoœæ najwiêksza.
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
