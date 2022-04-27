package net.study.regex;

public class Lesson_7 {

    static void employeeInfo(Employee employee){
        System.out.printf("%03d Hello \t %-12s \t %-12s \t %,.1f \n", employee.id,employee.name,employee.surname,(employee.salary + 1.00));
    }
    public static void main(String[] args) {

//описание %[flags][width][.precision]datatype_specifier
           //[flags] 1)"-" выравнивание по левому краю 2)"0" добавление нулей перед числом 3)"," разделитель разрядом в числах
           //[width] - ширина значения
           //[.precision] - это точность, с помощью . можно округлять дробные числа
           // datatype_specifier 1) "b" - boolean 2)"c" - char 3)"s" - string 4)"d" - целое число 5)"f" - десятичное число
           // \t - это пробел
        Employee employee = new Employee(1,"Dima", "Ivanov", 1500.32);
        Employee employee2 = new Employee(2,"Vika", "Didorova", 3332.27);
        Employee employee3 = new Employee(3,"Denis", "Ignatchik", 2178.41);

        employeeInfo(employee);
        employeeInfo(employee2);
        employeeInfo(employee3);

        String newString = String.format("%03d Hello \t %-12s \t %-12s \t %,.1f",employee.id,employee.name,employee.surname,(employee.salary + 1.00));
        // с помощью String.format можно еще и хранить результат

        System.out.println(newString);

    }
}
class Employee{
    int id;
    String name;
    String surname;
    double salary;

    public Employee(int id, String name, String surname, double salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }
}
