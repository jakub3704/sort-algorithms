package main.java;

/**
 * Algorytm Sortowania Shella (Shellsort)
 *
 * Sortowanie przez por�wnywanie element�w znajduj�cych si� w zadanej odleg�o�ci
 * od siebie (przy ka�dej iteracji odleg�o�� pomi�dzy sprawdzanymi elementami
 * si� zmienia.
 */

public class ShellSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * P�tla zajmuj�ca si� okre�leniem odst�pu pomi�dzy sprawdzonymi elementami,
         * istnieje wiele r�nych ci�g�w odst�p�w.
         */
        for (int gap = array.length / 2; gap > 0; gap /= 2) {

            for (int i = gap; i < array.length; i++) {
                int numberToCheck = array[i];
                int p = i;
                /*
                 * P�tla sprawdzaj�ca dwa elementy i zamieniaj�ca ich kolejneo�� w razie
                 * konieczno�ci.
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
