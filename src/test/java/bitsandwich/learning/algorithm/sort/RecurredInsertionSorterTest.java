package bitsandwich.learning.algorithm.sort;

public class RecurredInsertionSorterTest extends AbstractIntSorterTest {

    @Override
    IntSorter getSorter() {
        return new RecurredInsertionSorter();
    }
}