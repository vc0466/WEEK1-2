// Program to calculate quotient and remainder of two numbers

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int number2 = sc.nextInt();

        if (number2 == 0) {
            System.out.println("Division by zero is not allowed.");
        } else {
            int quotient = number1 / number2;     // Calculate quotient
            int remainder = number1 % number2;    // Calculate remainder

            System.out.println("The Quotient is " + quotient +
                               " and Reminder is " + remainder +
                               " of two number " + number1 +
                               " and " + number2);
        }

        sc.close();
    }
}
