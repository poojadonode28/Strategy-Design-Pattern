import WithStrategyPattern.OffRoadVehicle;
import WithStrategyPattern.PassengerVehicle;
import WithStrategyPattern.Vehicle;

public class Main {
    public static void main(String[] args) {

        Vehicle vehicle1 = new OffRoadVehicle();
        vehicle1.drive();
        Vehicle vehicle2 = new PassengerVehicle();
        vehicle2.drive();


    }
}