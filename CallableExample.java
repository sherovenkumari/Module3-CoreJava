
import java.util.concurrent.*;

public class CallableExample {
    public static void main(String[] args) throws Exception {
        ExecutorService service = Executors.newFixedThreadPool(3);
        Callable<String> task = () -> "Result from thread";

        Future<String> future = service.submit(task);
        System.out.println("Result: " + future.get());

        service.shutdown();
    }
}
