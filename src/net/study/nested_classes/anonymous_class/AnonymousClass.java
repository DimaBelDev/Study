package net.study.nested_classes.anonymous_class;

public class AnonymousClass {

    Math m = new Math() {
        @Override
        public int getSmth(int id) {
            return id;
        }
    };

    MathTwo mathTwo = new MathTwo(){
        @Override
        public void prepare() {
            System.out.println("Bye");
        }
    };

    public void method(){
        m.getSmth(2);
        mathTwo.prepare();
    }


}

interface Math{
     int getSmth(int id);
}

class MathTwo{
    public void prepare(){
        System.out.println("Hello");
    }
}
