package Java8.parallel;

import java.util.function.Function;
import java.util.stream.LongStream;
import java.util.stream.Stream;

public class ParallelTest {
    public static long parallelSum(Long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).parallel().reduce(0L, Long::sum);
    }

    public static long iterativeSum(Long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).reduce(0L, Long::sum);
    }

    public static long sequentialSum(Long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n).sequential().reduce(0L, Long::sum);
    }

    public static Long rangedSum(Long n) {
        return LongStream.rangeClosed(1, n).reduce(0L, Long::sum);
    }

    public static Long parallelRangedSum(Long n) {
        return LongStream.rangeClosed(1, n).parallel().reduce(0L, Long::sum);
    }

    public static void main(String[] args) {
        performance();
    }

    private static void performance() {
        System.out.println("iterative sum done in:  " + measuredSumPerf(ParallelTest::iterativeSum, 10000000L) + " msecs");
        System.out.println("sequential sum done in:  " + measuredSumPerf(ParallelTest::sequentialSum, 10000000L) + " msecs");
        System.out.println("parallel sum done in:  " + measuredSumPerf(ParallelTest::parallelSum, 10000000L) + " msecs");
        System.out.println("parallel sum done in:  " + measuredSumPerf(ParallelTest::rangedSum, 10000000L) + " msecs");
        System.out.println("parallel sum done in:  " + measuredSumPerf(ParallelTest::parallelRangedSum, 10000000L) + " msecs");
    }

    public static Long measuredSumPerf(Function<Long, Long> adder, Long n) {

        long fastest = Long.MAX_VALUE;
        for (int i = 0; i < 1; i++) {
            Long start = System.nanoTime();
            Long sum = adder.apply(n);
            Long duration = (System.nanoTime() - start) / 1000000;
            System.out.println("Result: " + sum);
            if (duration < fastest) {
                fastest = duration;
            }
        }
        return fastest;
    }
}
