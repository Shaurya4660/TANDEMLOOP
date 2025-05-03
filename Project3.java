import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int count;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no.");
        count = sc.nextInt();

        if (count % 2 == 0) {
            count -= 1;
        }

        int next = 1;
        System.out.print(next + " ");

        for (int i = 1; i < count; i++) {
            next += 2;
            System.out.print(next + " ");
        }

        sc.close();
    }
}
