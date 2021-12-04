package enumTest;

// Java program to demonstrate how values can
// be assigned to enums.
public enum TrafficSignal {
    RED("STOP"), GREEN("GO"), ORANGE("SLOW DOWN");

    public String action;

    // getter method
    public String getAction()
    {
        return this.action;
    }
    TrafficSignal(String action) {
        this.action=action;
    }
}
