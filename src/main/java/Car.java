public class Car extends Vehicle {
    public Car(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void tankUp() {
        System.out.print("Car's tank is filled with");
        fuelType.tankUp();
        System.out.println();
    }
}
