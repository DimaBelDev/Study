package net.study.other.annotation;

import java.lang.annotation.*;


public class Test2 {
    // вытащить информацию из анотаций можно с помощью рефлексии
    public static void main(String[] args) throws ClassNotFoundException {
         Class classXiaomi = Class.forName("net.study.other.annotation.Xiaomi");
          Annotation annotation =  classXiaomi.getAnnotation(SmartPhone.class);
          SmartPhone smartPhone = (SmartPhone) annotation;

        System.out.println("Info from SmartPhone " + smartPhone.OS()  + " year creation " + smartPhone.yearOfCompanyCreation());

    }
}

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@interface SmartPhone{
    String OS() default "Android"; // можно указать дефолтное значение
    int yearOfCompanyCreation();
}

@SmartPhone(OS = "Android", yearOfCompanyCreation = 2010)
class Xiaomi{
      String model;
      double price;
}

@SmartPhone(OS = "IOS", yearOfCompanyCreation = 1976)
class Iphone{
    String model;
    double price;
}
