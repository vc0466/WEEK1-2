// Program to convert distance from feet to yards and miles

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance in feet: ");
        float distanceInFeet = sc.nextFloat();

        float yards = distanceInFeet / 3;          // Convert feet to yards
        float miles = yards / 1760;                // Convert yards to miles

        System.out.println("The distance in yards is " + yards +
                           " while the distance in miles is " + miles);

        sc.close();
    }
}
