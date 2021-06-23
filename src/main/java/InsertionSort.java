package main.java;

/**
 * Algorytm Sortowania przez wstawianie (Insertion Sort)
 *
 * Sortowanie przez wstawianie kolejnych elementów w odpowiednie miejsce. Polega
 * na wybraniu jednego elementu i wstawianiu go w odpowiednie miejsce
 * posortowanej listy, która roœnie z ka¿d¹ iteracj¹ (posortowana lista znajduje
 * siê na pocz¹tku listy wejœciowej). Wyszukiwanie odpowiedniego miejsca zatem
 * polega na sprawdzeniu czy dana wartoœæ jest mniejsza od wartoœci poprzedniej
 * z listy.
 */
public class InsertionSort implements MySort  {
    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            /* Zapamiêtujemy liczbê do sprawdzenia */
            int numberToCheck = array[i];
            int p = i;
            /*
             * Pêtla sprawdza czy liczba sprawdzana jest mniejsza od wartoœci liczby
             * poprzedniej. Je¿eli tak to przesuwa wartoœæ poprzednia o 1 pole wy¿ej, i
             * przystêpuje do sprawdzenia kolejnej wartoœci wczeœniejszej.
             */
            while (p > 0 && numberToCheck < array[p - 1]) {
                array[p] = array[p - 1];
                p--;
            }
            /*
             * Przez to ¿e wczeœniej nie zamieniliœmy liczb, a tylko przesuwaliœmy liczbê
             * wiêksz¹ o 1 pole, po wyjœciu z pêtli nale¿y liczbê sprawdzan¹ wstawiæ w
             * odpowiednie (puste) miejsce.
             */
            array[p] = numberToCheck;
        }
    }
}
