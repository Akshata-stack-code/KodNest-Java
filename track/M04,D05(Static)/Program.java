
class Program {

    

          static int a;
        static int b;

        int p;
        int q;
    }
    static{
System.out.println("Inside the static block");
int a = 10;
    int b = 20;
    }
{
System.out.println("Inside the Non-staticBlock");
int p = 100;
    int q = 200;
}

static void disp1(){
    System.out.println("Inside the static method");
    System.out.println(a);
    System.out.println(b);
}
