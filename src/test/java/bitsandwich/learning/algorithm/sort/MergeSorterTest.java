package bitsandwich.learning.algorithm.sort;

public class MergeSorterTest extends AbstractIntSorterTest {

    @Override
    IntSorter getSorter() {
        return new MergeSorter();
    }
}