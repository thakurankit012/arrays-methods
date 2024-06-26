import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num1, num2, result;
        char operator;

        System.out.print("Enter first number: ");
        num1 = scanner.nextDouble();

        System.out.print("Enter operator (+, -, *, /): ");
        operator = scanner.next().charAt(0);

        System.out.print("Enter second number: ");
        num2 = scanner.nextDouble();

        switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;
            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;
            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;
            case '/':
                if (num2 == 0) {
                    System.out.println("Error! Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error! Invalid operator.");
                break; // Added break statement
        }
        scanner.close(); // Closing scanner
    }
}

 // Addition: 12.5 + 7.3
        num1 = 12.5;
        num2 = 7.3;
        operator = '+';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 1 - 12.5 + 7.3: " + result);
 // Subtraction: 15.0 - 4.5
        num1 = 15.0;
        num2 = 4.5;
        operator = '-';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 2 - 15.0 - 4.5: " + result);
  // Multiplication: 3.0 * 2.5
        num1 = 3.0;
        num2 = 2.5;
        operator = '*';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 3 - 3.0 * 2.5: " + result);
  // Division: 20.0 / 4.0
        num1 = 20.0;
        num2 = 4.0;
        operator = '/';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 4 - 20.0 / 4.0: " + result);
 // Division by zero
        num1 = 10.0;
        num2 = 0.0;
        operator = '/';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 5 - 10.0 / 0.0: " + result);

        // Invalid operator
        num1 = 9.0;
        num2 = 2.0;
        operator = '?';
        result = calculate(num1, num2, operator);
        System.out.println("Sum 6 - 9.0 ? 2.0: " + result);
    }
//normal alu sums

        num1 = 9;
        num2 = 2;
       System.out.println(num1 + num2);

class sums {

    public static void main (strings[] args) {

        int x = 8;
        int y = 3;

        result = x + y;

        System.out.println(result);
    }

