package objectorientation.vehicletollmanagementsystem;

class Truck extends Vehicle {
    public Truck(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    public int getTollAmount() {
        return 50 * getStayDuration();
    }
}
