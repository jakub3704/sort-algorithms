package main.java;

/**
 * Algorytm Sortowania przez wybieranie (Selection Sort)
 *
 * Sortowanie polega na wyszukaniu najmniejszej (lub najwi�kszej) warto�ci i
 * wstawieniu jej w odpowiednie miejsce dla kolejnych iteracji.
 */

public class SelectionSort implements MySort  {
    @Override
    public void sort(int[] array) {
        /*
         * P�tla, w kt�rej po 1 iteracji na docelowym miejscu pocz�wszy od indeksu=0
         * znajduje si� warto�� najmniejsza
         */
        for (int i = 0; i < array.length; i++) {
            /* Utworzenie tymczasowej zmiennej pami�taj�cej index warto�ci minimalnej */
            int minIndex = i;

            /*
             * P�tla wyszukuje warto�� minimaln� dla danej iteracji (wszystkie wcze�niejsze
             * warto�ci s� ju� mniejsze)
             */
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            /*
             * Je�eli warto�� minimalna jest inna ni� bie��cy indeks iteracji nale�y
             * zamieni� j� z bie��c� pozycj�
             */
            if (minIndex != i) {
                int swap = array[i];
                array[i] = array[minIndex];
                array[minIndex] = swap;
            }

        }
    }
}
