package vehicle;

public class VehicleTest {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle(80,"Blue","Tesla model 3");
        Vehicle vehicle2 = new Vehicle(74,"Red","Tesla Model S");

        vehicle1.carInfo();
        vehicle2.carInfo();

    }
}
