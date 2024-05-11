import java.util.Scanner;

public class Calculator {
    public  double add(double a, double b) {
        return a + b;
    }

    public  double subtract(double a, double b) {
        return a - b;
    }

    public  double multiply(double a, double b) {
        return a * b;
    }

    public  double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a / b;
    }

    public  double remainder(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero.");
        }
        return a % b;
    }

    public  double absolute(double a) {
        return Math.abs(a);
    }

    public static double floor(double a) {
        return Math.floor(a);
    }

    public  double ceil(double a) {
        return Math.ceil(a);
    }

    public  double exponent(double a, double b) {
        return Math.pow(a, b);
    }

    public  double sqrt(double a) {
        if (a < 0) {
            throw new IllegalArgumentException("Cannot take square root of a negative number.");
        }
        return Math.sqrt(a);
    }

    public static void main(String[] args) {
        Calculator calculator=new Calculator();
        Scanner scanner = new Scanner(System.in);
        double num1, num2;
        int choice;

        do {
            System.out.println("Calculator Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Remainder");
            System.out.println("6. Absolute Value");
            System.out.println("7. Floor");
            System.out.println("8. Ceiling");
            System.out.println("9. Exponent");
            System.out.println("10. Square Root");
            System.out.println("0. Exit");
            System.out.print("Enter your choice (0-10): ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.add(num1, num2));
                    break;
                case 2:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " +calculator. subtract(num1, num2));
                    break;
                case 3:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " +calculator. multiply(num1, num2));
                    break;
                case 4:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calculator.divide(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 5:
                    System.out.print("Enter two numbers: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " +calculator. remainder(num1, num2));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 6:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " +calculator. absolute(num1));
                    break;
                case 7:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.floor(num1));
                    break;
                case 8:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    System.out.println("Result: " +calculator. ceil(num1));
                    break;
                case 9:
                    System.out.print("Enter the base and exponent: ");
                    num1 = scanner.nextDouble();
                    num2 = scanner.nextDouble();
                    System.out.println("Result: " + calculator.exponent(num1, num2));
                    break;
                case 10:
                    System.out.print("Enter a number: ");
                    num1 = scanner.nextDouble();
                    try {
                        System.out.println("Result: " + calculator.sqrt(num1));
                    } catch (IllegalArgumentException e) {
                        System.out.println(e.getMessage());
                    }
                    break;
                case 0:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
            System.out.println();
        } while (choice != 0);

        scanner.close();
    }
}
