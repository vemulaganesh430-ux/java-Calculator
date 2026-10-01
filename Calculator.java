import java.util.Scanner; 
public class Calculator {
    static double add(double a, double b) {
        return a + b;
    }

    static double subtract(double a, double b) {
        return a - b;
    }

    static double multiply(double a, double b) {
        return a * b;
    }

    static double divide(double a, double b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n--- Java Calculator ---");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();

            if (choice == 5) {
                System.out.println("Calculator closed.");
                break;
            }

            System.out.print("Enter first number: ");
            double a = sc.nextDouble();

            System.out.print("Enter second number: ");
            double b = sc.nextDouble();

            switch (choice) {

                case 1:
                    System.out.println("Result: " + add(a, b));
                    break;

                case 2:
                    System.out.println("Result: " + subtract(a, b));
                    break;

                case 3:
                    System.out.println("Result: " + multiply(a, b));
                    break;

                case 4:
                    if (b == 0) {
                        System.out.println("Cannot divide by zero.");
                    } else {
                        System.out.println("Result: " + divide(a, b));
                    }
                    break;

                default:
                    System.out.println("Invalid choice.");
            }
        }

        sc.close();
    }
}