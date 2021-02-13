package course10.shop;

import course9.demo.CarType;

/* Cars should store:
- name
- speed
- cartType (SEDAN, SUV or SPORT)
- price
- price currency
 */
//POJO (without setters)
public class Car {
    private String name;
    private int speed;
    //private int speed, price;
    private CarType carType;
    private float price;
    private Currency priceCurrency;

    public Car(String name,
               int speed,
               CarType carType,
               float price,
               Currency priceCurrency) {
        this.name = name;
        this.speed = speed;
        this.carType = carType;
        this.price = price;
        this.priceCurrency = priceCurrency;
    }

    public String getName() {
        return name;
    }

    public int getSpeed() {
        return speed;
    }

    public CarType getCarType() {
        return carType;
    }

    public float getPrice() {
        return price;
    }

    public Currency getPriceCurrency() {
        return priceCurrency;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", speed=" + speed +
                ", carType=" + carType +
                ", price=" + price +
                ", priceCurrency=" + priceCurrency +
                '}';
    }
}
