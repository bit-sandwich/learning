package bitsandwich.learning.algorithm.sort;

public class BubbleSorter implements IntSorter {

    public int[] sort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = array.length - 1; j > i; j--) {
                int a = array[j];
                int b = array[j - 1];
                if (a < b) {
                    array[j - 1] = a;
                    array[j] = b;
                }
            }
        }
        return array;
    }
}