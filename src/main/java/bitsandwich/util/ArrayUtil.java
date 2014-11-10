package bitsandwich.util;

public final class ArrayUtil {
    private ArrayUtil() {
        
    }

    public static boolean isEmpty(int[] array) {
        return array == null || array.length == 0;
    }
}