package objectorientation.vehicletollmanagementsystem;

class Bike extends Vehicle {
    public Bike(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    public int getTollAmount() {
        return 10 * getStayDuration();
    }
}
