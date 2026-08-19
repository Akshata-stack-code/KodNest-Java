
import java.util.Scanner;

class ThreeDArray {

    public static void main(String[] args) {
        int a[][][] = new int[3][3][5];
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Array Elements: ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 4; j++) {
                for (int k = 0; k <= 4; k++) {
                    a[i][j][k] = scan.nextInt();
                }
            }
        }
        System.out.println("Array Elements are : ");
        for (int i = 0; i <= 2; i++) {
            for (int j = 0; j <= 3; j++) {
                for (int k = 0; k <= 4; k++) {
                    System.out.print(a[i][j][k] + " ");
                }
                System.out.println();
            }
            System.out.println();
        }

    }
}
