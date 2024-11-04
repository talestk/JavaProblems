package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MinMaxStream {
    public static void find(Stream<Integer> stream) {
        //Stream<Integer> stream = Stream.of(3, 1, 4, 1, 5, 9);
        Comparator<Integer> comparator = Comparator.naturalOrder();
        BiConsumer<Integer, Integer> minMaxConsumer = (min, max) -> System.out.println("Min: " + min + ", Max: " + max);

        findMinMax(stream, comparator, minMaxConsumer);
        // Output: Min: 1, Max: 9
    }


    /*
    Explanation:
    Collect Using Teeing:

    Collectors.teeing allows us to perform two separate Collector operations (here, finding the min and max) in a single
        pass over the stream.

    Collectors.minBy(order) finds the minimum element based on the provided comparator order. It returns an Optional
        with the min element, or Optional.empty() if the stream is empty.

    Collectors.maxBy(order) similarly finds the maximum element.

    The third argument in teeing takes the results of minBy and maxBy and combines them into a list
        (Arrays.asList(min.orElse(null), max.orElse(null))), handling cases where the stream is empty by using Optional.orElse(null).

    Using minMaxConsumer.accept(): After collecting the results in minMaxList, we pass the values to
        minMaxConsumer.accept(min, max). If the stream is empty, both values will be null, and minMaxConsumer will be
        invoked with (null, null) as specified.
     */
    private static <T> void findMinMax(
            Stream<? extends T> stream,
            Comparator<? super T> order,
            BiConsumer<? super T, ? super T> minMaxConsumer) {

        // Use collect to find min and max in a single pass
        List<T> minMaxList = stream
                .collect(Collectors.teeing(
                        Collectors.minBy(order),
                        Collectors.maxBy(order),
                        (min, max) -> Arrays.asList(min.orElse(null), max.orElse(null))
                ));

        // Pass the min and max elements to the minMaxConsumer
        minMaxConsumer.accept(minMaxList.get(0), minMaxList.get(1));
    }
}
