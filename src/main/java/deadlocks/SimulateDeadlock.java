package deadlocks;


public class SimulateDeadlock {

    public static void main(String[] args) {

        final String resource1="abc";
        final String resource2="bcd";

        Thread t1=new Thread(){
            public void run()
            {
                synchronized (resource1)
                {
                    System.out.println("thread 1 locked resource1");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource2)
                    {
                        System.out.println("thread 1 locked resource2");
                    }
                }

            }
        };

        Thread t2=new Thread(){
            public void run()
            {
                synchronized (resource2)
                {
                    System.out.println("thread 2 locked resource2");
                    try {
                        Thread.sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (resource1)
                    {
                        System.out.println("thread 2 locked resource1");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
