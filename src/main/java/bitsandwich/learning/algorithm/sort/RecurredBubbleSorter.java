package bitsandwich.learning.algorithm.sort;

public class RecurredBubbleSorter implements IntSorter {
    public int[] sort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        return this.internalSort(array, array.length - 1);
    }

    private int[] internalSort(int[] array, int start) {
        if (start < 0) {
            return array;
        }

        this.internalSort(array, start - 1);
        for (int i = array.length - 1; i > start; i--) {
            int a = array[i];
            int b = array[i - 1];
            if (a >= b) {
                continue;
            }
            array[i] = b;
            array[i - 1] = a;
        }
        return array;
    }
}