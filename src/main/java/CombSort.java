package main.java;

/**
 * Algorytm Sortowania grzebieniowego (Combsort)
 *
 * Sortowanie oparte na sortowaniu b�belkowym, por�wnywanie dw�ch element�w
 * odbywa si� zaczynaj�c od por�wnywania element�w skrajnych a potem odleg�ych
 * od siebie o rozpi�to�� wynikaj�c� z podzia�u rozpi�to�ci przez liczb� 1.3,
 * odrzuca cz�� u�amkow�. Liczba 1.3 zosta�a okre�lona empirycznie. Algorytm
 * zaczyna zachowywa� si� tak samo jak sortowanie b�belkowe dla rozpi�to�ci
 * r�wnej 1.
 */
public class CombSort implements MySort {
    @Override
    public void sort(int[] array) {
        /*
         * Wprowadzamy zmienna mowi�c� o tym czy nast�pila zamiana element�w podczas
         * iteracji
         */
        boolean haveSwapped = false;
        /*
         * Ustalamy pocz�tkow� rozpietoj�� pomi�dzy elemetami skrajnymi.
         */
        int gap = array.length;
        /*
         * P�tla nadrz�dna, wykonywana do momentu osi�gni�cia minimalnej rozpieto�ci 1
         * oraz momentu w kt�rym nie nast�pi�a �adna zamiana element�w
         */
        do {
            haveSwapped = false;
            gap = calculateGap(gap);
            /*
             * P�tla sprawdzaj�ca dwa elementy i zamieniaj�ca ich kolejneo�� w razie
             * konieczno�ci.
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
         * wykonujemy dalej je�eli nast�pi�a zamiana lub rozpi�to�� nie osi�gn�a
         * warto�ci 1
         */
    }

    /**
     * Funkcja obliczaj�ca rozpi�to��. Dzieli rozpi�to�� tera�niejsz� przez
     * wsp�czynnik 1.3 i odrzuca to co po przecinku.
     *
     * @param currentGap - rozpi�to�� tera�niejsza
     * @return nowa rozpi�to�� obliczona
     */
    public int calculateGap(int currentGap) {
        int gap = (currentGap * 10) / 13;
        return (gap < 1) ? 1 : gap;
    }
}
