
class Parent {

    void disp1() {
        System.out.println("Inside Parent disp1");
    }

    void disp2() {
        System.out.println("Inside Parent disp2");
    }
}

class Child extends Parent {

    void disp2() {
        System.out.println("Inside Child disp2");
    }

    void disp3() {
        System.out.println("Inside Child disp3");
    }
}

class Main {

    public static void main(String[] args) {

        Child c1 = new Child();
        c1.disp1();
        c1.disp2();
        c1.disp3();
    }
}
