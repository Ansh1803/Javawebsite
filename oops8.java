class TrafficLight {
    private String color;
    private int duration; // in seconds

    public TrafficLight(String color, int duration) {
        this.color = color;
        this.duration = duration;
    }

    public void changeColor(String newColor) {
        color = newColor;
    }

    public boolean isRed() {
        return "Red".equalsIgnoreCase(color);
    }

    public boolean isGreen() {
        return "Green".equalsIgnoreCase(color);
    }

    public void displayStatus() {
        System.out.println("Traffic Light Color: " + color + ", Duration: " + duration + " seconds");
    }
}

public class TrafficLightExample {
    public static void main(String[] args) {
        TrafficLight light = new TrafficLight("Red", 30);
        light.displayStatus();
        light.changeColor("Green");
        light.displayStatus();
    }
}

/*
Output:
Traffic Light Color: Red, Duration: 30 seconds
Traffic Light Color: Green, Duration: 30 seconds
*/
