package objectorientation.vehicletollmanagementsystem;

class Car extends Vehicle {
    public Car(String plateNumber, int stayDuration) {
        super(plateNumber, stayDuration);
    }

    public int getTollAmount() {
        return 20 * getStayDuration();
    }
}
