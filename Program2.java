import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no. = ");
        count = sc.nextInt();

        for (int i = 1; i <= count; i++) {
            System.out.print(1 + (i - 1) * 2 + " ");
        }

        sc.close();
    }
}
