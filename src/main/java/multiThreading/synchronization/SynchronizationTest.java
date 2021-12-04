package multiThreading.synchronization;

public class SynchronizationTest {
    public static void main(String[] args) {
        SharedProductResource sharedProductResource=new SharedProductResource();
        BuyBook buyBook=new BuyBook(sharedProductResource);
        BuyPen buyPen=new BuyPen(sharedProductResource);

        Thread student1=new Thread(buyBook,"student1");
        Thread student2=new Thread(buyBook,"stdent2");
        Thread student3=new Thread(buyPen,"student3");
        student1.start();
        student2.start();
        student3.start();


    }
}
