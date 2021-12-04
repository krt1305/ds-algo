package Threads;

public class ThreadCreation {
    public static void main(String[] args) {
        Thread1 thread1=new Thread1();
        thread1.start();

        Runnable runnable=new MyRunnable();
        Thread runnableThread=new Thread(runnable);
        runnableThread.start();

    }


}
