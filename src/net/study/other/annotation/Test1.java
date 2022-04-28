package net.study.other.annotation;

public class Test1 {
    public static void main(String[] args) {
        Parent parent = new Child("Zaur");
        parent.showInfo();

    }
}


class Parent {
    private String name;

    public Parent(String name) {
        this.name = name;
    }

    @Deprecated  // указываю что метод устарел
    public void showInfo(){
        System.out.println("Your name is " + name);
    }
}

class Child extends Parent{

    public Child(String name) {
        super(name);
    }

    @Override
    public void showInfo() {
        super.showInfo();
    }
}