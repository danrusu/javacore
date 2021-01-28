package course1.basics;

public class Car {
    private String name;
    private String model;
    private int maxSpeed;
    private boolean isManual;

    //@Tip: ALT + INSERT = Generate - Constructor, Getters/Setters, equals, toString ...
    public Car(String name, String model, int maxSpeed, boolean isManual) {
        this.name = name;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.isManual = isManual;
    }

    public Car(String name, String model) {
        this.name = name;
        this.model = model;
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

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", isManual=" + isManual +
                '}';
    }
}

