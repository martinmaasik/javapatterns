public class MotorCycle extends Vehicle {
    public MotorCycle(FuelType fuelType) {
        super(fuelType);
    }

    @Override
    public void tankUp() {
        System.out.print("Motorcycle's tank is filled with");
        fuelType.tankUp();
        System.out.println(p);
    }
}
