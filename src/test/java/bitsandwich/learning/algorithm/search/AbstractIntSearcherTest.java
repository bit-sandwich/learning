package bitsandwich.learning.algorithm.search;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractIntSearcherTest {

    abstract IntSearcher getSearcher();

    @Test
    public void test() {
        int[] array = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Assert.assertEquals(3, this.getSearcher().search(array, 3));
        Assert.assertEquals(0, this.getSearcher().search(array, 0));
        Assert.assertEquals(8, this.getSearcher().search(array, 9));
        Assert.assertEquals(5, this.getSearcher().search(array, 6));
    }

    @Test
    public void testUpOuter() {
        int[] array = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Assert.assertEquals(-1, this.getSearcher().search(array, 10));
    }

    @Test
    public void testDownOuter() {
        int[] array = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Assert.assertEquals(-1, this.getSearcher().search(array, -1));
    }

    @Test
    public void testMiddleMiss() {
        int[] array = new int[] {0, 1, 2, 3, 4, 6, 7, 8, 9};
        Assert.assertEquals(-1, this.getSearcher().search(array, 5));
    }

    @Test
    public void testEmptyArray() {
        int[] array = new int[] {};
        Assert.assertEquals(-1, this.getSearcher().search(array, 5));
    }

    @Test
    public void testNullArray() {
        int[] array = null;
        Assert.assertEquals(-1, this.getSearcher().search(array, 5));
    }

    @Test
    public void testSingleElement() {
        int[] array = new int[] {0};
        Assert.assertEquals(0, this.getSearcher().search(array, 0));
        Assert.assertEquals(-1, this.getSearcher().search(array, -1));
        Assert.assertEquals(-1, this.getSearcher().search(array, 1));
    }
}