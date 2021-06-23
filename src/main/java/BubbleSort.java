package main.java;

/**
 * Algorytm sortowania b¹belkowego (Bubble Sort)
 *
 * Sortowanie przez porównywanie dwóch kolejnych elementów i zamianie ich
 * kolejnoœci je¿eli jest to potrzebne. W celu optymalizacji algorytmu wprowadza
 * siê zmienna informuj¹c¹ o tym czy przy kolejnej iteracji nast¹pi³a zamiana
 * kolejnych elementów, dziêki czemu sortowanie koñczy siê wtedy kiedy przy
 * kolejnej iteracji sprawdzania nie nastêpuje zamiana elementów.
 *
 */
public class BubbleSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * Wprowadzamy zmienna mowi¹c¹ o tym czy nast¹pila zamiana elementów podczas
         * iteracji
         */
        boolean haveSwapped = false;
        /*
         * Zmienna okreœlaj¹ca iteracje, wprowadzona w celu ograniczenia maksymalnej
         * liczby iteracji przy za³o¿eniu pesymistycznym, czyli w którym zamiana
         * elementów nastêpuje n*n.
         */
        int itteration = 0;
        /*
         * Pêtla nadrzêdna, wykonywana do momentu osi¹gniêcia maksymalnej liczby
         * potrzebnych iteracji lub momentu w którym nie nast¹pi³a ¿adna zamiana
         * elementów
         */
        do {
            haveSwapped = false;
            /*
             * Pêtla sprawdzaj¹ca dwa kolejne elementy i zamieniaj¹ca ich kolejneoœæ w razie
             * koniecznoœci.
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
