package com.github.gilbertotcc.himitsubako;

import static com.github.gilbertotcc.himitsubako.util.StreamUtils.infiniteIntegerStream;
import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.Test;

public class MaxIntegersTest {

    private final static List<Integer> LIST_0 = asList(1, 2, 3);

    private final static List<Integer> LIST_1 = asList(1, 2, 3, 3);
    private final static List<Integer> RESULT_LIST_1 = asList(3, 3);

    private final static Stream<Integer> STREAM_0 = IntStream.range(3, 6).boxed();

    private final static Stream<Integer> STREAM_1 = IntStream.range(1, 1073741823).boxed();
    private final static List<Integer> RESULT_STREAM_1 = asList(1073741820, 1073741821, 1073741822);

    private final static Stream<Integer> INFINITE_STREAM = infiniteIntegerStream();



    @Test
    public void maxIntegersOfAnEmptyListShouldReturnAnEmptyList() {
        List<Integer> maxIntegers = MaxIntegers.of(Collections.emptyList(), 10);
        assertTrue(maxIntegers.isEmpty());
    }

    @Test
    public void maxIntegerOfList0ShouldEqualThree() {
        List<Integer> maxIntegers = MaxIntegers.of(LIST_0, 1);
        assertEquals(1, maxIntegers.size());
        assertEquals(3, maxIntegers.get(0).intValue());
    }

    @Test
    public void maxTwoIntegersOfList1ShouldEqualResult1() {
        List<Integer> maxIntegers = MaxIntegers.of(LIST_1, 2);
        assertEquals(2, maxIntegers.size());
        assertEquals(RESULT_LIST_1, maxIntegers);
    }

    @Test
    public void maxIntegerOfStream0ShouldBeFive() {
        List<Integer> maxIntegers = MaxIntegers.of(STREAM_0, 1);
        assertEquals(1, maxIntegers.size());
        assertEquals(3, maxIntegers.get(0).intValue());
    }

    @Test
    public void maxThreeIntegersOfStream1ShouldBeResultStream1() {
        List<Integer> maxIntegers = MaxIntegers.of(STREAM_1, 3);
        assertEquals(3, maxIntegers.size());
        assertEquals(RESULT_STREAM_1, maxIntegers);
    }

    @Test
    public void maxIntegerOfInfiniteStreamShouldBe2147483647() {
        List<Integer> maxIntegers = MaxIntegers.of(INFINITE_STREAM, 1);
        assertEquals(1, maxIntegers.size());
        assertEquals(2147483647, maxIntegers.get(0).intValue());
    }
}
