package objectorientation.vehicletollmanagementsystem;

abstract class Vehicle {
    private String plateNumber;
    private int stayDuration;

    public Vehicle(String plateNumber, int stayDuration) {
        this.plateNumber = plateNumber;
        this.stayDuration = stayDuration;
    }

    public abstract int getTollAmount();

    public int getStayDuration() {
        return stayDuration;
    }

    public String getPlateNumber() {
        return plateNumber;
    }
}

