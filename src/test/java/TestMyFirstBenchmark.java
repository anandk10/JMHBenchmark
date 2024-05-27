import org.openjdk.jmh.annotations.Benchmark;

public class TestMyFirstBenchmark {

    MyFirstBenchmark myFirstBenchmark = new MyFirstBenchmark();

    @Benchmark
    public void testSumArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        myFirstBenchmark.sumArray(array);
    }
}
