package net.study.lambda.lesson4_consumer;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Test {

    public static List<Car> sortCar(Supplier<Car> sp){
        ArrayList<Car> carArrayList = new ArrayList<>();
        for(int i = 0; i < 2; i++)
            carArrayList.add(sp.get());
        return carArrayList;
    }

    public static void changeCar(Car car, Consumer<Car> change){
        change.accept(car);
    }

    public static void main(String[] args) {
        List<Car> list = sortCar(() -> new Car("Lada", "Black", 1.6));

        changeCar(list.get(0), (car) -> {
            car.setColor("Red");
            list.set(0, car);
            System.out.println("This car has already changed : " + car);
        });

        System.out.println(list);
    }
}

class Car{
    String model;
    String color;
    double engine;

    public Car(String model, String color, double engine) {
        this.model = model;
        this.color = color;
        this.engine = engine;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}
