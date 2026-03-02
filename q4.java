// Program to calculate total distance and total time of travel

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter name: ");
        String name = sc.nextLine();

        System.out.print("Enter from city: ");
        String fromCity = sc.nextLine();

        System.out.print("Enter via city: ");
        String viaCity = sc.nextLine();

        System.out.print("Enter to city: ");
        String toCity = sc.nextLine();

        System.out.print("Enter distance from city to via city (km): ");
        double fromToVia = sc.nextDouble();

        System.out.print("Enter distance from via city to final city (km): ");
        double viaToFinalCity = sc.nextDouble();

        System.out.print("Enter time from city to via city (minutes): ");
        double timeFromToVia = sc.nextDouble();

        System.out.print("Enter time from via city to final city (minutes): ");
        double timeViaToFinalCity = sc.nextDouble();

        double totalDistance = fromToVia + viaToFinalCity;
        double totalTime = timeFromToVia + timeViaToFinalCity;

        System.out.println("The Total Distance travelled by " + name +
                           " from " + fromCity + " to " + toCity +
                           " via " + viaCity + " is " + totalDistance +
                           " km and the Total Time taken is " + totalTime + " minutes");

        sc.close();
    }
}
