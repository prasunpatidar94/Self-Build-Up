package design.test;

import java.util.List;
import java.util.concurrent.*;

public class ExecutorWithCallableImplimentation {
    public static void main(String[] args) throws InterruptedException, ExecutionException {

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        List<MyCallable> myCallables = List.of(
                new MyCallable("Prasun"),
                new MyCallable("Megha"),
                new MyCallable("Chandan"),
                new MyCallable("Kamal"),
                new MyCallable("Rekha")

        );

        List<Future<String>> futures = executorService.invokeAll(myCallables);

        for (Future<String> future : futures) {
            System.out.println(future.get());

        }

        executorService.shutdown();
    }
}


class MyCallable implements Callable<String> {


    private String name;

    public MyCallable(String name) {
        this.name = name;
    }

    @Override
    public String call() throws InterruptedException {

        Thread.sleep(2000L);
        return "MyCallable " + name;
    }
}
