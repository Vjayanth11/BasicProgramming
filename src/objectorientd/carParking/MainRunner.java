package objectorientd.carParking;

public class MainRunner {
    public static void main(String[] args) {
        Parking parking = new Parking(5, 100, 50, 150);

        parking.parkVehicle("tesla", "car", 101);
        parking.parkVehicle("RoyalEnfield", "bike", 102);
        parking.parkVehicle("ashok leyland", "truck", 103);
        parking.parkVehicle("benz", "car", 1244);
        parking.showAvailableSlots();
        parking.showRevenue();
        parking.displayParkedVehicles();
    }
}

