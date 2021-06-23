# Sorting Algorithms
```
Implementation of basic sorting algorithms with description, which is my understanding of algorithm.

Used technologies:
    - Java 12
    - JUnit 5.
    
    *I will add description in english on later date.
```

# Algorytmy Sortuj�ce
```
Implementacja podstawowych algorytm�w sortowania wraz z opisem, kt�ry jest moim rozumieniem algorytmu. 

Zastosowane technologie:
    - Java 12
    - JUnit 5.
```

# Algorytmy:
## Buble Sort (Algorytm sortowania b�belkowego)  
```
Sortowanie przez por�wnywanie dw�ch kolejnych element�w i zamianie ich kolejno�ci je�eli jest to potrzebne. 
W celu optymalizacji algorytmu wprowadza si� zmienna informuj�c� o tym czy przy kolejnej iteracji nast�pi�a zamiana
kolejnych element�w, dzi�ki czemu sortowanie ko�czy si� wtedy kiedy przy kolejnej iteracji sprawdzania nie nast�puje zamiana element�w.
```
## Combsort (Algorytm sortowania grzebieniowego)
```
Sortowanie oparte na sortowaniu b�belkowym, por�wnywanie dw�ch element�w odbywa si� zaczynaj�c od por�wnywania element�w skrajnych a potem odleg�ych 
od siebie o rozpi�to�� wynikaj�c� z podzia�u rozpi�to�ci przez liczb� 1.3, odrzuca cz�� u�amkow�. Liczba 1.3 zosta�a okre�lona empirycznie. 
Algorytm zaczyna zachowywa� si� tak samo jak sortowanie b�belkowe dla rozpi�to�ci r�wnej 1.
```
## Selection Sort (Algorytm sortowania przez wybieranie)
```
Sortowanie polega na wyszukaniu najmniejszej (lub najwi�kszej) warto�ci i wstawieniu jej w odpowiednie miejsce dla kolejnych iteracji.
```
## Insertion Sort (Algorytm sortowania przez wstawianie)
```
Sortowanie przez wstawianie kolejnych element�w w odpowiednie miejsce. Polega na wybraniu jednego elementu i wstawianiu go w odpowiednie miejsce 
posortowanej listy, kt�ra ro�nie z ka�d� iteracj� (posortowana lista znajduje si� na pocz�tku listy wej�ciowej). Wyszukiwanie odpowiedniego miejsca zatem 
polega na sprawdzeniu czy dana warto�� jest mniejsza od warto�ci poprzedniej z listy.
```
## Shellsort (Algorytm sortowania Shella)
```
Sortowanie przez por�wnywanie element�w znajduj�cych si� w zadanej odleg�o�ci od siebie (przy ka�dej iteracji odleg�o�� pomi�dzy sprawdzanymi elementami si� zmienia.
```
## Quick Sort (Algorytm sortowania szybkiego)
```
Sortowanie polega na wybraniu z tablicy elementu rozdzielaj�cego, nast�pnie podzieleniu tablicy na dwa fragmenty, Do pierwszego fragmentu przenoszone 
s� elementy mniejsze od elementu dziel�cego a do drugiego wi�ksze. Nast�pnie rekurencyjnie sortuje si� podzielone tablice, a� do momentu, 
w kt�rym po podziale tablica zawiera 1 element.
 ```
 
## Merge Sort (Algorytm sortowania przez scalanie)
```
Sortowanie przez zastosowanie metody dziel i zwyci�aj. Najpierw rekurencyjnie tworzymy podzia� tablicy, 
nast�pnie zaczynaj�c od najmniejszych element�w tablice scalamy ju� w odpowiedniej kolejno�ci.
 ```
 
## Heap Sort (Algorytm Sortowania przez kopcowanie)
```
Sortowanie sk�ada si� z dw�ch faz, w pierwszej fazie tworzony jest kopiec w taki spos�b aby na g�rze kopca znajdowa� si� element najwi�kszy. 
W drugiej fazie kopiec jest w�a�ciwie sortowany przez wyci�ganie element�w oraz zreorganizowanie kopca.
```

## Bucket Sort (Algorytm sortowania kube�kowego)
```
Sortowanie polega na utworzeniu kube�k�w, a nast�pnie w odpowiedni spos�b przypisaniu do nich liczb. Po utworzeniu i wype�nieniu kube�k�w, 
dowolnym algorytmem sortuje si� kube�ki zawieraj�ce liczby, po czym wypisuje si� liczby do tablicy.
```