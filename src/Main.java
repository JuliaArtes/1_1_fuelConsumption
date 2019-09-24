

public class Main {
    public static void main(String[] args) {
        int distanceKm = 100; //distance over which fuel consumption will be set
        float fuelConsumptionAtADist = 145.8f; // enter fuel consumption
        float fuelAvailable = 125.9f; //enter the available fuel volume
        float allowableDistance = distanceKm * fuelConsumptionAtADist / fuelAvailable;
        System.out.println(allowableDistance);
    }
}
