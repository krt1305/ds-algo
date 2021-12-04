package enumTest;

public class Test {

    public static void main(String[] args) {
        Color c1 = Color.RED;
        System.out.println(c1);
        c1.colorInfo();
        TrafficSignal[] trafficSignals=TrafficSignal.values();
        for (TrafficSignal signal : trafficSignals)
        {
            // use getter method to get the value
            System.out.println("name : " + signal.name() +
                    " action: " + signal.getAction() );
        }
    }
}
