import java.util.Scanner;

class Calculator {
    public double add(double a, double b) {
        return a + b;
    }

    public double sub(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        return a / b;
    }
}

public class Main {
    public static void main(String[] args) {
        Calculator myobj = new Calculator();
        double x, y;
        char op;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a first number: ");
        x = sc.nextDouble();

        System.out.println("Enter a Second number: ");
        y = sc.nextDouble();

        System.out.println("Enter a Operator value: ");
        op = sc.next().charAt(0);

        if (op == '+') {
            double result = myobj.add(x, y);
            System.out.println(result);
        } else if (op == '-') {
            double result = myobj.sub(x, y);
            System.out.println(result);
        } else if (op == '*') {
            double result = myobj.multiply(x, y);
            System.out.println(result);
        } else {
            double result = myobj.divide(x, y);
            System.out.println(result);
        }

        sc.close();
    }
}
