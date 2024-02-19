package org.example.binarySerarch;

public class Main {
    public static void main(String[] args) {
        int[] array = generateArray(128);
        int index = BinarySearch.searchItemIndex(array, 128);
        System.out.println("index = " + index);
    }


    private static int[] generateArray(int n) {
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        return array;
    }

}
