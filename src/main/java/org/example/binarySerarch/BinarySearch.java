package org.example.binarySerarch;

public class BinarySearch {
    public static int searchItemIndex(int[] currentArray, int item) {
        int low = 0;
        int height = currentArray.length - 1;
        int searchIndex = -1;
        int countIteration = 0;
        while (low <= height) {
            int indexMid = (low + height) / 2;
            System.out.println("Count iteration: " + countIteration);
            if (item == currentArray[indexMid]) {
                searchIndex = indexMid;
                break;
            }

            if (item < currentArray[indexMid]) {
                height = indexMid - 1;
            }
            if (item > currentArray[indexMid]) {
                low = indexMid + 1;
            }
            countIteration++;
        }
        return searchIndex;
    }

}
