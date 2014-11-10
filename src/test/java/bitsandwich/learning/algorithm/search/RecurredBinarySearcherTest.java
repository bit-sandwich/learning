package bitsandwich.learning.algorithm.search;

public class RecurredBinarySearcherTest extends AbstractIntSearcherTest {

    @Override
    IntSearcher getSearcher() {
        return new RecurredBinarySearcher();
    }
    
}