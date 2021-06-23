package main.java;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        MySort sort = new HeapSort();
        int A[] = { 1, 3, 7, 6, 2 };
        System.out.println(Arrays.toString(A));

        sort.sort(A);
        System.out.println(Arrays.toString(A));

    }
}
