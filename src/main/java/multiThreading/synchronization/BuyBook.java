package multiThreading.synchronization;

public class BuyBook implements Runnable {
    SharedProductResource sharedProductResource=null;

    public BuyBook(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    public void run() {
        System.out.println("buy book "+sharedProductResource.buyProduct("BOOK"));
    }
}
