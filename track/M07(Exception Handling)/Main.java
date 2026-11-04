
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        System.out.println("Connection established");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = sc.nextInt();
        System.out.println("Enter b: ");
        int b = sc.nextInt();
        int res = a / b;
        System.out.println("Result: " + res);
        System.out.println("Connection Terminated");
    }
}
