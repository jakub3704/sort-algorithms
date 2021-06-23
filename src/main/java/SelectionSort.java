package main.java;

/**
 * Algorytm Sortowania przez wybieranie (Selection Sort)
 *
 * Sortowanie polega na wyszukaniu najmniejszej (lub najwiêkszej) wartoœci i
 * wstawieniu jej w odpowiednie miejsce dla kolejnych iteracji.
 */

public class SelectionSort implements MySort  {
    @Override
    public void sort(int[] array) {
        /*
         * Pêtla, w której po 1 iteracji na docelowym miejscu pocz¹wszy od indeksu=0
         * znajduje siê wartoœæ najmniejsza
         */
        for (int i = 0; i < array.length; i++) {
            /* Utworzenie tymczasowej zmiennej pamiêtaj¹cej index wartoœci minimalnej */
            int minIndex = i;

            /*
             * Pêtla wyszukuje wartoœæ minimaln¹ dla danej iteracji (wszystkie wczeœniejsze
             * wartoœci s¹ ju¿ mniejsze)
             */
            for (int j = i + 1; j < array.length; j++) {
                if (array[minIndex] > array[j]) {
                    minIndex = j;
                }
            }

            /*
             * Je¿eli wartoœæ minimalna jest inna ni¿ bie¿¹cy indeks iteracji nale¿y
             * zamieniæ j¹ z bie¿¹c¹ pozycj¹
             */
            if (minIndex != i) {
                int swap = array[i];
                array[i] = array[minIndex];
                array[minIndex] = swap;
            }

        }
    }
}
