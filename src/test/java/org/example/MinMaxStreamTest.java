package org.example;

import org.junit.Test;

import java.util.stream.Stream;

public class MinMaxStreamTest {
    @Test
    public void testStreamMinMax() {
        MinMaxStream.find(Stream.of(3, 1, 4, 1, 5, 9));

    }
}
