
class Demo1 {

    static {
        System.out.println("1st static-Block executed");
    }

    static {
        System.out.println("2nd static-Block executed");
    }

    static {
        System.out.println("3rd static-Block executed");
    }

    {
        System.out.println("1st NONstatic-Block executed");
    }

    {
        System.out.println("2nd NONstatic-Block executed");
    }

    {
        System.out.println("3rd NONstatic-Block executed");
    }
}

class Main1 {

    public static void main(String[] args) {
        Demo1 d1 = new Demo1();
        Demo1 d2 = new Demo1();
        Demo1 d3 = new Demo1();
    }
}
