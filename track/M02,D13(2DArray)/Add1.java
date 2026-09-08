
import java.util.Scanner;

class Add1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        int index = scanner.nextInt();
        int element = scanner.nextInt();
        int b[] = new int[n + 1];
        for (int i = 0; i < index; i++) {
            b[i] = arr[i];
        }
        b[index] = element;
        for (int i = index; i < arr.length; i++) {
            b[i + 1] = arr[i];
        }
        for (int i = 0; i < b.length; i++) {
            System.out.print(b[i] + " ");
        }
    }
}
