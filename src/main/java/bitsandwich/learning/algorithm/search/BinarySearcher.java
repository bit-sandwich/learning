package bitsandwich.learning.algorithm.search;

import bitsandwich.util.ArrayUtil;

public class BinarySearcher implements IntSearcher {

    public int search(int[] array, int target) {
        if (ArrayUtil.isEmpty(array) || target < array[0] || target > array[array.length - 1]) {
            return -1;
        }

        int start = 0;
        int end = array.length - 1;
        for (int ref = array.length / 2; end >= start; ref = (end + start) / 2) {
            int refElement = array[ref];
            if (refElement == target) {
                return ref;
            }

            if (refElement < target) {
                start = ref + 1;
            } else {
                end = ref - 1;
            }
        }
        return target == array[end] ? end : -1;
    }
}