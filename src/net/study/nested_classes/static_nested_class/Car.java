package net.study.nested_classes.static_nested_class;

public class Car {
    private String color;
    private int door;
    private Engine engine;

    private static int a;

    public Car(String color, int door, Engine engine) {
        this.color = color;
        this.door = door;
        this.engine = engine;
    }

    public void method(){
        Engine e = new Engine(256);
        System.out.println(e.horsePower);
        System.out.println(Engine.countOfObject);
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
    public static class Engine  {
        // если private то не сможем создать экзмляр в другом классе
        // может быть final, abstract, может наследоваться, и наследовать, и импл.
        // может содеркать как статичные так и не статичные поля
        // может обращаться к элементам внешнего класса ,но только статичным(даже к private)
        // Можем использовать элементы внутреннего класса во внешнем (есть пример метод вверху) даже если они private

        private int horsePower;
        private static int countOfObject = a;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
            countOfObject++;
        }

        private void run(){
        }

        @Override
        public String toString() {
            return "Engine{" +
                    "horsePower=" + horsePower +
                    '}';
        }
    }
}
class Test{
    public static void main(String[] args) {

        Car.Engine engine = new Car.Engine(12);
        Car car1 = new Car("Grey", 4, engine);
        System.out.println(car1);

    }
}
