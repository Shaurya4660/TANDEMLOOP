import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter length of the array: ");
        int x = sc.nextInt();

        int[] y = new int[x];

        System.out.println("Enter " + x + " elements:");
        for (int i = 0; i < x; i++) {
            y[i] = sc.nextInt();
        }

        int count;

        for (int i = 0; i < 9; i++) {
            count = 0;
            for (int j = 0; j < x; j++) {
                if (y[j] % arr[i] == 0) {
                    count++;
                }
            }
            System.out.println((i + 1) + ":" + count);
        }

        sc.close();
    }
}
