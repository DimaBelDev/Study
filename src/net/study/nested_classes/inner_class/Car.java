package net.study.nested_classes.inner_class;

public class Car {
    private String color;
    private int door;
    private Engine engine;


    public Car(String color, int door) {
        this.color = color;
        this.door = door;
//        this.engine = this.new Engine(horsePower); // создание
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", door=" + door +
                ", engine=" + engine +
                '}';
    }
    public class Engine  {
        // изначально нужно создать внешний класс, а зате уже через внешний класс создаем внутрений
        // елементы - только не статичный(может быть статичные но только константы)
        // во внутренем классе можем использовать любые поля внешнего(private, static)
        // внешний класс может обращаться к полям даже private(прежде нужно создать объект)
        // может быть final, abstract, может наследоваться, и наследовать, и импл.

        private int horsePower;

        public Engine(int horsePower) {
            this.horsePower = horsePower;
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
  Car car = new Car("Black", 4);

  Car.Engine  engine1 = car.new Engine(125); // способ создания(самый распространенный)
  car.setEngine(engine1);

  Car.Engine engine2 = new Car("Red", 4).new Engine(256); // способ создания(теряется сылка внешнего класса)

        System.out.println(car);


    }
}
