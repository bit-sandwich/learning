package bitsandwich.learning.algorithm.sort;

public class InsertionSorterTest extends AbstractIntSorterTest {

    @Override
    IntSorter getSorter() {
        return new InsertionSorter();
    }
}