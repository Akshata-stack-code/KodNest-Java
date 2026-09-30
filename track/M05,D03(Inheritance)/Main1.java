
class Demo1 {

    int a = 10;

    void disp1() {
        System.out.println("Demo1 :" + a);
    }
}

public class Demo2 extends Demo1 {

}

public class Main1 {

    public static void main(String[] args) {
        Demo2 d2 = new Demo2();
        d2.disp1();

    }
}
