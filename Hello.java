class hello {
    public static void main (String b[])
    {
        int ankit = 9;
        double myInt = ankit;

        System.out.println(ankit);
        System.out.println(myInt);
    }
}
// java is basicaaly run in oops concept oops designed as object oriente programming system
class Hello

{
   public static void main (String a[])
   {
    //literals
     char c = 'c';
     c++;
     System.out.println(c);


   }
     
}

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
        }
    }
}
