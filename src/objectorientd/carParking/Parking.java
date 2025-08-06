package objectorientd.carParking;

public class Parking extends Vehicle {

    private int totalSlots;
    private int availableSlots;
    private int carPrice;
    private int bikePrice;
    private int truckPrice;
    private int revenue;
    private Vehicle[] vehicles;
    private int parkedCount = 0;

    public Parking(int totalSlots, int carPrice, int bikePrice, int truckPrice) {
        super("", "", 0); 
        this.totalSlots = totalSlots;
        this.availableSlots = totalSlots;
        this.carPrice = carPrice;
        this.bikePrice = bikePrice;
        this.truckPrice = truckPrice;
        this.revenue = 0;
        this.vehicles = new Vehicle[totalSlots];
    }

    public void parkVehicle(String vehicleName, String vehicleType, int vehicleNumber) {
        if (availableSlots > 0) {
            Vehicle v = new Vehicle(vehicleName, vehicleType, vehicleNumber);
            vehicles[parkedCount] = v;
            parkedCount++;
            availableSlots--;

            
            if (vehicleType.equalsIgnoreCase("car")) {
                revenue += carPrice;
            } else if (vehicleType.equalsIgnoreCase("truck")) {
                revenue += truckPrice;
            } else if (vehicleType.equalsIgnoreCase("bike")) {
                revenue += bikePrice;
            }

            System.out.println("Vehicle parked successfully.");
        } else {
            System.out.println("Parking is full. Cannot park the vehicle.");
        }
    }

    public void showRevenue() {
        System.out.println("Total Revenue: " + revenue);
    }

    public void showAvailableSlots() {
        System.out.println("Available Slots: " + availableSlots + "/" + totalSlots);
    }

    public void displayParkedVehicles() {
        System.out.println("Parked Vehicles:");
        for (int i = 0; i < parkedCount; i++) {
            System.out.println(vehicles[i].vehicleType + " - " + vehicles[i].vehicleName + " - " + vehicles[i].vehicleNumber);
        }
    }
}
