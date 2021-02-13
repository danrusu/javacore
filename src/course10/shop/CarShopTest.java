package course10.shop;

import static course10.shop.CarShop.createDefaultCarShop;

public class CarShopTest {
    public static void main(String[] args) {
        CarShop carShop = createDefaultCarShop();

//        carShop
//                .getCars()
//                .forEach(nr -> System.out.println(nr));
        //forEach(System.out::println); // using Method Reference ::

        //carShop.getAllPorscheCarNames().forEach(nr -> System.out.println(nr));
        carShop.getAllPorscheCarNames2().forEach(nr -> System.out.println(nr));

    }
}
