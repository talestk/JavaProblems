package org.example;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class GreedyIsGoodTest {
    @Test
    public void testExample() {
        assertEquals("Score for [5,1,3,4,1] must be 250:", 250, GreedyIsGood.greedy(new int[]{5,1,3,4,1}));
        assertEquals("Score for [1,1,1,3,1] must be 1100:", 1100, GreedyIsGood.greedy(new int[]{1,1,1,3,1}));
        assertEquals("Score for [2,4,4,5,4] must be 450:", 450, GreedyIsGood.greedy(new int[]{2,4,4,5,4}));
    }
}