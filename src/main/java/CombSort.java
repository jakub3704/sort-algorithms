package main.java;

/**
 * Algorytm Sortowania grzebieniowego (Combsort)
 *
 * Sortowanie oparte na sortowaniu b¹belkowym, porównywanie dwóch elementów
 * odbywa siê zaczynaj¹c od porównywania elementów skrajnych a potem odleg³ych
 * od siebie o rozpiêtoœæ wynikaj¹c¹ z podzia³u rozpiêtoœci przez liczbê 1.3,
 * odrzuca czêœæ u³amkow¹. Liczba 1.3 zosta³a okreœlona empirycznie. Algorytm
 * zaczyna zachowywaæ siê tak samo jak sortowanie b¹belkowe dla rozpiêtoœci
 * równej 1.
 */
public class CombSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * Wprowadzamy zmienna mowi¹c¹ o tym czy nast¹pila zamiana elementów podczas
         * iteracji
         */
        boolean haveSwapped = false;
        /*
         * Ustalamy pocz¹tkow¹ rozpietojœæ pomiêdzy elemetami skrajnymi.
         */
        int gap = array.length;
        /*
         * Pêtla nadrzêdna, wykonywana do momentu osi¹gniêcia minimalnej rozpietoœci 1
         * oraz momentu w którym nie nast¹pi³a ¿adna zamiana elementów
         */
        do {
            haveSwapped = false;
            gap = calculateGap(gap);
            /*
             * Pêtla sprawdzaj¹ca dwa elementy i zamieniaj¹ca ich kolejneoœæ w razie
             * koniecznoœci.
             */
            for (int i = 0; i < array.length - gap; i++) {
                if (array[i] > array[i + gap]) {
                    int swap = array[i];
                    array[i] = array[i + gap];
                    array[i + gap] = swap;
                    haveSwapped = true;
                }
            }
        } while (haveSwapped || gap != 1);
        /*
         * wykonujemy dalej je¿eli nast¹pi³a zamiana lub rozpiêtoœæ nie osi¹gnê³a
         * wartoœci 1
         */
    }

    /**
     * Funkcja obliczaj¹ca rozpiêtoœæ. Dzieli rozpiêtoœæ teraŸniejsz¹ przez
     * wspó³czynnik 1.3 i odrzuca to co po przecinku.
     *
     * @param currentGap - rozpiêtoœæ teraŸniejsza
     * @return nowa rozpiêtoœæ obliczona
     */
    public int calculateGap(int currentGap) {
        int gap = (currentGap * 10) / 13;
        return (gap < 1) ? 1 : gap;
    }
}
