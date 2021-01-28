package course1.basics;

public class CarTest {

    public static void main(String[] args) {
        //@Tip:  CTRL + Click - to get to a method/field declaration
        Car car1 = new Car(
                "Porsche",
                "718",
                300,
                true
        );

        Car car2 = new Car(
                "Porsche",
                "718"
        );

        System.out.println(car1.getName()
                + " " + car1.getModel()
                + " " + car1.getMaxSpeed()
                + " " + car1.isManual());

        //@Tip: the console can only print text!
        System.out.println(car1); // implicit toString
        System.out.println(car2); // implicit toString
        //System.out.println(car1.toString());
    }
}
