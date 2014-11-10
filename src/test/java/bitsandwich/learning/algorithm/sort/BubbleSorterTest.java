package bitsandwich.learning.algorithm.sort;

public class BubbleSorterTest extends AbstractIntSorterTest {

    @Override
    IntSorter getSorter() {
        return new BubbleSorter();
    }
}