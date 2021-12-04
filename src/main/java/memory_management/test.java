package memory_management;

public class test {

    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();

        long availableBytes=runtime.freeMemory();
        System.out.println("Initial Available memory"+availableBytes/1024 + "k");

        for(int i=0;i<1000;i++)
        {
            Customer customer;
            customer=new Customer("john");
        }

        availableBytes=runtime.freeMemory();
        System.out.println("Available memory "+availableBytes/1024 + "k");

        System.gc();
        availableBytes=runtime.freeMemory();
        System.out.println("Available memory after garbage collection "+availableBytes/1024 + "k");

    }
}
