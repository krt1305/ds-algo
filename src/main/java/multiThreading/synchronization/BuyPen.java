package multiThreading.synchronization;

public class BuyPen implements Runnable {
    SharedProductResource sharedProductResource=null;

    public BuyPen(SharedProductResource sharedProductResource) {
        this.sharedProductResource = sharedProductResource;
    }

    public void run() {
        System.out.println("buy pen "+sharedProductResource.buyProduct("PEN"));
    }
}
