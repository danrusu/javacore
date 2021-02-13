package course9.demo;


import static course9.demo.CarTypeEnhanced.SEDAN;

public class CarTypeTest {
    public static void main(String[] args) {
        System.out.println(SEDAN); // all SUV, SPORT and SEDAN objects (CarType are instantiated at this point)
        System.out.println(CarTypeEnhanced.SPORT);
        System.out.println(CarTypeEnhanced.SUV);
        System.out.println("--------------");

        CarTypeEnhanced carType1 = CarTypeEnhanced.valueOf("SEDAN");
        System.out.println(carType1);

        System.out.println("--------------");
        CarTypeEnhanced[] allCarTypes = CarTypeEnhanced.values();
        for (int i=0; i < allCarTypes.length; i++){
            System.out.println(allCarTypes[i]);
        }

        System.out.println("name()--------------");
        System.out.println(SEDAN.name());
        System.out.println(CarTypeEnhanced.SUV.name());
        System.out.println(CarTypeEnhanced.SPORT.name());

        System.out.println("Type--------------");
        System.out.println(CarTypeEnhanced.SUV.getClass().getName());

        System.out.println("--------------");
        for (int i=0; i < allCarTypes.length; i++){
            CarTypeEnhanced carType = allCarTypes[i];
            System.out.println( carType.name() + " : "+ carType.getId());
        }
    }
}
