// Volume of earth
public class q7 {
    public static void main(String[] args) {
        double radiusKm = 6378;   // Radius of Earth in kilometers
        double pi = Math.PI;

        // Volume in cubic kilometers
        double volumeKm = (4.0 / 3.0) * pi * Math.pow(radiusKm, 3);

        // Convert cubic kilometers to cubic miles
        // 1 km = 0.621371 miles
        // So, 1 cubic km = (0.621371)^3 cubic miles
        double volumeMiles = volumeKm * Math.pow(0.621371, 3);

        System.out.println("The volume of earth in cubic kilometers is " 
                           + volumeKm + 
                           " and cubic miles is " + volumeMiles);
    }
}
