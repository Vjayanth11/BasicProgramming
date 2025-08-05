package objectorientd.carSimulation;

public class MainRunner {
    public static void main(String[] args) {
        Car petrolCar = new Car(60, 10);
        ElectricCar electricCar = new ElectricCar(80, 100);

        petrolCar.drive(5);
        petrolCar.displayStatus();

        System.out.println();

        electricCar.drive(3);
        electricCar.displayStatus();
    }
}

