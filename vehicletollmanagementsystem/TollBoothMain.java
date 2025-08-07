package objectorientation.vehicletollmanagementsystem;

public class TollBoothMain {
    public static void main(String[] args) {
        Vehicle entryOne = new Car("MH12XY3456", 2);
        Vehicle entryTwo = new Bike("TN09GH6789", 1);
        Vehicle entryThree = new Truck("KA05TR1122", 4);

        printReceipt(entryOne);
        printReceipt(entryTwo);
        printReceipt(entryThree);
    }

    private static void printReceipt(Vehicle vehicle) {
        String type = vehicle.getClass().getSimpleName();
        int toll = vehicle.getTollAmount();
        String plate = vehicle.getPlateNumber();

        System.out.println("---- Toll Receipt ----");
        System.out.println("Vehicle Type : " + type);
        System.out.println("Plate Number : " + plate);
        System.out.println("Duration     : " + vehicle.getStayDuration() + " hrs");
        System.out.println("Amount Paid  : " + toll);
        System.out.println("-----------------------\n");
    }
}

