package WorkingWithAbstraction.TrafficLights;

public class TrafficLight {
    public enum Signal {
        RED,
        GREEN,
        YELLOW;

    }
    private Signal signal;
    public TrafficLight(Signal signal) {
        this.signal = signal;
    }
}
