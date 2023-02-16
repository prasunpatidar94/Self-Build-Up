package design.test;


import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorWithThreadClassAndRunnableInterface {

    public static void main(String[] args) {


        ExecutorService executorService = Executors.newSingleThreadExecutor();
//        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.execute(new MyRunnableInterface("Prasun"));
        executorService.execute(new MyThreadClass("Prasun"));


        executorService.shutdown();

    }
}


class MyThreadClass extends Thread {

    private String name;


    public MyThreadClass(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000L);
            System.out.println("My Thread Class"+name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}



class MyRunnableInterface implements Runnable {

    private String name;


    public MyRunnableInterface(String name) {
        this.name = name;
    }

    @Override
    public void run() {

        try {
            Thread.sleep(2000L);
            System.out.println("My Runnable Interface"+name);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }


    }
}

