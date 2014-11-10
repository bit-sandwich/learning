package bitsandwich.learning.algorithm.sort;

import bitsandwich.util.ArrayUtil;

public class InsertionSorter implements IntSorter {

    public int[] sort(int[] array) {
        if (ArrayUtil.isEmpty(array) || array.length == 1) {
            return array;
        }

        for (int i = 1; i < array.length; i++) {
            int current = array[i];
            for (int j = i - 1; j >= 0; j--) {
                int target = array[j];
                if (target < current) {
                    break;
                }
                array[j + 1] = target;
                array[j] = current;
            }
        }
        return array;
    }
}