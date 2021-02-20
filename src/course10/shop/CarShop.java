package course10.shop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

import static course10.shop.Currency.*;
import static course9.demo.CarType.*;
import static java.util.stream.Collectors.toList;

/*A car shop should hold a list of cars and
Tasks - create methods for the following:
1. Get all Porsche car names
2. Get all car types
3. Get a list of Porsche cars sorted ascending by price
4. Get the fastest car
// try 5,6 only in imperative approach
5. Get an average price for BMW cars
6. Get BMW cars price statistics (count, total price, average price, min/max price)
*/
public class CarShop {
    private final List<Car> cars;

    private CarShop(List<Car> cars) {
        this.cars = cars;
    }

    public List<Car> getCars() {
        return cars;
    }

    public static CarShop createDefaultCarShop() {
        List<Car> defaultCarList = Arrays.asList(
                new Car("Dacia Duster", 170, SUV, 20_000, EUR),
                new Car("PorSche 718 Cayman", 310, SPORT, 70_000, USD),
                new Car("BMW X5", 260, SUV, 80_000, USD),
                new Car("Lexus LC500", 280, SPORT, 100_000, EUR),
                new Car("Ford Focus", 180, SEDAN, 25_000, EUR),
                new Car("BMW 520D", 220, SEDAN, 50_000, USD),
                new Car("Porsche 911 Carerra", 350, SPORT, 120_000, USD),
                new Car("BMW 760", 300, SEDAN, 110_000, USD),
                new Car("Cayenne porsche", 290, SUV, 115_000, EUR),
                new Car("Ford Edge", 200, SUV, 50_000, USD)
        );
        return new CarShop(defaultCarList);
    }

    // 1. Get all Porsche car names
    public List<String> getAllPorscheCarNamesImperative1() {
        List<String> allPorscheCarNames = new ArrayList<>();
        for (int i = 0; i < cars.size(); i++) {
            String carName = cars.get(i).getName();
            if (carName.toLowerCase().contains("porsche")) {
                allPorscheCarNames.add(carName);
            }
        }
        return allPorscheCarNames;
    }

    public List<String> getAllPorscheCarNamesImperative2() {
        List<String> allPorscheCarNames = new ArrayList<>();
        for (Car car : cars) {
            String carName = car.getName();
            if (carName.toLowerCase().contains("porsche")) {
                allPorscheCarNames.add(carName);
            }
        }
        return allPorscheCarNames;
    }

    public List<String> getAllPorscheCarNamesDeclarative() {
        return cars.stream()
                .filter(car -> car.getName().toLowerCase().contains("porsche"))
                .map(car -> car.getName())
                .collect(toList());
    }

    public List<String> getAllPorscheCarNamesMoreDeclarative() {
        return cars.stream()
                .filter(isPorscheCar())
                .map(Car::getName)
                .collect(toList());
    }

    private Predicate<Car> isPorscheCar() {
        return car -> car.getName().toLowerCase().contains("porsche");
    }

    public void print(){
        cars.forEach(System.out::println);
    }

    //2. Get all car types
    //3. Get a list of Porsche cars sorted ascending by price
    //4. Get the fastest car
    //// try 5,6 only in imperative approach
    //5. Get an average price for BMW cars
    //6. Get BMW cars price statistics (count, total price, average price, min/max price)

}
