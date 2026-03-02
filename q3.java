// Program to find the side of a square using its perimeter

import java.util.Scanner;

public class q3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the perimeter of the square: ");
        float perimeter = sc.nextFloat();

        float side = perimeter / 4;   // Calculate side from perimeter

        System.out.println("The length of the side is " + side +
                           " whose perimeter is " + perimeter);

        sc.close();
    }
}
