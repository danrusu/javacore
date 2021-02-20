package course10.shop;

import java.util.DoubleSummaryStatistics;

import static course10.shop.CarShop.createDefaultCarShop;

public class CarShopTest {
    public static void main(String[] args) {

        CarShop carShop = createDefaultCarShop();
        System.out.println("Car shop:");
        carShop.print();

        System.out.println("\nTask 1");
        carShop.getAllPorscheCarNamesImperative1().forEach(nr -> System.out.println(nr));
        carShop.getAllPorscheCarNamesDeclarative().forEach(System.out::println);

        System.out.println("\nTask 2");
        carShop.getAllCarTypeImperative().forEach(System.out::println);
        System.out.println("----------------");
        carShop.getAllCarTypesDeclarative().forEach(System.out::println);

        System.out.println("\nTask 3");
        carShop.getSortedAscendingByPricePorscheCars().forEach(System.out::println);
        carShop.getSortedDescendingByPricePorscheCars().forEach(System.out::println);

        System.out.println("\nTask 4");
        System.out.println(carShop.getFastestCar());

        System.out.println("\nTask 5");
        System.out.println(carShop.bmwAveragePrice());

        System.out.println("\nTask 6");
        DoubleSummaryStatistics bmwPriceStatistics = carShop.bmwPriceStatistics();
        System.out.println(bmwPriceStatistics);

    }
}
