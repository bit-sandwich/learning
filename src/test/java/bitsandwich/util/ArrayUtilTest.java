package bitsandwich.util;

import org.junit.Assert;
import org.junit.Test;

public class ArrayUtilTest {

    @Test
    public void testIsEmpty() {
        Assert.assertFalse(ArrayUtil.isEmpty(new int[] {1}));
        Assert.assertTrue(ArrayUtil.isEmpty(new int[] {}));
        Assert.assertTrue(ArrayUtil.isEmpty(null));
        
    }
}