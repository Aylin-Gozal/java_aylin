package OuterAndInner;

public class House {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
    }
}


class Outer{
    int outer_x1 = 100;
    int outer_x2 = 300;
    int outer_x3 = outer_x1 + outer_x2;
    int outer_x = outer_x3/2;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }

    class Inner {
        void display(){
            System.out.println(outer_x);
        }
    }
}