
class Parent {

    Parent(int a) {
        super();
        System.out.println("Inside par 1 constructor");
    }
}

class Child extends Parent {

    Child(int a, int b) {
        super(a);
        System.out.println("Inside child 0 constructor");
    }

}

class Main {

    public static void main(String[] args) {
        Child c1 = new Child(10, 20);
    }
}
