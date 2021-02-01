package course1.basics;

public class GarageTest {
    public static void main(String[] args) {
        // first Car object in memory
        Car porsche = new Car("Porsche", "911", 350, false);

        Garage garage = new Garage(porsche); // passed by reference (to the Garage object in memory)
        int nr = 100; // passed by value

        System.out.println("Car in garage:" + garage.getCar().getName());

        // mutates the Car object state (name)
        porsche.setName("BMW");

        Car car2 = garage.getCar();
        car2.setName("MERCEDES");

        System.out.println("Car in garage:" + garage.getCar().getName());

        // porsche and car2 reference the same object in memory
        System.out.println(porsche.equals(car2)); // is true if both variables point to the same object

        System.out.println("porsche variable: " + porsche);
        System.out.println("car2 variable: " + car2);

        // second Car object in memory
        Car mercedes = new Car("MERCEDES", "911", 350, false);

        System.out.println("mercedes variable: " + mercedes);
        System.out.println(mercedes.equals(porsche));
        System.out.println(mercedes.equals(car2));
        System.out.println(car2 == porsche);
    }

}
