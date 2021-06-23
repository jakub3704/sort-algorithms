package main.java;

/**
 * Algorytm sortowania b�belkowego (Bubble Sort)
 *
 * Sortowanie przez por�wnywanie dw�ch kolejnych element�w i zamianie ich
 * kolejno�ci je�eli jest to potrzebne. W celu optymalizacji algorytmu wprowadza
 * si� zmienna informuj�c� o tym czy przy kolejnej iteracji nast�pi�a zamiana
 * kolejnych element�w, dzi�ki czemu sortowanie ko�czy si� wtedy kiedy przy
 * kolejnej iteracji sprawdzania nie nast�puje zamiana element�w.
 *
 */
public class BubbleSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * Wprowadzamy zmienna mowi�c� o tym czy nast�pila zamiana element�w podczas
         * iteracji
         */
        boolean haveSwapped = false;
        /*
         * Zmienna okre�laj�ca iteracje, wprowadzona w celu ograniczenia maksymalnej
         * liczby iteracji przy za�o�eniu pesymistycznym, czyli w kt�rym zamiana
         * element�w nast�puje n*n.
         */
        int itteration = 0;
        /*
         * P�tla nadrz�dna, wykonywana do momentu osi�gni�cia maksymalnej liczby
         * potrzebnych iteracji lub momentu w kt�rym nie nast�pi�a �adna zamiana
         * element�w
         */
        do {
            haveSwapped = false;
            /*
             * P�tla sprawdzaj�ca dwa kolejne elementy i zamieniaj�ca ich kolejneo�� w razie
             * konieczno�ci.
             */
            for (int i = 0; i < array.length - 1 - itteration; i++) {
                if (array[i] > array[i + 1]) {
                    int swap = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = swap;
                    haveSwapped = true;
                }
            }
            itteration++;
        } while (haveSwapped && itteration < array.length - 1);

    }
}
