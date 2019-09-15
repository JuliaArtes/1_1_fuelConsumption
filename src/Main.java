// Юлия Артес д/з 1_1, расчет расхода топлива

public class Main {
    public static void main(String[] args) {
        int distanceKm = 100; // расстояние, на которое будет задан расход топлива
        float fuelConsumptionAtADist = 145.8f; // ввести расход топлива
        float fuelAvailable = 125.9f; //ввести имеющийся объем топлива
        float allowableDistance = distanceKm * fuelConsumptionAtADist / fuelAvailable;
        System.out.println(allowableDistance);
    }
}
