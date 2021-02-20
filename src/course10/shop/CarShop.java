package course10.shop;

import course9.demo.CarType;

import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static course10.shop.Currency.*;
import static course9.demo.CarType.*;
import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.*;

/*A car shop should hold a list of cars and
Tasks - create methods for the following:
1. Get all Porsche car names
2. Get all car types
3. Get a list of Porsche cars sorted ascending by price
4. Get the fastest car
// try 5,6 only in imperative approach
5. Get an average price for BMW cars
6. Get BMW cars price summary (count, total price, average price, min/max price)
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

    public void print() {
        cars.forEach(System.out::println);
    }

    //2. Get all car types
    public Set<CarType> getAllCarTypeImperative() {
        Set<CarType> carTypes = new TreeSet<>();
        for (int i = 0; i < cars.size(); i++) {
            carTypes.add(cars.get(i).getCarType());
        }
        return carTypes;
    }

    public Set<CarType> getAllCarTypesDeclarative() {
        return cars.stream()
                .map(Car::getCarType)
                .collect(toSet());
    }

    public Set<CarType> getAllCarTypesDeclarative2() {
        TreeSet<CarType> carTypes = new TreeSet<>();
        carTypes.addAll(cars.stream()
                .map(car -> car.getCarType())
                .collect(toSet()));
        return carTypes;
    }

    //3. Get a list of Porsche cars sorted ascending by price
    public List<Car> getSortedAscendingByPricePorscheCars(){
        return cars.stream()
                .filter(isPorscheCar())
                .sorted(comparing(Car::getPrice))
                .collect(toList());
    }

    public List<Car> getSortedDescendingByPricePorscheCars(){
        return cars.stream()
                .filter(isPorscheCar())
                .sorted(comparing(Car::getPrice).reversed())
                .collect(toList());
    }


    //4. Get the fastest car
    public Car getFastestCar(){
        // Optional<Car> represent an object that can contain one or no Cars
        // (or a Box with one or no Cars)
        //List<Car> emptyCarList = new ArrayList<>(); // i.e. Optional that throws
        //Optional<Car> fastestCar = emptyCarList.stream()
        Optional<Car> fastestCar = cars.stream()
                .max(comparing(Car::getSpeed));
        return fastestCar.orElseThrow(
                () -> new RuntimeException("No fastest car found"));
    }

    //5. Get an average price for BMW cars
    public Double bmwAveragePrice(){
        return cars.stream()
                .filter(car -> car.getName().toLowerCase().contains("bmw"))
                .collect(averagingDouble(Car::getPrice));
    }

    //6. Get BMW cars price summary (count, total price, average price, min/max price)
    public DoubleSummaryStatistics bmwPriceStatistics(){
        return cars.stream()
                .filter(car -> car.getName().toLowerCase().contains("bmw"))
                .collect(summarizingDouble(Car::getPrice));
    }

}
