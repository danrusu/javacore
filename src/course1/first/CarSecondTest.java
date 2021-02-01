package course1.first;

import course1.basics.Car;

public class CarSecondTest {
    public static void main(String[] args) {
        Car car = new Car(  // CTRL + Click
                "Porsche",
                "718",
                300,
                true
        );
        System.out.println(car);

        // F2 - next error from cursor
        // ALT + ENTER - suggestions
        String fullName = car.getClass().getName();
        String fat = "fat";
        // Variable name intelli-sense - use first letters from camel-case
        // i.e. System.out.println(fn
        System.out.println("car1 type: " + fullName); // CTRL + SHIFT + ENTER - finish code line if it is obvious
    }
}
