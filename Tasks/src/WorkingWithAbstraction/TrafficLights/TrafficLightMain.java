package WorkingWithAbstraction.TrafficLights;
import java.util.Scanner;

public class TrafficLightMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String trafficLightLine = scanner.nextLine();
        String[] trafficLightAsStrings = trafficLightLine.split("\\s+");

        TrafficLight[] trafficLights = new TrafficLight[trafficLightAsStrings.length];

        for (int i = 0; i < trafficLightAsStrings.length; i++) {
            String s = trafficLightAsStrings[i];
            TrafficLight.Signal signal = TrafficLight.Signal.valueOf(s);
            trafficLights[i] = new TrafficLight(signal);

        }

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 1; i <= n; i++) {
            updateTrafficLights(trafficLights);
            printTrafficLights(trafficLights);
        }
    }

    private static void printTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            System.out.print(trafficLight.getSignal() + " ");
        }
        System.out.println();
    }

    private static void updateTrafficLights(TrafficLight[] trafficLights) {
        for (TrafficLight trafficLight : trafficLights) {
            trafficLight.update();
        }
    }
}
