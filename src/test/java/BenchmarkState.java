import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;

@State(Scope.Thread)
public class BenchmarkState {
    int[] array;

    @Setup
    public void prepare() {
        array = new int[10];
        for (int i = 0; i < 10; i++) {
            array[i] = i;
        }
    }
}
