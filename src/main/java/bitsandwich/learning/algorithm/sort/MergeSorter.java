package bitsandwich.learning.algorithm.sort;

public class MergeSorter implements IntSorter {

    public int[] sort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        return this.internalSort(array, 0, array.length - 1, new int[array.length]);
    }

    private int[] internalSort(int[] array, int start, int end, int[] tmpArray) {
        if (start == end) {
            return array;
        }

        int middle = (end - start) / 2 + start;
        this.internalSort(array, start, middle, tmpArray);
        this.internalSort(array, middle + 1, end, tmpArray);
        return this.merge(array, start, middle, end, tmpArray);
    }

    private int[] merge(int[] array, int start, int middle, int end, int[] tmpArray) {
        System.arraycopy(array, start, tmpArray, start, end - start + 1);
        int h = start;
        int i = start;
        int j = middle + 1;
        while (i <= middle && j <= end) {
            int refA = tmpArray[i];
            int refB = tmpArray[j];
            if (refA <= refB) {
                array[h] = refA;
                i++;
            } else {
                array[h] = refB;
                j++;
            }
            h++;
        }
        if (i > middle) {
            System.arraycopy(tmpArray, j, array, h, end - h + 1);
        } else if (j > end) {
            System.arraycopy(tmpArray, i, array, h, end - h + 1);
        }
        return array;
        
    }
}