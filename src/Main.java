

public class Main {
    public static void main(String[] args) {
        int distanceKm = 100;
        float fuelConsumptionAtADist = 145.8f;
        float fuelAvailable = 125.9f;
        int allowableDistanceKm = (int) (distanceKm * fuelConsumptionAtADist / fuelAvailable);
        System.out.println(allowableDistanceKm+"км");
    }
}
