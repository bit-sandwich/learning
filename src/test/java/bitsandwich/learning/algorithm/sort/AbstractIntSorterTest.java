package bitsandwich.learning.algorithm.sort;

import org.junit.Assert;
import org.junit.Test;

public abstract class AbstractIntSorterTest {

    abstract IntSorter getSorter();

    @Test
    public void test() {
        int[] origArray = new int[] {5, 1, 4, 2, 3};
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = this.getSorter().sort(origArray);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testEmptyArray() {
        int[] nullArray = null;
        Assert.assertNull(this.getSorter().sort(nullArray));
        Assert.assertArrayEquals(new int[] {}, this.getSorter().sort(new int[] {}));
    }

    @Test
    public void testOneElementArray() {
        Assert.assertArrayEquals(new int[] {1}, this.getSorter().sort(new int[] {1}));
    }

    @Test
    public void testTwoElementsArray() {
      int[] origArray = new int[] {2, 1};
      int[] expectedArray = new int[] {1, 2};
      int[] resultArray = this.getSorter().sort(origArray);
      Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testDuplicatedElements() {
        int[] origArray = new int[] {5, 1, 3, 4, 1, 2, 3};
        int[] expectedArray = new int[] {1, 1, 2, 3, 3, 4, 5};
        int[] resultArray = this.getSorter().sort(origArray);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testSortedArray() {
        int[] origArray = new int[] {1, 2, 3, 4, 5};
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = this.getSorter().sort(origArray);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }

    @Test
    public void testReversedArray() {
        int[] origArray = new int[] {5, 4, 3, 2, 1};
        int[] expectedArray = new int[] {1, 2, 3, 4, 5};
        int[] resultArray = this.getSorter().sort(origArray);
        Assert.assertArrayEquals(expectedArray, resultArray);
    }
}