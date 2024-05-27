public class MyFirstBenchmark {
    // Benchmark methods will go here

    public long sumArray(int[] array) {
        long sum = 0;
        for (int i : array) {
            sum += i;
        }
        return sum;
    }

}
