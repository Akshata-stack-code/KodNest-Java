
class Parent {

    Parent() {
        System.out.println("Inside Parent 0-per constructor");
    }
}

class Child extends Parent {

    Child() {
        super();
        System.out.println("inside Child 0-per constructor");
    }
}

class Main1 {

    public static void main(String[] args) {
        Child c1 = new Child();
    }
}
