package course1.basics;

import static course1.basics.Car.getCarInstanceCount;

public class CarTest {

    public static void main(String[] args) {
        //@Tip:  CTRL + Click - to get to a method/field declaration
        Car car1 = new Car(  // new Car instance
                "Porsche",
                "718",
                300,
                true
        );
        // SHIFT - F6 - Rename (project code refactoring)
        System.out.println("count after first car instance: " + getCarInstanceCount());

        Car car2 = new Car(
                "BMW",
                "760",
                "Hello BMW owner!"
        );
        System.out.println("count after second car instance: " + getCarInstanceCount());

        System.out.println(car1.getName()
                + " " + car1.getModel()
                + " " + car1.getMaxSpeed()
                + " " + car1.isManual());

        // @Tip: the console can only print text!
        System.out.println("car1:" + car1); // implicit toString
        //System.out.println("car1:" + car1.toString());
        System.out.println("car2:" + car2); // implicit toString

        System.out.println("DEFAULT_GREETING_MESSAGE: " + Car.DEFAULT_GREETING_MESSAGE);
        // Car.DEFAULT_GREETING_MESSAGE = "";  // cannot assign value to a final variable
    }
}
