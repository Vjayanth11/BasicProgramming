package objectorientd.carSimulation;

public class ElectricCar extends Car {
    public ElectricCar(double speed, double batteryPercentage) {
        super(speed, batteryPercentage);
    }

    @Override
    public void drive(int hours) {
        double requiredBattery = hours * 2;
        if (fuel >= requiredBattery) {
            distanceTraveled += speed * hours;
            fuel -= requiredBattery;
        } else {
            System.out.println("Not enough battery to drive.");
        }
    }

    @Override
    public void displayStatus() {
        System.out.println("Electric Car");
        System.out.println("Speed: " + speed);
        System.out.println("Battery: " + fuel);
        System.out.println("Distance Traveled: " + distanceTraveled);
    }
}

