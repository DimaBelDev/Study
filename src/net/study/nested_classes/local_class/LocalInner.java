package net.study.nested_classes.local_class;

public class LocalInner {
    public static void main(String[] args) {
        Math math = new Math();

        math.getResult(12,3);
    }

}
class Math{
    private static int a;
    public void getResult(int delimoes, int delitel){
        //  не может быть статичным
        // можно использовать элементы внешенего класса(даже private, static)
        // можно использовать елементы с внешнего метода или конструктора, елементы должны быть final или эфектив-файнол(не изменятся после инициализации)
        
        int delimoe = 12;

        class Delenie{

            private int delitel;


            public int getChastnoe(){
                System.out.println(a);
                return delimoe/delitel;
            }
            public int getOstatok(){
                return delimoe%delitel;
            }
        }
    }
}
