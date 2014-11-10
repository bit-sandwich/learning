package bitsandwich.learning.algorithm.sort;

public class RecurredInsertionSorter implements IntSorter {

    public int[] sort(int[] array) {
        if (array == null || array.length < 2) {
            return array;
        }

        return this.internalSort(array, array.length - 1);
    }

    private int[] internalSort(int[] array, int targetIndex) {
        if (targetIndex == 0) {
            return array;
        }

        array = this.internalSort(array, targetIndex - 1);

        int targetElement = array[targetIndex];
        int insertIndex = targetIndex - 1;
        while (insertIndex >= 0) {
            int insertElement = array[insertIndex];
            if (insertElement <= targetElement) {
                break;
            }
            array[insertIndex + 1] = insertElement;
            insertIndex--;
        }

        array[insertIndex + 1] = targetElement;

        return array;
    }
}