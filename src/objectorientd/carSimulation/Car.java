package objectorientd.carSimulation;

public class Car {
    protected double speed;
    protected double fuel;
    protected double distanceTraveled;

    public Car(double speed, double fuel) {
        this.speed = speed;
        this.fuel = fuel;
        this.distanceTraveled = 0;
    }

    public void drive(int hours) {
        double requiredFuel = hours;
        if (fuel >= requiredFuel) {
            distanceTraveled += speed * hours;
            fuel -= requiredFuel;
        } else {
            System.out.println("Not enough fuel to drive.");
        }
    }

    public void displayStatus() {
        System.out.println("Speed: " + speed);
        System.out.println("Fuel: " + fuel);
        System.out.println("Distance Traveled: " + distanceTraveled);
    }
}

