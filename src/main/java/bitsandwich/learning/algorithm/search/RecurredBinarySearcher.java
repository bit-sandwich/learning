package bitsandwich.learning.algorithm.search;

import bitsandwich.util.ArrayUtil;

public class RecurredBinarySearcher implements IntSearcher {

    public int search(int[] array, int target) {
        if (ArrayUtil.isEmpty(array)) {
            return -1;
        }

        return this.internalSearh(array, target, 0, array.length - 1);
    }

    public int internalSearh(int[] array, int target, int start, int end) {
        if (start == end) {
            return array[end] == target ? end : -1;
        }

        int ref = (end + start) / 2;
        int refElement = array[ref];
        if (refElement == target) {
            return ref;
        }

        if (refElement < target) {
            start = ref + 1;
        } else {
            end = ref - 1;
        }
        return this.internalSearh(array, target, start, end);
    }
}