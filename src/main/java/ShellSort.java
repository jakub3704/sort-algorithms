package main.java;

/**
 * Algorytm Sortowania Shella (Shellsort)
 *
 * Sortowanie przez porównywanie elementów znajduj¹cych siê w zadanej odleg³oœci
 * od siebie (przy ka¿dej iteracji odleg³oœæ pomiêdzy sprawdzanymi elementami
 * siê zmienia.
 */

public class ShellSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * Pêtla zajmuj¹ca siê okreœleniem odstêpu pomiêdzy sprawdzonymi elementami,
         * istnieje wiele ró¿nych ci¹gów odstêpów.
         */
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int numberToCheck = array[i];
                int p = i;
                /*
                 * Pêtla sprawdzaj¹ca dwa elementy i zamieniaj¹ca ich kolejneoœæ w razie
                 * koniecznoœci.
                 */
                while (p >= gap && numberToCheck < array[p - gap]) {
                    array[p] = array[p - gap];
                    p -= gap;
                }
                array[p] = numberToCheck;
            }
        }
    }
}
