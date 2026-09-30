
class Program {

    static int a;
    static int b;

    int p;
    int q;

    static {
        System.out.println("Inside the static block");
        a = 10;
        b = 20;
    }

    {
        System.out.println("Inside the Non-staticBlock");
        p = 100;
        q = 200;
    }

    static void disp1() {
        System.out.println("Inside the static method");
        System.out.println(a);
        System.out.println(b);
    }

    void disp2() {
        System.out.println("Inside the non-static method");
        System.out.println(p);
        System.out.println(q);
    }

    public static void main(String[] args) {
        Program.disp1();
        Program p1 = new Program();
        p1.disp2();
    }
}

