// Basic Calculator Program

import java.util.Scanner;

public class q1 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        float number1 = sc.nextFloat();
        
        System.out.print("Enter second number: ");
        float number2 = sc.nextFloat();

        float addition = number1 + number2;
        float subtraction = number1 - number2;
        float multiplication = number1 * number2;

        float division;
        if (number2 != 0) {
            division = number1 / number2;
        } else {
            System.out.println("Division by zero is not allowed.");
            sc.close();
            return;
        }
        
        System.out.println("\nThe addition, subtraction, multiplication, and division value of 2 numbers "
                + number1 + " and " + number2 + " is "
                + addition + ", " + subtraction + ", "
                + multiplication + ", and " + division);
        
        sc.close();
    }
}
