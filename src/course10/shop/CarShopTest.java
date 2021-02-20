package course10.shop;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import static course10.shop.CarShop.createDefaultCarShop;

public class CarShopTest {
    public static void main(String[] args) {
        CarShop carShop = createDefaultCarShop();
        //carShop.print(); // lists the cars within the car shop

        // 1
        //carShop.getAllPorscheCarNamesImperative1().forEach(nr -> System.out.println(nr));
        //carShop.getAllPorscheCarNamesDeclarative().forEach(System.out::println);
    }
}
