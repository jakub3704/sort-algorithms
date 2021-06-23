package main.java;

/**
 * Algorytm Sortowania przez wstawianie (Insertion Sort)
 *
 * Sortowanie przez wstawianie kolejnych element�w w odpowiednie miejsce. Polega
 * na wybraniu jednego elementu i wstawianiu go w odpowiednie miejsce
 * posortowanej listy, kt�ra ro�nie z ka�d� iteracj� (posortowana lista znajduje
 * si� na pocz�tku listy wej�ciowej). Wyszukiwanie odpowiedniego miejsca zatem
 * polega na sprawdzeniu czy dana warto�� jest mniejsza od warto�ci poprzedniej
 * z listy.
 */
public class InsertionSort implements MySort  {
    @Override
    public void sort(int[] array) {

        for (int i = 0; i < array.length; i++) {
            /* Zapami�tujemy liczb� do sprawdzenia */
            int numberToCheck = array[i];
            int p = i;
            /*
             * P�tla sprawdza czy liczba sprawdzana jest mniejsza od warto�ci liczby
             * poprzedniej. Je�eli tak to przesuwa warto�� poprzednia o 1 pole wy�ej, i
             * przyst�puje do sprawdzenia kolejnej warto�ci wcze�niejszej.
             */
            while (p > 0 && numberToCheck < array[p - 1]) {
                array[p] = array[p - 1];
                p--;
            }
            /*
             * Przez to �e wcze�niej nie zamienili�my liczb, a tylko przesuwali�my liczb�
             * wi�ksz� o 1 pole, po wyj�ciu z p�tli nale�y liczb� sprawdzan� wstawi� w
             * odpowiednie (puste) miejsce.
             */
            array[p] = numberToCheck;
        }
    }
}
