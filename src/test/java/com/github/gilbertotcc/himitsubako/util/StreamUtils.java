package com.github.gilbertotcc.himitsubako.util;

import java.util.Random;
import java.util.stream.Stream;

public class StreamUtils {

    private static final long FREE_MEMORY_LIMIT = 16L;

    public static Stream<Integer> infiniteIntegerStream() {
        final Runtime runtime = Runtime.getRuntime();
        return new Random().ints(1, Integer.MAX_VALUE)
                .map(i -> runtime.freeMemory() <= FREE_MEMORY_LIMIT ? Integer.MAX_VALUE : i)
                .boxed();
    }

    private StreamUtils() {}
}
