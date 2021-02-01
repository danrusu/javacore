package course1.basics;

// CTRL SHIFT -  collapse all methods
public class Car {

    // instance fields
    private String name;  // String is immutable
    private String model;
    private int maxSpeed;
    private boolean isManual;

    // final instance fields must be initialized in all constructors
    // final - you can only assign value once
    private final String welcomeMessage;



    // static fields
    public static int count; // initialized with 0 by default
    // use snake-case for public static final String, int, float, boolean...
    public static final String DEFAULT_GREETING_MESSAGE = "WELCOME!!!";

    //@Tip: ALT + INSERT = Generate - Constructor, Getters/Setters, equals, toString ...
    // Constructor (method)

    public Car(String name, String model, int maxSpeed, boolean isManual) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isManual = isManual;
        this.welcomeMessage = DEFAULT_GREETING_MESSAGE;
        Car.count++;
    }
    public Car(String name, String model, String welcomeMessage) {
        this.name = name;
        this.model = model;
        this.welcomeMessage = welcomeMessage;
        Car.count++;
    }

    public String getName() {
        return name;
    }

    public String getModel() {
        return model;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public boolean isManual() {
        return isManual;
    }

    // always use a static method for accessing static fields

    public static int getCarInstanceCount() {
        return count;
    }

    public String getWelcomeMessage() {
        return welcomeMessage;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isManual=" + isManual +
                ", welcomeMessage='" + welcomeMessage + '\'' +
                '}';
    }

    // makes the object mutable; AVOID!!!
    public void setName(String name) {
        this.name = name;
    }

}

