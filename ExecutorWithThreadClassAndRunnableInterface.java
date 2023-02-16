package design.test;

public class ThreadClassAndRunnableInterface {

    public static void main(String[] args) {

        //with Thread Class
        MyThreadClass myThreadClass = new MyThreadClass(" Prasun Patidar");
        myThreadClass.start();
        //with Runnable Interface
        Runnable runnable = new MyRunnableInterface(" Prasun Patidar");
        Thread thread = new Thread(runnable);
        thread.start();



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
