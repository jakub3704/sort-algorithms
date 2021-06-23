# Sorting Algorithms
```
Implementation of basic sorting algorithms with description, which is my understanding of algorithm.

Used technologies:
    - Java 12
    - JUnit 5.
    
    *I will add description in english on later date.
```

# Algorytmy Sortuj¹ce
```
Implementacja podstawowych algorytmów sortowania wraz z opisem, który jest moim rozumieniem algorytmu. 

Zastosowane technologie:
    - Java 12
    - JUnit 5.
```

# Algorytmy:
## Buble Sort (Algorytm sortowania b¹belkowego)  
```
Sortowanie przez porównywanie dwóch kolejnych elementów i zamianie ich kolejnoœci je¿eli jest to potrzebne. 
W celu optymalizacji algorytmu wprowadza siê zmienna informuj¹c¹ o tym czy przy kolejnej iteracji nast¹pi³a zamiana
kolejnych elementów, dziêki czemu sortowanie koñczy siê wtedy kiedy przy kolejnej iteracji sprawdzania nie nastêpuje zamiana elementów.
```
## Combsort (Algorytm sortowania grzebieniowego)
```
Sortowanie oparte na sortowaniu b¹belkowym, porównywanie dwóch elementów odbywa siê zaczynaj¹c od porównywania elementów skrajnych a potem odleg³ych 
od siebie o rozpiêtoœæ wynikaj¹c¹ z podzia³u rozpiêtoœci przez liczbê 1.3, odrzuca czêœæ u³amkow¹. Liczba 1.3 zosta³a okreœlona empirycznie. 
Algorytm zaczyna zachowywaæ siê tak samo jak sortowanie b¹belkowe dla rozpiêtoœci równej 1.
```
## Selection Sort (Algorytm sortowania przez wybieranie)
```
Sortowanie polega na wyszukaniu najmniejszej (lub najwiêkszej) wartoœci i wstawieniu jej w odpowiednie miejsce dla kolejnych iteracji.
```
## Insertion Sort (Algorytm sortowania przez wstawianie)
```
Sortowanie przez wstawianie kolejnych elementów w odpowiednie miejsce. Polega na wybraniu jednego elementu i wstawianiu go w odpowiednie miejsce 
posortowanej listy, która roœnie z ka¿d¹ iteracj¹ (posortowana lista znajduje siê na pocz¹tku listy wejœciowej). Wyszukiwanie odpowiedniego miejsca zatem 
polega na sprawdzeniu czy dana wartoœæ jest mniejsza od wartoœci poprzedniej z listy.
```
## Shellsort (Algorytm sortowania Shella)
```
Sortowanie przez porównywanie elementów znajduj¹cych siê w zadanej odleg³oœci od siebie (przy ka¿dej iteracji odleg³oœæ pomiêdzy sprawdzanymi elementami siê zmienia.
```
## Quick Sort (Algorytm sortowania szybkiego)
```
Sortowanie polega na wybraniu z tablicy elementu rozdzielaj¹cego, nastêpnie podzieleniu tablicy na dwa fragmenty, Do pierwszego fragmentu przenoszone 
s¹ elementy mniejsze od elementu dziel¹cego a do drugiego wiêksze. Nastêpnie rekurencyjnie sortuje siê podzielone tablice, a¿ do momentu, 
w którym po podziale tablica zawiera 1 element.
 ```
 
## Merge Sort (Algorytm sortowania przez scalanie)
```
Sortowanie przez zastosowanie metody dziel i zwyciê¿aj. Najpierw rekurencyjnie tworzymy podzia³ tablicy, 
nastêpnie zaczynaj¹c od najmniejszych elementów tablice scalamy ju¿ w odpowiedniej kolejnoœci.
 ```
 
## Heap Sort (Algorytm Sortowania przez kopcowanie)
```
Sortowanie sk³ada siê z dwóch faz, w pierwszej fazie tworzony jest kopiec w taki sposób aby na górze kopca znajdowa³ siê element najwiêkszy. 
W drugiej fazie kopiec jest w³aœciwie sortowany przez wyci¹ganie elementów oraz zreorganizowanie kopca.
```

## Bucket Sort (Algorytm sortowania kube³kowego)
```
Sortowanie polega na utworzeniu kube³ków, a nastêpnie w odpowiedni sposób przypisaniu do nich liczb. Po utworzeniu i wype³nieniu kube³ków, 
dowolnym algorytmem sortuje siê kube³ki zawieraj¹ce liczby, po czym wypisuje siê liczby do tablicy.
```