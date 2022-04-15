package net.study.lambda.lesson3_supplier;


import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class Test {

    public static List<Car> sortCar(Supplier<Car> sp){
        ArrayList<Car> carArrayList = new ArrayList<>();

        for(int i = 0; i < 2; i++)
        carArrayList.add(sp.get());

        return carArrayList;
    }
    public static void main(String[] args) {

        List<? extends Car> list = sortCar(() -> new Car("Lada", "Black", 1.6));

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

    @Override
    public String toString() {
        return "Car{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", engine=" + engine +
                '}';
    }
}